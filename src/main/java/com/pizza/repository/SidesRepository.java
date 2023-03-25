package com.pizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pizza.entity.Sides;
@Repository
public interface SidesRepository extends JpaRepository<Sides, Integer>{

}
