package com.webapp.controller;

import com.webapp.entity.Hobby;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class HobbiesController {

    @RequestMapping(method = RequestMethod.GET)
    public String printHello(Model model) {
        model.addAttribute("message", "Hello World");
        return "index";
    }

}
