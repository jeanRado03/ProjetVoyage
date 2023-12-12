package com.example.testweb.repository;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix="com.example.testweb")
@Data
public class CustomProperties {

    private String apiUri;

}
