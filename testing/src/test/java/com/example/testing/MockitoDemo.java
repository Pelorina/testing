package com.example.testing;

import com.example.testing.service.OrderService;
import com.example.testing.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
@AllArgsConstructor
public class MockitoDemo {
    private OrderService orderService;
    private ProductService productService;

    @Test
    public void givenASpecificOrderThenRetrieveAndConfirmProductIsCorrect(){
        //three steps
        //1. When

        Mockito.when(productService.getProducts()).thenReturn("Test Product Name");
        String productName = orderService.getProductName();

        Assert.assertEquals("Test Product Name ",productName);
    }




}
