package ecommerceapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import ecommerceapp.bean.product;
import ecommerceapp.service.ProductService;

@RestController
public class ProductController {
	
	// injected the dependency of service class into controller
	
	@Autowired
	ProductService productService;
	
	@PostMapping(value="/createProduct") //endpoint 
	
	product createProduct(product prod) {
		
		product p = productService.addProduct(prod);
		
		return p;
	}

}
