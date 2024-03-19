package com.akdeniz.evdekiProjemPackage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akdeniz.evdekiProjemPackage.model.Product;



public interface ProductRepository extends JpaRepository<Product, Long> {

}
