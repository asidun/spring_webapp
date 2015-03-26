package com.webapp.controller;

import com.webapp.entity.SimpleDimaQue;
import com.webapp.service.SimpleDimaQueSvc;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.inject.Inject;

@Controller
@RequestMapping("/questionnaire/simpleDimaQue")
public class SimpleDimaQueController {

    @Inject
    private SimpleDimaQueSvc simpleDimaQueSvc;

    @RequestMapping(value = "/submit", method = RequestMethod.POST)
    public String submitQue(@ModelAttribute("/") SimpleDimaQue simpleDimaQue, ModelMap modelMap)  {
        simpleDimaQueSvc.saveQuestionnaire(simpleDimaQue);
        modelMap.addAttribute("likesSite", simpleDimaQue.getLikesSite());
        return "redirect:/submittedSuccessfully";
    }

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public ModelAndView submitQue()  {
        return new ModelAndView("simpleDimaQue", "command", new SimpleDimaQue());
    }
}
