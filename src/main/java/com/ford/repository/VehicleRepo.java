package com.Ford.Repository;

import com.Ford.Model.VehicleEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VehicleRepo extends MongoRepository<VehicleEntity, String>
{
}