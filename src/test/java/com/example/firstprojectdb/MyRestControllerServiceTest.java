package com.example.firstprojectdb;

import com.example.firstprojectdb.model.Darbuotojas;
import com.example.firstprojectdb.repo.DarbuotojasRepo;
import com.example.firstprojectdb.services.MyRestControllerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.Objects;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.ArgumentMatchers.any;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyRestControllerServiceTest {

    @Autowired
    private MyRestControllerService myRestControllerService;

    @MockBean
    private DarbuotojasRepo darbuotojasRepo;

    @Mock
    private Darbuotojas darbuotojas1;
    @Mock
    private Darbuotojas darbuotojas2;

    @Test
    public void testMethod() {

        Mockito.when(darbuotojasRepo.findAll())
                .thenReturn(Arrays.asList(darbuotojas1, darbuotojas2));

        Mockito.when(darbuotojasRepo.getReferenceById(any()))
                .thenReturn(darbuotojas1);

        assertThat("test", myRestControllerService.getAllDarbuotojai().contains(darbuotojas1));

        assertThat("test2", Objects.equals(myRestControllerService.getById("123L"), darbuotojas1));

    }
}
