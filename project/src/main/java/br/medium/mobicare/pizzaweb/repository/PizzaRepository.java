package br.medium.mobicare.pizzaweb.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.medium.mobicare.pizzaweb.entity.PizzaEntity;

@Repository
public interface PizzaRepository extends CrudRepository<PizzaEntity, Integer>{
	
}
