package com.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.model.Item;
import com.model.ItemNotFoundException;
import com.service.ItemService;

@RestController
public class ItemController {
	
	@Autowired
	ItemService service;
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getItem(@PathVariable int id){
		Item item ;
		try {
			item = service.getItem(id);
			
		}catch(ItemNotFoundException e) {
			return new ResponseEntity<>(e.toString(),HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(item,HttpStatus.OK);
	}
	
	@GetMapping("/items")
	public ArrayList<Item> getItems(){
		return service.getItems();
	}
	
	@PostMapping("/additem")
	public ResponseEntity<?> addItem(@RequestBody Item item,UriComponentsBuilder comp) {
		service.addItem(item);
		
		int id = item.getItemId();
		
		UriComponents component = comp.path("/"+id).build();
	
		return new ResponseEntity<>(component.toUriString(),HttpStatus.CREATED);
	}
	
	@PatchMapping("/updateitem")
	public void updateItem(@RequestBody Item item) {
		service.updateItem(item);
	}
	
	@DeleteMapping("/deleteitem/{id}")
	public void deleteItem(@PathVariable int id) {
		service.deleteItem(id);
	}
}


