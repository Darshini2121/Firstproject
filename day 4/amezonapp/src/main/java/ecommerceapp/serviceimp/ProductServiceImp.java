package ecommerceapp.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ecommerceapp.bean.product;
import ecommerceapp.repositary.MyLocalRepository;
import ecommerceapp.service.ProductService;

@Service
public class ProductServiceImp implements ProductService {
	
   // injected the dependency MyLocalRepository into service class
	@Autowired
	MyLocalRepository myLocalRepository;

	public product addProduct(product product) {
		
		product addproduct = myLocalRepository.save(product);
		
		return addproduct;
	}

}
