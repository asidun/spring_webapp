package com.webapp.controller;

import com.webapp.entity.Hobby;
import com.webapp.entity.SimpleDimaQue;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hobby")
public class HobbiesController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView hobbies() {
        return new ModelAndView("hobby", "command", new Hobby());
    }

    @RequestMapping(value = "/addHobby", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("/") Hobby hobby, ModelMap model)  {
        model.addAttribute("name", hobby.getName());
        model.addAttribute("description", hobby.getDescription());

        return "hobbyResult";
    }

}
