/*
 * Copyright (c) 2020 [Z.D. Yu](http://github.com/CTYue)
 */
package com.vehicle.controller;

import java.util.*;

import com.vehicle.exceptions.VehicleJsonFormatException;
import com.vehicle.exceptions.VehicleNotFoundException;
import com.vehicle.model.VehicleEntity;
import com.vehicle.repository.VehicleRepo;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Main controller for required APIs.
 */
@EnableSwagger2
@RestController
public class VehicleController {

    @Autowired
    private VehicleRepo vRepo;

    /**
     * Post vehicle response entity.
     *
     * @param vehicle the vehicle
     * @return the response entity with customized message.
     */
//Q1: Post vehicle information
    @PostMapping(value="/vehicleInformation/submitVehicle", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Post a vehicle entity to database using json.", response = ResponseEntity.class)
    public ResponseEntity<String> postVehicle(@ApiParam(value = "Vehicle entity to be posted.", required = true)
                                                  @RequestBody VehicleEntity vehicle)
    {
        if(!vRepo.save(vehicle).equals(vehicle))
            throw new VehicleJsonFormatException("Malformed JSON request!");
       else
           return new ResponseEntity<>("Vehicle submitted to the database successfully!", HttpStatus.OK);
    }

    /**
     * Gets all vehicles.
     *
     * @return all vehicle entities in the database.
     */
    //Q2: Retrieve all entities from database
    @GetMapping(value = "/getVehicleInformation")
    @ApiOperation(value = "Get all vehicle information at one time.", response = List.class)
    @ResponseStatus(code=HttpStatus.OK)
    public List<VehicleEntity> getAllVehicle()
    {
        return vRepo.findAll();
    }

    /**
     * Gets vehicle by model name.
     *
     * @param modelName the model name
     * @return all the vehicles with matching model name
     */
    //Q3: Retrieve vehicle by modelName
    @GetMapping("/getVehicleModelName/{modelName}")
    @ApiOperation(value = "Find vehicles by its model name",
            notes = "Provides a vehicle name",
            response = List.class)
    @ResponseStatus(code=HttpStatus.OK)
    public List<VehicleEntity> getVehicleByModelName(@ApiParam(value = "Vehicle model name to be searched.", required = true)
                                                         @PathVariable String modelName)
    {
        if(vRepo.findByModel(modelName).get().isEmpty())
            throw new VehicleNotFoundException("Vehicle NOT found!");
        else
            return vRepo.findByModel(modelName).get();
    }

    /**
     * Gets vehicle by price range.
     *
     * @param from the from
     * @param to   the to
     * @return the vehicle by price range
     */
//Q4: Retrieve vehicle by price range
    @GetMapping("/getVehiclePrice/{from}/{to}")
    @ApiOperation(value= "Find vehicles priced in given range.")
    public List<VehicleEntity> getVehicleByPriceRange(@ApiParam(value = "Starting price.", required = true)  @PathVariable String from,
                                                      @ApiParam(value = "Price up to.", required = true) @PathVariable String to)
    {
        //TODO
        return null;
    }

    /**
     * Gets vehicle by feature.
     *
     * @param exterior the exterior
     * @param interior the interior
     * @return the vehicle by feature
     */
//Q5: Retrieve all vehicles contains matching Interior or Exterior features
    @GetMapping(value = "/getVehicleByFeatures/{exterior}/{interior}")
    @ApiOperation(value = "Find vehicles with exterior features and/or interior features.")
    public List<VehicleEntity> getVehicleByFeature(@ApiParam(value = "Exterior feature keyword.", required = true) @PathVariable String exterior,
                                                   @ApiParam(value = "Interior feature keyword.", required = true) @PathVariable String interior)
    {
        //TODO
        return null;
    }

}