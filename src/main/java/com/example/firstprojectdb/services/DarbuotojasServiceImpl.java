package com.example.firstprojectdb.services;

import com.example.firstprojectdb.model.Darbuotojas;
import org.springframework.stereotype.Component;

@Component("darbuotojasService")
public class DarbuotojasServiceImpl implements DarbuotojasService {

    @Override
    public void printSomething() {
        System.out.println("pasiekeme metoda is klases: " + this.getClass().getSimpleName());
    }

    @Override
    public void createDarbuotojas() {
        Darbuotojas newDarbuotojas = new Darbuotojas();
        //TODO SUKURTI DARBUOTOJAS OBJEKTA
    }
}

//@Configuration
//public class ConfigurationSetup {
//
//    @Bean
//    public MyRestControllerService myRestControllerService() {
//        MyRestControllerService restControllerService = new MyRestControllerServiceImpl();
//        return restControllerService;
//    }
//}
