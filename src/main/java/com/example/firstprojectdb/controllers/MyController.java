package com.example.firstprojectdb.controllers;

import com.example.firstprojectdb.model.Darbuotojas;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/thymeleaf")
    public String getThymeLeafView(Model model) {
//        model.addAttribute("darbuotojas", new Darbuotojas());
        return "first_page";
    }

//    @GetMapping("/getStuff")
//
//    @GetMapping("/books")








//return new ModelAndView("redirect:/create"); @ModelAttribute Darbuotojas darbuotojas, Model model

    //@ModelAttribute Darbuotojas darbuotojas, Model model
//    <form action="#" th:action="@{/create}" th:object="${darbuotojas}" method="post">
//    <p>kodas: <input type="text" th:field="*{asmensKodas}" /></p>
//    <p>vardas: <input type="text" th:field="*{vardas}" /></p>
//    <p>pavarde: <input type="text" th:field="*{pavarde}" /></p>
//    <p><input type="submit" value="Submit" /> <input type="reset" value="Reset" /></p>
//</form>
}
