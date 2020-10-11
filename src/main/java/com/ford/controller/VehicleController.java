package com.ford.controller;

import java.util.*;

import com.ford.model.VehicleEntity;
import com.ford.repository.VehicleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;

@RestController
public class VehicleController {

    @Autowired
    private VehicleRepo vRepo;

    //error handling怎么写？

    //Q1: Post vehicle information
    @ResponseStatus(HttpStatus.OK)
    @PostMapping(value="/vehicleInformation/submitVehicle/", consumes = MediaType.APPLICATION_JSON_VALUE)
    public VehicleEntity postVehicle(@RequestBody VehicleEntity vehicle)
    {
        //Add vehicle info one by one to the db.
        //Need a JSON translator to fit the required input format.
//        if(vRepo.save(vehicle)!=vehicle)
//            return "Error!";
//
//        return "Vehicles submitted successfully.";
        return vRepo.save(vehicle);
    }


    //Q2: Retrieve all entities from database
    @GetMapping(value = "/getVehicleInformation/")
    public List<VehicleEntity> getAllVehicle()
    {
        //TODO
        //这里可以使用Pageable技术优化结果？



        return vRepo.findAll();
    }

    //Q3: Retrieve vehicle by modelName
    @GetMapping("/getVehicleModelName/{modelName}")
    public Optional<VehicleEntity> getVehicleByModelName(@PathVariable String modelName)
    {
        Optional<VehicleEntity> res = vRepo.findByModel(modelName);
        System.out.println(res.toString());

        return res;
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