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
 * 用户的处理器
 * 这个处理器不采用Restful风格哦！
 * @author N.Y
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	//导入kaptcha实现得到验证码功能,这个用不是Maven配置jar包
	private Producer kaptchaProducer = null;
	@Autowired
	public void setCaptchaProducer(Producer kaptchaProducer) {
		this.kaptchaProducer = kaptchaProducer;
	}
	
	@Autowired
	private UserService userService;
	
	/**
	 * 显示全部用户信息
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
		//直接在list页面显示全部用户的信息，可以给Admin调用。
		//难点，这个的接口参数是user,所以Admin要调用这个方法，需要将接口参数改为user才行
	}
	
	
	/**
	 * 登陆的入口
	 * @return
	 */
	@RequestMapping(value="/in",method=RequestMethod.GET)
	private String in() {
		return "/login";
	}
	
	/**
	 * 登陆的处理器
	 * @param user
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	@ResponseBody
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public Map<String, String> login(@RequestBody User user,HttpServletResponse response, HttpServletRequest request) throws UnsupportedEncodingException{
		//因为在创建验证码的时候就已经预先保存了验证码文本，所以只要提取出来就好
		String kaptchaCheck = (String) request.getSession().getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
		//获取页面传入的验证码
		String kaptchaReceive = (String) request.getParameter("user_input_verifyCode");
		Map<String,String> resultMap = new HashMap<String, String>();
		//先定义一个参数变量，预先定义失败
		String s = "fail";
		if(kaptchaCheck!=null&&(kaptchaCheck.toUpperCase()).equals(kaptchaReceive.toUpperCase())) {
			User user1 = userService.loginUser(user.getUsername(), user.getPassword());
			List<User> list = userService.getUserList();
			for(User u:list) {
				if(u.getUsername().equals(user.getUsername())&&u.getPassword().equals(user.getPassword())) {
					//如果选中了记住密码，check的值为on，如果没选中check的值为null
					//加入Cookie，保存用户数据，下次用户再打开login页面就不需要输入账号和密码了
					if(request.getParameter("check")!=null)
						addCookie(user.getUsername(), user.getPassword(), response, request);
					//如果数据匹配了就返回success
					s = "success";
				}
			}
		}
		//如果数据不匹配，就直接将信息装入map中
		resultMap.put("result", s);
		return resultMap;
	}
	
	/**
	 * 注册的入口
	 * @return
	 */
	@RequestMapping(value="/inn",method=RequestMethod.GET)
	private String inn() {
		return "/signIn";
	}
	
	
	/**
	 * 注册的处理器
	 * @param username
	 * @param password
	 * @param model
	 */
	@RequestMapping(value="/signIn",method=RequestMethod.POST)
	public String add(@RequestParam("username")String username, @RequestParam("password")String password){
		int user = userService.signInUser(username, password);
		return "/login";  //注册成功之后可以直接去登陆页面进行登录
		
	}
	
	/**
	 * 每个user_id中有可能有多个航班信息
	 * 每个航班信息可能对应着多个user
	 * 所以这里的User是用来获取他所有的航班信息，用List来装
	 * 然后把List展开来就是每个Airline的信息
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
	 * 每个user_id中有可能有多个法人企业信息
	 * 每个企业信息可能对应着多个user
	 * 所以这里的User是用来获取他所有的法人信息，用List来装
	 * 然后把List展开来就是每个Workunit的信息
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
		String filePath = "D:\\CreditItem\\pic";//保存图片的路径
		String originalFilename = file.getOriginalFilename();//获取原始图片的扩展名
		String photo = UUID.randomUUID()+originalFilename;//新的文件名字
		File targetFile = new File(filePath,photo);//把本地文件上传到封装上传文件位置的全路径
		file.transferTo(targetFile);
		int u = userService.updateUser(username, password, member, realName, gender, idcard, phone_number, address_original, address_living_1, address_living_2, photo);
		if(u>-1)
			return "/user";
		return "/failure";
	}
	
	/**
	 * 添加Cookie
	 * @param userName
	 * @param password
	 * @param response
	 * @param request
	 * @throws UnsupportedEncodingException
	 */
	public static void addCookie(String userName,String password,HttpServletResponse response, HttpServletRequest request) throws UnsupportedEncodingException{
    	//创建cookie
    	Cookie nameCookie = new Cookie(userName, password);
    	nameCookie.setPath(request.getContextPath()+"/");//设置cookie路径
    	//设置cookie保存的时间 单位：秒
    	nameCookie.setMaxAge(7*24*60*60);
    	//将cookie添加到响应
    	response.addCookie(nameCookie);	    	
	}

	/**
	 * 用于在文本框输入账号之后可以获取对应的密码
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
	 * 利用Kaptcha插件来生成验证码
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

