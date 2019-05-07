package com.dev.naoui.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.naoui.entity.Produit;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long>{

}
