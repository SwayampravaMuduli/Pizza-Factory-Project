package com.pizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pizza.entity.SizePrice;
@Repository
public interface SizePriceRepository extends JpaRepository<SizePrice, Integer>{

}
