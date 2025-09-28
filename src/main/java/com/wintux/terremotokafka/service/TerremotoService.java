package com.wintux.terremotokafka.service;

import com.wintux.terremotokafka.model.FeatureCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class TerremotoService {
    private final WebClient webClient;
    private final TerremotoProducer producer;
    private static final Logger logger = LoggerFactory.getLogger(TerremotoService.class);

    public TerremotoService(TerremotoProducer producer, WebClient.Builder builder, @Value("${terremoto.api.url}") String apiUrl) {
        this.producer = producer;
        this.webClient = builder.baseUrl(apiUrl).build();
    }

    @Scheduled(fixedRateString = "${terremoto.fetch.rate}")
    public void fetchAndPublishEarthquakes() {
        logger.info("Obtención y publicación de terremotos...");
        webClient.get()
                .retrieve()
                .bodyToFlux(FeatureCollection.class)
                .doOnNext(producer::sendMessage)
                .doOnError(error -> logger.error("Error obtener terremotos: {}", error.getMessage()))
                .subscribe();
    }
}
