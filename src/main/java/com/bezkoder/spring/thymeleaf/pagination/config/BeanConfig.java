package com.bezkoder.spring.thymeleaf.pagination.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

@Configuration
@EnableScheduling
public class BeanConfig {
    @Bean
    public ModelMapper getModelMapper(){
        return new ModelMapper();
    }
}
