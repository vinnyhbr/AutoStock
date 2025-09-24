package com.vini.autostock.controller;

import com.vini.autostock.client.CarPostStoreClient;
import com.vini.autostock.dto.CarPostDTO;
import com.vini.autostock.service.impl.CarPostStoreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/car")
public class CarPostController {

    @Autowired
    private CarPostStoreServiceImpl carPostStoreService;
    @Autowired
    private CarPostStoreClient carPostStoreClient;

    @GetMapping("/posts")
    public ResponseEntity<List<CarPostDTO>> getCarSales() {
        return ResponseEntity.status(HttpStatus.FOUND).body(carPostStoreService.getCarForSales());
    }
    @PutMapping("/{id}")
    public ResponseEntity changeCarSale (@RequestBody CarPostDTO carPostDTO, @PathVariable("id") String id) {
        carPostStoreClient.changeCarForSaleClient(carPostDTO,id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity deleteCarSale(@PathVariable("id") String id) {
        carPostStoreClient.deleteCarForSaleClient(id);
        return new ResponseEntity(HttpStatus.OK);
    }

}
