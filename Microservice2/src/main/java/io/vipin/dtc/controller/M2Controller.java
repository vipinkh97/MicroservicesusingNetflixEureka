package io.vipin.dtc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class M2Controller {
	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello Vipin Khandelwal";
	}
	
	@RequestMapping("/bookbyId/{id}")
		public String bookbyID(@PathVariable String id) {
		ResponseEntity<String> jsonObject = restTemplate.exchange("http://localhost:8500/"+ id, 
				HttpMethod.GET, null, new ParameterizedTypeReference<String>() {});
		return jsonObject.getBody();
		}
	
	@RequestMapping("/foodbyId/{id}")
	public String foodbyID(@PathVariable String id) {
	ResponseEntity<String> jsonObject = restTemplate.exchange("http://localhost:8502/"+ id, 
			HttpMethod.GET, null, new ParameterizedTypeReference<String>() {});
	return jsonObject.getBody();
	}
	

}
