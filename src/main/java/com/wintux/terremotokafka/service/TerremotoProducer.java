package com.wintux.terremotokafka.service;

import com.wintux.terremotokafka.model.FeatureCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class TerremotoProducer {
    private final KafkaTemplate<Long, FeatureCollection> kafkaTemplate;
    private static final Logger logger = LoggerFactory.getLogger(TerremotoProducer.class);

    private final String topic;

    public TerremotoProducer(KafkaTemplate<Long, FeatureCollection> kafkaTemplate, @Value("${kafka.topic}") String topic) {
        this.kafkaTemplate = kafkaTemplate;
        this.topic = topic;
    }

    public void sendMessage(FeatureCollection event) {
        try {
            kafkaTemplate.send(topic, event.getMetadata().getGenerated(), event);
            logger.info("Mensaje enviado con éxito al tópico: {}", topic);
        } catch (Exception e) {
            logger.error("Error enviar mensaje a Kafka: {}", e.getMessage());
        }
    }
}
