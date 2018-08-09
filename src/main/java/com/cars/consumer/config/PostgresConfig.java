package com.cars.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.Map;

import static com.cars.consumer.util.Constants.*;

@Configuration
public class PostgresConfig {

    @Resource(name = "secrets")
    private Map<String, Map<String, String>> secrets;

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(POSTGRES_DRIVER);
        dataSource.setUrl(POSTGRES_URL);
        System.out.println("**********secrets " + secrets +  secrets.get(SECRET_NAME));
        dataSource.setUsername(secrets.get(SECRET_NAME).get(SECRET_USERNAME));
        dataSource.setPassword(secrets.get(SECRET_NAME).get(SECRET_PASSWORD));
        return dataSource;
    }
}
