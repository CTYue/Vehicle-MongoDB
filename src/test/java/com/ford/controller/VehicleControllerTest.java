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
import org.springframework.test.web.servlet.MvcResult;
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

    /**
     * Test postVehicle() API.
     *
     * @throws Exception the exception
     */
    @Test
    void postVehicle() throws Exception
    {
        // ./Ford/src/test/java/resources/post.json
        //TODO
    }

    /**
     * Test getAllVehicle() API
     * If HTTP Response is OK(200), then it passes.
     * @throws Exception the exception
     */
    @Test
    void getAllVehicle() throws Exception
    {
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get("/getVehicleInformation") )
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn();
    }

    /**
     * Test getVehicleByModelName() API.
     *
     * @throws Exception the exception
     */
    @Test
    void getVehicleByModelName() throws Exception
    {
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get("/getVehicleModelName/ecoSport") )
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn();
    }

    /**
     * Test getVehicleByPriceRange() API.
     *
     * @throws Exception the exception
     */
    @Test
    void getVehicleByPriceRange() throws Exception
    {
        //TODO
    }

    /**
     * Gets vehicle by feature.
     *
     * @throws Exception the exception
     */
    @Test
    void getVehicleByFeature() throws Exception
    {
        //TODO
    }
}