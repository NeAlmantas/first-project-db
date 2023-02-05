package com.example.firstprojectdb.controllers;

import com.example.firstprojectdb.model.Darbuotojas;
import com.example.firstprojectdb.services.AddressService;
import com.example.firstprojectdb.validationUtils.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.Assert;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Objects;

@Controller
@SessionAttributes({"worker"})
public class MyController {

    @Autowired
    private AddressService addressService;//todo neveikia testas su situ!!

    @GetMapping("/thymeleaf")
    public String getThymeLeafView(Model model,
                                   @ModelAttribute("worker") Darbuotojas worker,
                                   SessionStatus status) {
        System.out.println(worker + "" + status);
        addAttributesToModel(model);
        Validator.validateAttributes(model, "labas", "darbuotojas");
        return "first_page";
    }

    @GetMapping("/free/access")
    public String getFreeAccessPage(Model model, Authentication authentication) {
        addressService.createNewAddress();
//        UserDetails userPrincipal = Objects.requireNonNull((UserDetails) authentication.getPrincipal());
        addAttributesToModel(model);
        return "free_access_page";
    }

    @GetMapping("/login1")
    public String getMyLogin(Model model) {
        return "my_login";
    }

    @PostMapping("/createObject")
    public String createDarbuotojas(@Valid Darbuotojas darbuotojas,
                                    BindingResult result,
                                    Model model,
                                    SessionStatus status,
                                    RedirectAttributes redirectAttributes) {
        System.out.println("pasiekeme " + darbuotojas);
//        redirectAttributes.addAttribute("test", "tester1");
        return "redirect:/thymeleaf?test=tester1";
    }

    @ModelAttribute("worker")
    public Darbuotojas getWorker() {//kinda hacky way to fix things
        return new Darbuotojas();
    }

    private void addAttributesToModel(Model modelioNuoroda) {
        modelioNuoroda.addAttribute("labas", modelioNuoroda);
        modelioNuoroda.addAttribute("darbuotojas", new Darbuotojas());
    }

}
