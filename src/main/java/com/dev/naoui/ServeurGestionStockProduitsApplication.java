package com.dev.naoui;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dev.naoui.entity.Produit;

@SpringBootApplication
public class ServeurGestionStockProduitsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServeurGestionStockProduitsApplication.class, args);
		System.out.println("Bonjour Angular!!!!!");
		    
		//test de la methode remove !
		    List<Produit> produits = new ArrayList<Produit>();
			
			produits.add(new Produit("test1",50,20));
			produits.add(new Produit("test2",5,25));
			produits.add(new Produit("test3",2,10));
			produits.add(new Produit("test4",50,20));
			produits.add(new Produit("test5",5,25));
			produits.add(new Produit("test6",2,10));
			
			for (int i=4; i<produits.size();i++) {
				produits.remove(produits);
				System.out.println(" objet bien suprimer ");

				produits.remove("test6");
				System.out.println("index bien suprimer");

			}
	}

}
