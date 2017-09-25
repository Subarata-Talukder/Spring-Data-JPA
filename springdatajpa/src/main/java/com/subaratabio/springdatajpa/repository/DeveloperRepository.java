package com.subaratabio.springdatajpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.subaratabio.springdatajpa.model.Developer;

public interface DeveloperRepository extends CrudRepository<Developer, Integer>{
	
	 Developer findOne(Integer id);
	 Iterable<Developer> findAll();
}
