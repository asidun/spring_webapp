package com.webapp.controller;

import com.webapp.entity.User;
import com.webapp.service.UserSvc;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@RequestMapping("/registration")
public class RegistrationController {

    private final UserSvc userSvc;

    public RegistrationController(final UserSvc userSvc) {
        this.userSvc = userSvc;
    }

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        simpleDateFormat.setLenient(false);
        webDataBinder.registerCustomEditor(Date.class, "dateOfBirth", new CustomDateEditor(simpleDateFormat, false));
    }

    @RequestMapping(method = RequestMethod.GET)
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
        } else {
            userSvc.save(user);
            return "redirect:/hobby";
        }
    }
}
