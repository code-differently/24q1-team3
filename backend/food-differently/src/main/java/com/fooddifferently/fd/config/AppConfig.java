package com.fooddifferently.fd.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * This class is used to configure the RestTemplate bean.
 */
@Configuration
public class AppConfig {

    /**
     * This method creates a RestTemplate bean.
     * @return RestTemplate
     */
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
