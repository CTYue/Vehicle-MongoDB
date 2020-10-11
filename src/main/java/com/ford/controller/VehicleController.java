package com.ford.controller;

import java.util.*;
import com.ford.model.VehicleEntity;
import com.ford.repository.VehicleRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class VehicleController {

    private VehicleRepo vRepo;

    public VehicleController(VehicleRepo vRepo) {
        this.vRepo = vRepo;
    }

    //这里的error handling怎么写？

    //Q1: Post vehicle information
    @ResponseStatus(HttpStatus.OK)
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
//    public vehicleEntity postVehicle(@RequestBody vehicleEntity[] vehicle)
    public VehicleEntity postVehicle(@RequestBody VehicleEntity vehicle)
    {
        //如何按照data set处理这里的输入？
        //for(vehicleEntity v: vehicle)
        //    vRepo.save(v);

        return vRepo.save(vehicle);
//        return null;
    }


    //Q2: Retrieve all entities from database
    //这里可以使用Pageable技术优化结果？
    @GetMapping(value = "/getVehicleInformation")
    public List<VehicleEntity> getAllVehicle()
    {
        //Sort
        //TODO
        return null;
    }

    //Q3: Retrieve vehicle by modelName
    @GetMapping("/getVehicleModelName/{modelName}")
    public List<VehicleEntity> getVehicleByModelName()
    {
        //TODO
        return null;
    }

    //Q4: Retrieve vehicle by price range
    @GetMapping("/getVehiclePrice/{from}/{to}")
    public List<VehicleEntity> getVehicleByPriceRange()
    {
        //TODO
        return null;
    }

    //Q5: Retrieve all vehicles contains matching Interior or Exterior features
    @GetMapping("/getVehicleByFeatures/{exterior}/{interior}")
    public List<VehicleEntity> getVehicleByFeature(String exterior, String interior)
    {
        //TODO
        return null;
    }




}