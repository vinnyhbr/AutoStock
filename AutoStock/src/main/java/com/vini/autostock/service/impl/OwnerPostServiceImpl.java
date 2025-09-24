package com.vini.autostock.service.impl;

import com.vini.autostock.client.CarPostStoreClient;
import com.vini.autostock.dto.OwnerPostDTO;
import com.vini.autostock.service.OwnerPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OwnerPostServiceImpl implements OwnerPostService {

    @Autowired
    private CarPostStoreClient carPostStoreClient;

    @Override
    public void createOwnerCar(OwnerPostDTO ownerPostDTO) {
        carPostStoreClient.ownerPostsClient(ownerPostDTO);
    }
}
