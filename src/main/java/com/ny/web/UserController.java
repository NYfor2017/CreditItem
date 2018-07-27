package com.ny.web;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import com.ny.entity.Airline;
import com.ny.entity.User;
import com.ny.entity.Workunit;
import com.ny.service.UserService;
/**
 * �û��Ĵ�����
 * ���������������Restful���Ŷ��
 * @author N.Y
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	//����kaptchaʵ�ֵõ���֤�빦��,����ò���Maven����jar��
	private Producer kaptchaProducer = null;
	@Autowired
	public void setCaptchaProducer(Producer kaptchaProducer) {
		this.kaptchaProducer = kaptchaProducer;
	}
	
	@Autowired
	private UserService userService;
	
	/**
	 * ��ʾȫ���û���Ϣ
	 * @param model
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/list",method=RequestMethod.GET)
	private List<User> list(Model model) {
		List<User> list = userService.getUserList();
		model.addAttribute("list", list);
		// list.jsp + model = ModelAndView
		return list;// WEB-INF/jsp/"list".jsp
		//ֱ����listҳ����ʾȫ���û�����Ϣ�����Ը�Admin���á�
		//�ѵ㣬����Ľӿڲ�����user,����AdminҪ���������������Ҫ���ӿڲ�����Ϊuser����
	}
	
	
	/**
	 * ��½�����
	 * @return
	 */
	@RequestMapping(value="/in",method=RequestMethod.GET)
	private String in() {
		return "/login";
	}
	
	/**
	 * ��½�Ĵ�����
	 * @param user
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	@ResponseBody
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public Map<String, String> login(@RequestBody User user,HttpServletResponse response, HttpServletRequest request) throws UnsupportedEncodingException{
		//��Ϊ�ڴ�����֤���ʱ����Ѿ�Ԥ�ȱ�������֤���ı�������ֻҪ��ȡ�����ͺ�
		String kaptchaCheck = (String) request.getSession().getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
		//��ȡҳ�洫�����֤��
		String kaptchaReceive = (String) request.getParameter("user_input_verifyCode");
		Map<String,String> resultMap = new HashMap<String, String>();
		//�ȶ���һ������������Ԥ�ȶ���ʧ��
		String s = "fail";
		if(kaptchaCheck!=null&&(kaptchaCheck.toUpperCase()).equals(kaptchaReceive.toUpperCase())) {
			User user1 = userService.loginUser(user.getUsername(), user.getPassword());
			List<User> list = userService.getUserList();
			for(User u:list) {
				if(u.getUsername().equals(user.getUsername())&&u.getPassword().equals(user.getPassword())) {
					//���ѡ���˼�ס���룬check��ֵΪon�����ûѡ��check��ֵΪnull
					//����Cookie�������û����ݣ��´��û��ٴ�loginҳ��Ͳ���Ҫ�����˺ź�������
					if(request.getParameter("check")!=null)
						addCookie(user.getUsername(), user.getPassword(), response, request);
					//�������ƥ���˾ͷ���success
					s = "success";
				}
			}
		}
		//������ݲ�ƥ�䣬��ֱ�ӽ���Ϣװ��map��
		resultMap.put("result", s);
		return resultMap;
	}
	
	/**
	 * ע������
	 * @return
	 */
	@RequestMapping(value="/inn",method=RequestMethod.GET)
	private String inn() {
		return "/signIn";
	}
	
	
	/**
	 * ע��Ĵ�����
	 * @param username
	 * @param password
	 * @param model
	 */
	@RequestMapping(value="/signIn",method=RequestMethod.POST)
	public String add(@RequestParam("username")String username, @RequestParam("password")String password){
		int user = userService.signInUser(username, password);
		return "/login";  //ע��ɹ�֮�����ֱ��ȥ��½ҳ����е�¼
		
	}
	
	/**
	 * ÿ��user_id���п����ж��������Ϣ
	 * ÿ��������Ϣ���ܶ�Ӧ�Ŷ��user
	 * ���������User��������ȡ�����еĺ�����Ϣ����List��װ
	 * Ȼ���Listչ��������ÿ��Airline����Ϣ
	 * @param user_id
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/getUserAirline",method=RequestMethod.GET)
	private List<Airline> listAirline(@RequestParam("user_id")int user_id,Model model){
		User u = userService.getUserAirline(user_id);
		List<Airline> li = u.getAir(); 
		model.addAttribute("li", li);
		return li;
	}
	
	/**
	 * ÿ��user_id���п����ж��������ҵ��Ϣ
	 * ÿ����ҵ��Ϣ���ܶ�Ӧ�Ŷ��user
	 * ���������User��������ȡ�����еķ�����Ϣ����List��װ
	 * Ȼ���Listչ��������ÿ��Workunit����Ϣ
	 * @param user_id
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/getUserWorkunit",method=RequestMethod.GET)
	private List<Workunit> listWorkunit(@RequestParam("user_id")int user_id,Model model){
		User u = userService.getUserAirline(user_id);
		List<Workunit> li = u.getAir();  
		model.addAttribute("li", li);
		return li;
	}
	
	
	@RequestMapping(value="/update",method=RequestMethod.POST)
	private String update(@RequestParam("username")String username, @RequestParam("password")String password, @RequestParam("member")boolean member, @RequestParam("realName")String realName,
			@RequestParam("gender")boolean gender, @RequestParam("idcard")String idcard, @RequestParam("phone_number")String phone_number, @RequestParam("address_original")String address_original,
			@RequestParam("address_living_1")String address_living_1, @RequestParam("address_living_2")String address_living_2, @RequestParam(required=true)final MultipartFile file, HttpServletRequest request) throws IllegalStateException, IOException {
		String filePath = "D:\\CreditItem\\pic";//����ͼƬ��·��
		String originalFilename = file.getOriginalFilename();//��ȡԭʼͼƬ����չ��
		String photo = UUID.randomUUID()+originalFilename;//�µ��ļ�����
		File targetFile = new File(filePath,photo);//�ѱ����ļ��ϴ�����װ�ϴ��ļ�λ�õ�ȫ·��
		file.transferTo(targetFile);
		int u = userService.updateUser(username, password, member, realName, gender, idcard, phone_number, address_original, address_living_1, address_living_2, photo);
		if(u>-1)
			return "/user";
		return "/failure";
	}
	
	/**
	 * ���Cookie
	 * @param userName
	 * @param password
	 * @param response
	 * @param request
	 * @throws UnsupportedEncodingException
	 */
	public static void addCookie(String userName,String password,HttpServletResponse response, HttpServletRequest request) throws UnsupportedEncodingException{
    	//����cookie
    	Cookie nameCookie = new Cookie(userName, password);
    	nameCookie.setPath(request.getContextPath()+"/");//����cookie·��
    	//����cookie�����ʱ�� ��λ����
    	nameCookie.setMaxAge(7*24*60*60);
    	//��cookie��ӵ���Ӧ
    	response.addCookie(nameCookie);	    	
	}

	/**
	 * �������ı��������˺�֮����Ի�ȡ��Ӧ������
	 * @param userName
	 * @param request
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/getCookie",method=RequestMethod.POST)
	public Map<String, String> initCookie(String userName, HttpServletRequest request){
		Cookie[] cookie = request.getCookies();
		Map<String, String> map = new HashMap<String, String>();
		for(Cookie c : cookie) {
			if(c.getName().equals(userName)) {
				String password = c.getValue();
				map.put("userName", userName);
				map.put("password", password);
				return map;
			}
		}
		return null;
	}
	
	/**
	 * ����Kaptcha�����������֤��
	 * @param request
	 * @param response
	 * @return
	 */
    @RequestMapping("/kaptcha")  
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response){  
        response.setDateHeader("Expires",0);  
        response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");  
        response.addHeader("Cache-Control", "post-check=0, pre-check=0");  
        response.setHeader("Pragma", "no-cache");  
        response.setContentType("image/jpeg");  
        String capText = kaptchaProducer.createText();
        request.getSession().setAttribute(Constants.KAPTCHA_SESSION_KEY, capText);
        BufferedImage bi = kaptchaProducer.createImage(capText);  
        ServletOutputStream out = null;
        try {
            out = response.getOutputStream();
            ImageIO.write(bi, "jpg", out);
        } catch (IOException e) {
            e.printStackTrace();
        }  

        try {  
            out.flush();  
        } catch (IOException e) {
            e.printStackTrace();
        } finally {  
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }  
        }  
        return null;  
    } 
}

