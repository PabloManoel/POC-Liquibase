package br.medium.mobicare.pizzaweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.medium.mobicare.pizzaweb.entity.PizzaEntity;

@Repository
public interface PizzaRepository extends JpaRepository<PizzaEntity, Integer>{
	
}
