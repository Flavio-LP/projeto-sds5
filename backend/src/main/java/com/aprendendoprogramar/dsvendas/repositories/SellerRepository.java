package com.aprendendoprogramar.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendoprogramar.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{


}
