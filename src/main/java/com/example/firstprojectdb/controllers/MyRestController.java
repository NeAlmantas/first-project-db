package com.example.firstprojectdb.controllers;

import com.example.firstprojectdb.model.Darbuotojas;
import com.example.firstprojectdb.services.DarbuotojasService;
import com.example.firstprojectdb.services.MyRestControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MyRestController {

    private final MyRestControllerService service;
    private final DarbuotojasService darbuotojasService;

    @Autowired
    public MyRestController(MyRestControllerService service, DarbuotojasService darbuotojasService) { //TODO KONSTRUKTORIUS!!!!!
            this.service = service;
            this.darbuotojasService = darbuotojasService;
    }

    @GetMapping("/all")
    public List<Darbuotojas> getAll() {
//        return service.getAllDarbuotojai();
        System.out.println("pasiekeme getAll() metoda");
        return new ArrayList<>();
    }

}
