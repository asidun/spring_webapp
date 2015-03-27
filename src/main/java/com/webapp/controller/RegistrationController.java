package com.webapp.controller;

import com.webapp.entity.Person;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Component
@RequestMapping("/registration")
public class RegistrationController {

    //TODO implement
    @RequestMapping(method = GET)
    public ModelAndView getRegistrationForm()  {
        return new ModelAndView("registration", "command", new Person());
    }

    //TODO implement
    @RequestMapping(method = POST)
    public String registerUser()  {
        return "index";
    }
}
