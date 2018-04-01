package com.rm.springnotes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringNotesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringNotesApplication.class, args);
    }
}
