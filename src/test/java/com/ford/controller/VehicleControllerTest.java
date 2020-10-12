/*
 * Copyright (c) 2020 [Z.D. Yu](http://github.com/CTYue)
 */

package com.ford.controller;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class VehicleControllerTest {

    @Autowired
    private WebApplicationContext wac;

    @Autowired
    private MockMvc mvc;

    @Test
    void postVehicle() throws Exception
    {
        //Save test input json as file.
        // ./Ford/src/test/java/resources/post.json
        //TODO

    }

    @Test
    void getAllVehicle() throws Exception
    {
        String request = "/getVehicleInfomation/";

        mvc.perform(MockMvcRequestBuilders.get(request)
        .contentType(MediaType.APPLICATION_JSON)
        ).andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(MockMvcResultMatchers.jsonPath("$._id").value("101"))
        .andExpect(MockMvcResultMatchers.jsonPath("$.vehicleDetails.model").value("ecoSport"))
        .andDo(MockMvcResultHandlers.print());
    }

    @Test
    void getVehicleByModelName() throws Exception
    {
        String request="/getVehicleModelName/";


    }

    @Test
    void getVehicleByPriceRange() throws Exception
    {
        //TODO
    }

    @Test
    void getVehicleByFeature() throws Exception
    {
        //TODO
    }
}