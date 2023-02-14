package com.example.basestudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class BaseStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseStudyApplication.class, args);
    }

}
