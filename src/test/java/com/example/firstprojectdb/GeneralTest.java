package com.example.firstprojectdb;

import com.example.firstprojectdb.model.Darbuotojas;
import com.example.firstprojectdb.repo.DarbuotojasRepo;
import com.example.firstprojectdb.services.MyRestControllerService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GeneralTest {

    @Autowired
    private MyRestControllerService myRestControllerService;

    @MockBean
    private DarbuotojasRepo darbuotojasRepo;
    @Mock
    private Darbuotojas darbuotojas1;

    @Before
    public void setup() {

    }

    @Test
    public void getByDarbuotojoIdTest() {
        when(darbuotojasRepo.getReferenceById("manoId"))
                .thenReturn(darbuotojas1);
        assertEquals(myRestControllerService.getById("manoId"), darbuotojas1);

    }

}
