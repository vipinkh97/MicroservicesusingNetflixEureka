package io.vipin.dtc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.vipin.dtc.model.M1Model;
import io.vipin.dtc.repository.M1Repository;

@Service
public class M1Service {
	
	@Autowired
	private M1Repository m1repository;

	public M1Model getBookbyId(String id) {
		
		return m1repository.findById(id).get();
	}

	public void addBook(M1Model book) {
		m1repository.save(book);
	}

}
