package io.vipin.dtc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.vipin.dtc.model.M1Model;
import io.vipin.dtc.service.M1Service;

@RestController
public class M1Controller {
	
	@Autowired
	private M1Service m1service;

	@RequestMapping("/{id}")
	private M1Model getBookbyId(@PathVariable String id){
		return m1service.getBookbyId(id);
	}
	
	@PostMapping("/add/book")
	private String addBook(@RequestBody M1Model book) {
		m1service.addBook(book);
		return "Book Added Successfully";
	}
	
}
