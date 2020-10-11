package com.ford.repository;

import java.util.*;
import com.ford.model.VehicleEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface VehicleRepo extends MongoRepository<VehicleEntity, String>
{
//    @Query(value="{'vehicleDetail.model': ?0}", fields="{'vehicleDetail.model'}")
    @Query(value="{'vehicleDetail.model': ?0}")
    Optional<VehicleEntity> findByModel(String modelName);

//
//    //    @Query()
//    List<VehicleEntity> findByPriceRange(String from, String to);
//

//    //    @Query()
//    List<VehicleEntity> findByVehicleByFeature(String extFeature, String intFeature);
}