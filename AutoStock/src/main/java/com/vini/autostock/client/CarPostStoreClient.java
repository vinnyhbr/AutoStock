package com.vini.autostock.client;

import com.vini.autostock.dto.CarPostDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Component
public class CarPostStoreClient {

    private final String USER_STORE_SERVICE_URI = "http://localhost:8080/user";
    private final String POSTS_STORE_SERVICE_URI = "http://localhost:8080/sales";

    RestTemplate restTemplate;

    public List<CarPostDTO> carForSalesClient() {
        ResponseEntity<CarPostDTO[]> responseEntity = restTemplate.getForEntity(POSTS_STORE_SERVICE_URI+"/cars",CarPostDTO[].class);
        return Arrays.asList(Objects.requireNonNull(responseEntity.getBody()));
    }
}
