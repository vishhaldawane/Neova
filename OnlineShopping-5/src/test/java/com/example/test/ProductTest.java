package com.example.test;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.pojo.Product;
import com.example.repo.ProductRepositoryImpl;


@SpringBootTest
public class ProductTest {

	@Autowired
	ProductRepositoryImpl productRepo;
	
	@Test 
	void insertProductTest()
	{
		Product product = new Product();
		
		product.setBrand("Nike");
		product.setDescription("Leather");
		product.setImage(null);
		product.setPrice(1000);
		product.setStock_Remaining(100);
				
		productRepo.insertProduct(product);
	}
	
	@Test 
	void selectProductTest()
	{
		Product product ;
		product = productRepo.selectProduct(47);
		System.out.println("------------------------------------");

		System.out.println("Product ID             :"+product.getproductId());
		System.out.println("Product Brand          :"+product.getBrand());
		System.out.println("Product Description    :"+product.getDescription());
		System.out.println("Product Image          :"+product.getImage());
		System.out.println("Product Price          :"+product.getPrice());
		System.out.println("Product StockRemaining :"+product.getStock_Remaining());
		System.out.println("------------------------------------");
		
	}
	
	@Test
	void deleteProductTest()
	{
		Product product = new Product();
		product.getproductId();
		productRepo.deleteProduct(48);
	}
	
	@Test 
	void updateProductTest()
	{
		Product product = new Product();
	
		product.setproductId(0);
		product.setBrand("Nike");
		product.setDescription("Soft Leather");
		product.setImage(null);
		product.setPrice(1200);
		product.setStock_Remaining(100);
				
		productRepo.updateProduct(product);
	}
	
	@Test 
	void selectAllProductsTest()
	{
		List <Product> productList;
		productList = productRepo.selectProducts();
		System.out.println("------------------------------------");

		for(Product product : productList)
		{
			System.out.println("Product ID             :"+product.getproductId());
			System.out.println("Product Brand          :"+product.getBrand());
			System.out.println("Product Description    :"+product.getDescription());
			System.out.println("Product Image          :"+product.getImage());
			System.out.println("Product Price          :"+product.getPrice());
			System.out.println("Product StockRemaining :"+product.getStock_Remaining());
			System.out.println("------------------------------------");

		}
	}
}
