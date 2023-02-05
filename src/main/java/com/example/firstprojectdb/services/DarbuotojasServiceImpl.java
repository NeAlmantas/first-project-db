package com.example.firstprojectdb.services;

import com.example.firstprojectdb.model.Darbuotojas;
import com.example.firstprojectdb.repo.DarbuotojasRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component("darbuotojasService")
@RequiredArgsConstructor
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
