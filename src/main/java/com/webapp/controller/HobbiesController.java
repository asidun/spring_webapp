package com.webapp.controller;

import com.webapp.entity.Hobby;
import com.webapp.entity.SimpleDimaQue;
import com.webapp.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/hobby")
public class HobbiesController {

    @RequestMapping(method = RequestMethod.GET)
    public String hobbies(Model model)  {
        model.addAttribute("hobby", new Hobby());
        return "hobby";
    }

    @RequestMapping(value = "/addHobby", method = RequestMethod.POST)
    public String addStudent(
            @ModelAttribute("hobby")
            @Valid
            Hobby hobby,
            Errors errors,
            ModelMap model
            )  {

        if(errors.hasErrors()){
            return "hobby";
        }

        model.addAttribute("name", hobby.getName());
        model.addAttribute("description", hobby.getDescription());

        return "hobbyResult";
    }

}
