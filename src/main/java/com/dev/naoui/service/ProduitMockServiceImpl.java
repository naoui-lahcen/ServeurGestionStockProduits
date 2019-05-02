package com.dev.naoui.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dev.naoui.entity.Produit;
@Service
public class ProduitMockServiceImpl implements IProduitService{
	
	private List<Produit> produits;
	public ProduitMockServiceImpl() {
		produits = new ArrayList<Produit>();
		
		produits.add(new Produit("livre",50,20));
		produits.add(new Produit("Cahier",5,25));
		produits.add(new Produit("Stylo",2,10));

	}

	@Override
	public List<Produit> getProduits() {
		// TODO Auto-generated method stub
		return produits;
	}

	@Override
	public void addProduit(Produit produit) {
		produits.add(produit);
		
	}

	@Override
	public void updateProduit(Produit produit) {
		produits.remove(produit);
		produits.add(produit);
		
	}

	@Override
	public void deleteProduit(String ref) {
		Produit produit= new Produit();
		produit.setRef(ref);
		produits.remove(ref);
		
	}

}
