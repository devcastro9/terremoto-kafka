package com.wintux.terremotokafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TerremotoKafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(TerremotoKafkaApplication.class, args);
    }

}
