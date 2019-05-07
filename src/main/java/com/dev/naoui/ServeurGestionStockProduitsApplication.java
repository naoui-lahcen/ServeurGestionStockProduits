package com.dev.naoui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.dev.naoui.entity.Produit;
import com.dev.naoui.repository.ProduitRepository;

@SpringBootApplication
public class ServeurGestionStockProduitsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx= SpringApplication.run(ServeurGestionStockProduitsApplication.class, args);
		
		/*
		 * ProduitRepository produitRepository = ctx.getBean(ProduitRepository.class);
		 * 
		 * 
		 * produitRepository.save(new Produit("livre",50,20));
		 * produitRepository.save(new Produit("Cahier",5,25));
		 * produitRepository.save(new Produit("Stylo",2,10));
		 */
	}

}
