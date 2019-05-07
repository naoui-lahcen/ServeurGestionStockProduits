package com.dev.naoui.service;

import java.util.List;

import com.dev.naoui.entity.Produit;

public interface IProduitService {
	List<Produit> getProduits();
	void addProduit(Produit produit);
	void updateProduit(Produit produit);
	void deleteProduit(Long id);
	

}
