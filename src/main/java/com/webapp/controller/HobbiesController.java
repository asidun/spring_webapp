package com.webapp.controller;

import com.webapp.entity.Hobby;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HobbiesController {

    @RequestMapping(value = "/questioner/Hobby", method = RequestMethod.GET)
    public String getHobbies(Model model)  {
        model.addAttribute(new Hobby());
        return "hobbies";
    }

    @RequestMapping(value = "/questioner/Hobby", method = RequestMethod.GET)
    public String addHobby(Hobby hobby)  {
        return "hobbies";
    }

}
