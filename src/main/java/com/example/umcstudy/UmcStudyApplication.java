package com.example.umcstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class UmcStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(UmcStudyApplication.class, args);
    }

}
