package com.webapp.controller;

import com.webapp.entity.Hobby;
import com.webapp.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Component
@RequestMapping("/registration")
public class RegistrationController {

    @RequestMapping(method = GET)
    public String getRegistrationForm(Model model)  {
        model.addAttribute("userName", new User());
        return "registration";
    }

    @RequestMapping(value = "/registerUser", method = RequestMethod.POST)
    public String registerUser(
            @ModelAttribute("userName")
            @Valid
            User user,
            BindingResult bindingResult)  {
        if(bindingResult.hasErrors()){
            return "registration";
        }
        return "redirect:/hobby";
    }
}
