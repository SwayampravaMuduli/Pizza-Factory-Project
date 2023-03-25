package com.pizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pizza.entity.Pizza;
@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Integer> {

}
