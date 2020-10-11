package com.Ford.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.core.convert.DbRefResolver;
import org.springframework.data.mongodb.core.convert.DefaultDbRefResolver;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@Configuration
@EnableMongoRepositories
class Configuration extends AbstractMongoClientConfiguration {

    @Override
    protected String getDatabaseName() {
        return "springdata";
    }
}


//class ApplicationConfig {
//    @Autowired
//    MongoDbFactory mongoDbFactory;
//    @Autowired
//    MongoMappingContext mongoMappingContext;
//
//    @Bean
//    public MappingMongoConverter mappingMongoConverter() {
//
//        DbRefResolver dbRefResolver = new DefaultDbRefResolver(mongoDbFactory);
//        MappingMongoConverter converter = new MappingMongoConverter(dbRefResolver, mongoMappingContext);
//        converter.setTypeMapper(new DefaultMongoTypeMapper(null));
//
//        return converter;
//    }
}