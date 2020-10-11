package com.Ford.Controller;

import java.util.*;
import com.Ford.Model.VehicleEntity;
import com.Ford.Repository.VehicleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class VehicleController {
    @Autowired
    private VehicleRepo vRepo;

    //Q1: Post vehicle information
    @ResponseStatus(HttpStatus.OK)
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public VehicleEntity createVehicle(@RequestBody VehicleEntity vehicle)
    {
        System.out.println(vehicle);

        return vRepo.save(vehicle);
    }


    //这里可以使用Pageable技术优化结果？
    @ResponseStatus(HttpStatus.FOUND)
    @RequestMapping(value = "/getVehicleInformation", method = RequestMethod.GET)
    public List<VehicleEntity> getAllVehicle()
    {
        //Sort
        //TODO
        return null;
    }





}