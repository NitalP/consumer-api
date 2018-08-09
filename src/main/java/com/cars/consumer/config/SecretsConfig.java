package com.cars.consumer.config;

import com.cars.data.secretsmanagerclient.SecretsManagerClient;
import com.cars.data.secretsmanagerclient.exception.SecretsManagerClientException;
import com.cars.data.secretsmanagerclient.impl.SecretsManagerClientImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;
import java.util.Map;


@Configuration
public class SecretsConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(SecretsConfig.class);

    @Value("${secrets.secretnames}")
    private String secretNames;

    @Value("${secrets.endpoint}")
    private String endpoint;

    @Value("${secrets.region}")
    private String region;

    @Bean(name = "secrets")
    public Map<String, Map<String, String>> secrets() {
        try {
            SecretsManagerClient client = new SecretsManagerClientImpl(secretNames, endpoint, region);
            return client.fetchSecrets();
        } catch (SecretsManagerClientException e) {
            LOGGER.error("Secrets Load failed : " + e.getMessage(), e);
        }
        return Collections.emptyMap();
    }
}