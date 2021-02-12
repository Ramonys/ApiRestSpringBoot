package com.ramon.cadastroproduto;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ramon.cadastroproduto.entities.Category;
import com.ramon.cadastroproduto.entities.Product;
import com.ramon.cadastroproduto.repositories.CategoryRepository;
import com.ramon.cadastroproduto.repositories.ProductRepository;

@SpringBootApplication
public class CadastroprodutobackendApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryrepository;
	
	@Autowired
	private ProductRepository productrepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CadastroprodutobackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");

		Product p1 = new Product(null, "TV", 2200.00, cat1);
		Product p2 = new Product(null, "Domain Driven Design", 120.00, cat2);
		Product p3 = new Product(null, "PS5", 2800.00, cat1);
		Product p4 = new Product(null, "Docker", 100.00, cat2);

		cat1.getProducts().addAll(Arrays.asList(p1, p3));
		cat2.getProducts().addAll(Arrays.asList(p2, p4));
		
		categoryrepository.save(cat2);
		categoryrepository.save(cat1);
		
		productrepository.save(p1);
		productrepository.save(p2);
		productrepository.save(p3);
		productrepository.save(p4);
		
		
	}

}
