package com.example.firstprojectdb.controllers;

import com.example.firstprojectdb.model.Darbuotojas;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {

    @GetMapping("/thymeleaf")
    public String getThymeLeafView(Model model) {
        addAttributesToModel(model);
        return "first_page";
    }

    private void addAttributesToModel(Model modelioNuoroda) {
        modelioNuoroda.addAttribute("labas", Boolean.TRUE);
        modelioNuoroda.addAttribute("darbuotojas", new Darbuotojas());
    }

    @PostMapping("/createStuffAsIWanttoSomethingElse")
    public void createDarbuotojas(Model model, @ModelAttribute Darbuotojas darbuotojas) {
        System.out.println("pasiekeme");
    }








//return new ModelAndView("redirect:/create"); @ModelAttribute Darbuotojas darbuotojas, Model model

//    @ModelAttribute Darbuotojas darbuotojas, Model model

}
