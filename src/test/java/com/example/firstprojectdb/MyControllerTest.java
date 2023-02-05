package com.example.firstprojectdb;

import com.example.firstprojectdb.controllers.MyController;
import com.example.firstprojectdb.model.Darbuotojas;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.hamcrest.MatcherAssert.assertThat;

@WebMvcTest(MyController.class)
public class MyControllerTest {

    private static final String EXPECTED_CONTENT = "Sis puslapis nereikalauja autentikacijos";

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void TestFirstPage() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/free/access"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("free_access_page"))
                .andExpect(MockMvcResultMatchers.model().attributeExists("darbuotojas"));
    }

    @Test
    public void TestFirstPageContent() throws Exception {
        ResultActions result = mockMvc.perform(MockMvcRequestBuilders.get("/free/access"));
        MvcResult mvcResult = result.andExpect(MockMvcResultMatchers.status().isOk()).andReturn();
        String jsonResponse = mvcResult.getResponse().getContentAsString();
        assertThat("Test failed! Page doesnt not contain text. Expected text: " + EXPECTED_CONTENT, jsonResponse.contains(EXPECTED_CONTENT));
    }

}
