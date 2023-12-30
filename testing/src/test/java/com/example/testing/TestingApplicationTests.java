package com.example.testing;

import com.example.testing.service.OrderService;
import com.example.testing.service.ProductService;
import com.example.testing.service.ProductServiceTest;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
//@SpringBootTest
//@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
//@AllArgsConstructor
//@NoArgsConstructor
class TestingApplicationTests {

	private OrderService orderService;
	private ProductService productService;
	private ProductServiceTest productServiceTest;

//	TestingApplicationTests(OrderService orderService, ProductService productService) {
//		this.orderService = orderService;
//		this.productService = productService;
//	}
	@BeforeEach
	void initializeService() {
	this.productService = new ProductService();
	this.orderService = new OrderService(productService);
	this.productServiceTest = new ProductServiceTest();
	// Do whatever kind of initialization the policy service requires

}

	@Test
	void contextLoads() {
		Mockito.when(productServiceTest.productService().getProducts()).thenReturn("Welcome to J Unit Testing Class");
		String productName = orderService.getProductName();

		Assert.assertEquals("Welcome to J Unit Testing Class",productName);

	}


//	@org.junit.Test
//	public void givenASpecificOrderThenRetrieveAndConfirmProductIsCorrect(){
//		//three steps
//		//1. When
//
//		Mockito.when(productService.getProducts()).thenReturn("Test Product Name");
//		String productName = orderService.getProductName();
//
//		Assert.assertEquals("Test Product Name ",productName);
//	}

}
