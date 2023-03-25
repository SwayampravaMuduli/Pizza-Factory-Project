package com.pizza.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pizza.entity.MasterToppings;

@Repository
public interface MasterToppingsRepository extends JpaRepository<MasterToppings, Integer>{
	@Query(value="select name from master_toppings where name=:name",nativeQuery = true)
	String getToppinngs(String name);


}
