package com.example.testweb;

import com.example.testweb.repository.CustomProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestWebApplication implements CommandLineRunner {
    @Autowired
    private CustomProperties properties;

    public static void main(String[] args) {
        SpringApplication.run(TestWebApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(properties.getApiUri());
    }
}
