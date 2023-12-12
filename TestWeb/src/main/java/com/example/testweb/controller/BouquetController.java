package com.example.testweb.controller;

import com.example.testweb.model.Activite;
import com.example.testweb.model.Bouquet;
import com.example.testweb.service.BouquetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BouquetController {
    @Autowired
    BouquetService bouquetService;

    @GetMapping("/bouquet")
    public String home(Model model) {
        Bouquet bouquet = new Bouquet();
        model.addAttribute("bouquets", bouquet);
        return "bouquet";
    }

    @PostMapping("/saveBouquet")
    public ModelAndView saveBouquet(@ModelAttribute("bouquets") Bouquet bouquet) {
        bouquetService.saveBouquet(bouquet);
        return new ModelAndView("redirect:/bouquet");
    }
}
