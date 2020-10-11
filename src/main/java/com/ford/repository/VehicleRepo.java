package com.ford.repository;

import com.ford.model.VehicleEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VehicleRepo extends MongoRepository<VehicleEntity, String>
{

}