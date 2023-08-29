package com.payroll;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import com.model.ItemDAO;

@FeignClient(value="Item-Service",url="http://localhost:9001/itemdemo/item")
public interface APIClient {

	@GetMapping("/items")
	List<ItemDAO> getAllItems();
}

