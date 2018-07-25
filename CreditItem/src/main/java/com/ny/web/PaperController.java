package com.ny.web;

import java.util.List;

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

import com.ny.entity.Paper;
import com.ny.service.PaperService;

/**
 * Paper的处理器
 * @author N.Y
 *
 */
@Controller
@RequestMapping("")
public class PaperController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PaperService paperService;
	
	/**
	 * 列表功能，通过user_id获取用户的所有论文
	 * @param user_id
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/paper",method=RequestMethod.GET)
	private List<Paper> list(@RequestBody int user_id,Model model){
		List<Paper> li = paperService.getOwnPaper(user_id);
		model.addAttribute("li", li);
		return li;
	}
	
	/**
	 * 添加论文
	 * @param paper_num
	 * @param paper_title
	 * @param paper_detail
	 * @param user_id
	 * @return
	 */
	@RequestMapping(value="/paper",method=RequestMethod.PUT)
	private String add(@RequestParam("paper_num")String paper_num, @RequestParam("paper_title")String paper_title,
			@RequestParam("paper_detail")String paper_detail, @RequestParam("user_id")int user_id) {
		int i = paperService.addPaper(paper_num, paper_title, paper_detail, user_id);
		if(i>-1)
			return "/paper";
		return "/failure";
	}
	
	/**
	 * 更新论文，id为paper_id
	 * @param paper_id
	 * @param paper_num
	 * @param paper_title
	 * @param paper_detail
	 * @return
	 */
	@RequestMapping(value="/paper/{id}",method=RequestMethod.POST)
	private String update(@RequestParam("paper_id")int paper_id, @RequestParam("paper_num")String paper_num, @RequestParam("paper_title")String paper_title,
			@RequestParam("paper_detail")String paper_detail) {
		int u = paperService.updatePaper(paper_id, paper_num, paper_title, paper_detail);
		if(u>-1)
			return "/paper";
		return "/failure";
	}
	
	/**
	 * 删除论文,id为paper_id
	 * @param paper_id
	 * @return
	 */
	@RequestMapping(value="/paper/{id}",method=RequestMethod.DELETE)
	private String delete(@RequestParam("paper_int")int paper_id) {
		int d = paperService.deletePaper(paper_id);
		if(d>-1)
			return "/paper";
		return "/failure";
	}
	
}
