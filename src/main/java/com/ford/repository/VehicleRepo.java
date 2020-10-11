package com.ford.repository;

import com.ford.model.vehicleEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VehicleRepo extends MongoRepository<vehicleEntity, String>
{

}