package com.koreait.rest_2024_05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Rest202405Application {

    public static void main(String[] args) {
        SpringApplication.run(Rest202405Application.class, args);
    }

}
