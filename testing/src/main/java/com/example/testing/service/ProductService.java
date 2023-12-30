package com.example.testing.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductService {

    public String getProducts(){
        return "Welcome to J Unit Testing Class";
    }


}
