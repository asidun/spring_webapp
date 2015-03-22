package com.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.webapp.entity.NewsletterQue;

@Controller
@RequestMapping("/")
public class QuestionnaireController{

	@RequestMapping(value="/addNewsletterQue", method = RequestMethod.POST)
	public String addNewsletterQue(@ModelAttribute("/") NewsletterQue que, ModelMap model){
		
		model.addAttribute("userName", que.getUserName());
		model.addAttribute("address", que.getAddress());
		model.addAttribute("youLikeNewsletter", que.getYouLikeNewsletter());
		model.addAttribute("sex", que.getSex());
		
		return "aform";
		
	}
	
}
