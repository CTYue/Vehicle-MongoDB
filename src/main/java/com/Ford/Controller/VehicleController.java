package com.Ford.Controller;

import java.util.*;
import com.Ford.Model.VehicleEntity;
import com.Ford.Repository.VehicleRepo;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class VehicleController {
    @Autowired
    private VehicleRepo vRepo;

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello() {
        return "HelloWorld!";
    }

    //Q1: Post vehicle information
    @ResponseStatus(HttpStatus.OK)
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public VehicleEntity createVehicle(@RequestBody VehicleEntity vehicle)
    {
        //这里有问题！vDetail是null！！！
        //从terminal中查表查出来的也有问题！
        return vRepo.save(vehicle);
//        return "Vehicle "+vehicle.getVehicleId()+" submitted to database successfully";
    }

    //这里可以使用Pageable技术优化结果？
    @ResponseStatus(HttpStatus.FOUND)
    @RequestMapping(value = "/getVehicleInformation", method = RequestMethod.GET)
    public List<VehicleEntity> getAllVehicle()
    {
        //Sort
        //TODO

//        return vRepo.findAll();
        return null;
    }





}