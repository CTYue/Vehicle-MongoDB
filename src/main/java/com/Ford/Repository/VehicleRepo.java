package com.Ford.Repository;

import java.util.*;
import com.Ford.Model.VehicleEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface VehicleRepo extends MongoRepository<VehicleEntity, String>
{
//    List<VehicleEntity> getAll();
//    VehicleEntity getById(Integer id);
//    VehicleEntity getByName(String modelName);
//    List<VehicleEntity> getByPriceRange(String from, String to);
//    List<VehicleEntity> getByFeatures(String extFeature, String intFeature);
//    VehicleEntity saveOrUpdate(VehicleEntity vehicle);

//    Page<VehicleEntity> getByFeaturesLike(String extFeature, String intFeature);

//    void delete(Integer id);
}