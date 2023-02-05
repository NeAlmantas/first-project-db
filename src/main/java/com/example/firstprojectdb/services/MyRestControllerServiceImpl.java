package com.example.firstprojectdb.services;

import com.example.firstprojectdb.model.Darbuotojas;
import com.example.firstprojectdb.repo.DarbuotojasRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MyRestControllerServiceImpl implements MyRestControllerService {

    private static int RANDOM_CODE = 1;

    private final DarbuotojasRepo darbuotojasRepo;

    @Override
    public List<Darbuotojas> getAllDarbuotojai() {
        return darbuotojasRepo.findAll();
    }

    @Override
    public Darbuotojas getById(String id) {
        return darbuotojasRepo.getReferenceById(id);
    }

    private void testHttpRequestDemo(HttpSession session) {
    }

    private String buildSomethingFancy() {
        return "data";
    }

}
