package com.pizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pizza.entity.Topping;
@Repository
public interface ToppingRepository extends JpaRepository<Topping, Integer> {

}
