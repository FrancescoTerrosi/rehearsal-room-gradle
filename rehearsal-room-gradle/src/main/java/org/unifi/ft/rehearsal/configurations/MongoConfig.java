package org.unifi.ft.rehearsal.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.unifi.ft.rehearsal.model.Generated;

import com.mongodb.MongoClient;

@Generated
@Configuration
public class MongoConfig {

	@Bean
    public MongoClient mongo() {
        return new MongoClient("localhost");
    }
 
    @Bean
    public MongoTemplate mongoTemplate() {
        return new MongoTemplate(mongo(), "rehearsal-mongo");
    }
}