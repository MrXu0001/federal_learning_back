package com.federal_c1.federal_client1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FederalClient1Application {
    @Bean
    public FederalClient AIClient() {
        return new FederalClient("localhost", 8010);
    }

    public static void main(String[] args) {
        SpringApplication.run(FederalClient1Application.class, args);
    }

}
