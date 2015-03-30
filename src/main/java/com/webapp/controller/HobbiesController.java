package com.webapp.controller;

import com.webapp.entity.Hobby;
import com.webapp.entity.SimpleDimaQue;
import com.webapp.entity.User;
import com.webapp.exception.PersonHobbyDescriptionException;
import org.apache.log4j.lf5.LogLevel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
@RequestMapping("/hobby")
public class HobbiesController {

    private static final String EMPTY_STRING = "";

    @ExceptionHandler(PersonHobbyDescriptionException.class)
    public ModelAndView handleException(PersonHobbyDescriptionException ex){
        ModelAndView model = new ModelAndView();
        model.addObject("uuid", ex.getUuid()) ;
        model.setViewName("hobbyError");
        return model;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String hobbies(
            Model model,
            @CookieValue(value = "uuid", defaultValue = EMPTY_STRING) String uuid,
            HttpServletResponse response
    ) {

        if (uuid.isEmpty()) {
            response.addCookie(new Cookie("uuid", UUID.randomUUID().toString()));
        }

        model.addAttribute("hobby", new Hobby());
        return "hobby";
    }

    @RequestMapping(value = "/addHobby", method = RequestMethod.POST)
    public String addHobby(
            @ModelAttribute("hobby")
            @Valid
            Hobby hobby,
            Errors errors,
            ModelMap model,
            @CookieValue(value = "uuid") String uuid
    ) throws PersonHobbyDescriptionException {
        if (errors.hasErrors()) {
            return "hobby";
        }
        hobby.setUuid(UUID.fromString(uuid));
        model.addAttribute("uuid", hobby.getUuid());
        model.addAttribute("name", hobby.getName());
        if(hobby.getDescription() == null || hobby.getDescription().isEmpty()){
            throw new PersonHobbyDescriptionException(uuid);
        }
        model.addAttribute("description", hobby.getDescription());

        return "hobbyResult";
    }

}
