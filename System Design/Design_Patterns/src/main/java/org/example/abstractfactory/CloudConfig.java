package org.example.abstractfactory;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CloudConfig {

    @Value("${clound.provider}")
    private String provider;

    @Bean
    public CloudFactory cloudFactory() {

        if (provider.equals("AWS")) {
            return new AWSFactory();
        } else if (provider.equals("Azure")) {
            return new AzureFactory();
        } else {
            throw new IllegalStateException("Cloud provider not found");
        }
    }
}
