package ecommerceapp.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ecommerceapp.bean.product;


@Repository
public interface MyLocalRepository extends JpaRepository<product, Long> {	
	
}

