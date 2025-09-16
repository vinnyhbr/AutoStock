package com.vini.autostock.client;

import org.springframework.stereotype.Component;

@Component
public class CarPostStoreClient {

    private final String USER_STORE_SERVICE_URI = "http://localhost:8080/user";
    private final String CAR_STORE_SERVICE_URI = "http://localhost:8080/sales";

}
