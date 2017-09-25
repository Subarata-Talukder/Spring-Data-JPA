package com.subaratabio.springdatajpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.subaratabio.springdatajpa.model.Developer;
import com.subaratabio.springdatajpa.repository.DeveloperRepository;

@RequestMapping("/data")
@RestController
public class DataInterface {
	
	@Autowired
	private DeveloperRepository developerRepository;

	@GetMapping("/getdevinfo{id}")
	public Developer getDeveloperInfo(@PathVariable("id") Integer id) {

		return developerRepository.findOne(id);
	}
	
	@GetMapping("/getalldevs")
	public List<Developer> getAllDevelopers() {

		return (List<Developer>) developerRepository.findAll();
	}
	
	@PostMapping("/add")
	public Developer add(@RequestBody Developer developer) {

		return developerRepository.save(developer);
	}

}
