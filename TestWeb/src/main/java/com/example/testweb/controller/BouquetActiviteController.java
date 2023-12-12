package com.example.testweb.controller;

import com.example.testweb.model.Activite;
import com.example.testweb.model.Bouquet;
import com.example.testweb.model.Bouquet_Activite;
import com.example.testweb.model.Employee;
import com.example.testweb.service.ActiviteService;
import com.example.testweb.service.BouquetActiviteService;
import com.example.testweb.service.BouquetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BouquetActiviteController {
    @Autowired
    BouquetActiviteService bouquetActiviteService;
    @Autowired
    BouquetService bouquetService;
    @Autowired
    ActiviteService activiteService;

    @GetMapping("/")
    public String home(Model model) {
        Bouquet_Activite bouquetActivite = new Bouquet_Activite();
        List<Bouquet> bouquets = bouquetService.getAllEmp();
        List<Activite> activites = activiteService.getAllActivite();
        model.addAttribute("bouquetactivites", bouquetActivite);
        model.addAttribute("bouquets", bouquets);
        model.addAttribute("activites", activites);
        return "bouquetactivite";
    }
    @GetMapping("/activites")
    public String employees(Model model) {
        List<Bouquet_Activite> activites = bouquetActiviteService.getAllActivite();
        model.addAttribute("activitelist",activites);
        return "listesactivites";
    }

    @PostMapping("/saveBouquetActivite")
    public ModelAndView saveBouquet(@ModelAttribute("bouquetactivites") Bouquet_Activite bouquetActivite) {
        bouquetActiviteService.saveBouquetActivite(bouquetActivite);
        return new ModelAndView("redirect:/");
    }
}
