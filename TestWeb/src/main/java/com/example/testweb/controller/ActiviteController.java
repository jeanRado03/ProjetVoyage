package com.example.testweb.controller;

import com.example.testweb.model.Activite;
import com.example.testweb.model.Employee;
import com.example.testweb.service.ActiviteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ActiviteController {
    @Autowired
    ActiviteService activiteService;

    @GetMapping("/activite")
    public String home(Model model) {
        Activite activite = new Activite();
        model.addAttribute("activites", activite);
        return "activite";
    }

    @PostMapping("/saveActivite")
    public ModelAndView saveActivite(@ModelAttribute("activites") Activite activite) {
        activiteService.saveActivite(activite);
        return new ModelAndView("redirect:/activite");
    }

}
