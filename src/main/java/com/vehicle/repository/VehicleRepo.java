/*
 * Copyright (c) 2020 [Z.D. Yu](http://github.com/CTYue)
 */

package com.vehicle.repository;

import java.util.*;
import com.vehicle.model.VehicleEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 * The interface Vehicle repo.
 */
public interface VehicleRepo extends MongoRepository<VehicleEntity, String>
{
    /**
     * Find vehicle entities by its model name.
     *
     * @param modelName : vehicle model name.
     * @return All vehicle entities with matching model name.
     */
    @Query(value="{'vehicleDetails.model': ?0}")
    Optional<List<VehicleEntity>> findByModel(String modelName);

    //TODO
    //@Query
    //List<VehicleEntity> findByPriceRange(String from, String to);

    //TODO
    //@Query
    //List<VehicleEntity> findByVehicleByFeature(String extFeature, String intFeature);
}