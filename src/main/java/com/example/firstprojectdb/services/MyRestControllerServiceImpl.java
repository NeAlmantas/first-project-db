package com.example.firstprojectdb.services;

import com.example.firstprojectdb.model.Darbuotojas;
import com.example.firstprojectdb.repo.DarbuotojasRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyRestControllerServiceImpl implements MyRestControllerService {

    private static int RANDOM_CODE = 1;

    private final DarbuotojasRepo darbuotojasRepo;

    @Autowired
    public MyRestControllerServiceImpl(DarbuotojasRepo darbuotojasRepo) {
        this.darbuotojasRepo = darbuotojasRepo;
    }

    @Override
    public List<Darbuotojas> getAllDarbuotojai() {
        return darbuotojasRepo.findAll();
    }

}
