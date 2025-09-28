package com.wintux.terremotokafka.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wintux.terremotokafka.model.FeatureCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class TerremotoConsumer {
    private static final Logger logger = LoggerFactory.getLogger(TerremotoConsumer.class);
    private final ObjectMapper objectMapper = new ObjectMapper();

    @KafkaListener(topics = "${kafka.topic}", groupId = "${spring.kafka.consumer.group-id}")
    public void listen(FeatureCollection terremoto){
        try {
            String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(terremoto);
            System.out.println("=== TERREMOTO ==================");
            System.out.println(json);
            System.out.println("=================================");
        } catch (Exception e) {
            logger.error("Error consumir topic", e);
        }
    }

}
