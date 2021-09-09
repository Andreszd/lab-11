package com.lab.promotion.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PromotionControllerTest {

    @Test
    void getCustomersByBirthDate() {
        String urlBase = "http://localhost:8080";
        WebClient client = WebClient.create(urlBase);
        String response = client.get().uri("/birthdate/1999-09-13").retrieve().bodyToMono(String.class).block();
        System.out.println(response);
    }
}