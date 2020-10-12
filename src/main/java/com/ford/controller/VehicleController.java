/*
 * Copyright (c) 2020 [Z.D. Yu](http://github.com/CTYue)
 */
package com.ford.controller;

import java.util.*;

import com.ford.exceptions.VehicleNotFoundException;
import com.ford.model.VehicleEntity;
import com.ford.repository.VehicleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class VehicleController {

    @Autowired
    private VehicleRepo vRepo;

    //Q1: Post vehicle information
    @PostMapping(value="/vehicleInformation/submitVehicle/", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> postVehicle(@RequestBody VehicleEntity vehicle)
    {
       if(vRepo.save(vehicle)==vehicle)
           return new ResponseEntity<String>("Vehicle submitted to the database successfully!", HttpStatus.OK);
       else
           return new ResponseEntity<String>("Error: Malformed JSON!", HttpStatus.BAD_REQUEST);
    }

    //Q2: Retrieve all entities from database
    @GetMapping(value = "/getVehicleInformation/")
    public List<VehicleEntity> getAllVehicle()
    {
        //这里可以使用Pageable技术优化结果？TODO
        return vRepo.findAll();
    }

    //Q3: Retrieve vehicle by modelName
    @GetMapping("/getVehicleModelName/{modelName}")
    @ResponseStatus(code=HttpStatus.OK)
    public Optional<VehicleEntity> getVehicleByModelName(@PathVariable String modelName)
    {
        if(vRepo.findByModel(modelName)==null)
            throw new VehicleNotFoundException("Vehicle NOT found!");
        else
            return vRepo.findByModel(modelName);
    }

    //Q4: Retrieve vehicle by price range
    @GetMapping("/getVehiclePrice/{from}/{to}")
    public List<VehicleEntity> getVehicleByPriceRange(@PathVariable String from, @PathVariable String to)
    {
        //vRepo.findByPriceRange() TODO
        return null;
    }

    //Q5: Retrieve all vehicles contains matching Interior or Exterior features
    @GetMapping(value = "/getVehicleByFeatures/{exterior}/{interior}")
    public List<VehicleEntity> getVehicleByFeature(@PathVariable String exterior, @PathVariable String interior)
    {
        //vRepo.findByVehicleByFeature() TODO
        return null;
    }

}