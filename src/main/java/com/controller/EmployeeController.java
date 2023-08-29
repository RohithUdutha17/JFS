package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.model.Employee;
import com.model.ItemDAO;
import com.payroll.APIClient;
import com.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService service;
	
	@Autowired
	APIClient apiClient;
	
//	@Autowired
//	RestTemplate restTemplate;
	
	@GetMapping("/employees")
	public ArrayList<Employee> getEmployees(){
		return service.getEmployeeList();
	}
	
	@GetMapping("/viewitems")							//communicating between services using REST TEMPLATE
	public ResponseEntity<?> getItems(){
//		String url = "http://localhost:9001/itemdemo/item/items";
//		
//		ResponseEntity<List<Object>> response = restTemplate.exchange(url, HttpMethod.GET, null,new ParameterizedTypeReference<List<Object>>(){});
//		
		List<ItemDAO> response = apiClient.getAllItems();
		return new ResponseEntity<>(response,HttpStatus.OK);
		
	}
	
	@PostMapping("/addemployee")
	public ResponseEntity<String> addEmployee(@RequestBody Employee e) {
		service.addEmployee(e);
		return new ResponseEntity<>("Employee added",HttpStatus.CREATED);
	}
	
	@PatchMapping("/updateemployee")
	public ResponseEntity<String> updateEmployee(@RequestBody Employee e) {
		service.updateEmployee(e);
		return new ResponseEntity<>("Employee updated",HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteemployee/{id}")
	public void deleteEmployee(@PathVariable int id) {
		service.deleteEmployee(id);
	}
	
}
