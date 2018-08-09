package com.cars.consumer.config;

import com.cars.framework.healthcheck.service.HealthCheckService;
import com.cars.framework.healthcheck.service.HealthCheckServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.cars.framework.healthcheck")
public class HealthCheckConfig {

    @Bean
    public HealthCheckService healthCheckService() {
        HealthCheckService service = new HealthCheckServiceImpl();

//		service.addDependency(configApiDependency());


        return service;
    }
}