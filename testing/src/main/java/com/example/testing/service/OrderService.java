package com.example.testing.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
//@NoArgsConstructor
public class OrderService {

    private ProductService productService;


    public String getProductName(){
        return productService.getProducts();
    }




}
