package com.service;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.stereotype.Service;

import com.model.Item;
import com.model.ItemNotFoundException;

@Service
public class ItemService {
	
	ArrayList<Item> itemList = new ArrayList<>();
	
	public void addItem(Item item) {
		itemList.add(item);
	}
	
	public ArrayList<Item> getItems(){
		return itemList;
	}
	
	public Item getItem(int id) throws ItemNotFoundException {
		Iterator<Item> iterator = itemList.iterator();
		Item item = null;
		boolean flag = false;
		while(iterator.hasNext()) {
			Item i = iterator.next();
			
			if(i.getItemId() == id) {
				item = i;
				flag = true;
				break;
			}
		}
		if(!flag)
			throw new ItemNotFoundException("Resource not found");
		return item;
	}
	
	public void updateItem(Item item) {
		Iterator<Item> iterator = itemList.iterator();
		
		while(iterator.hasNext()) {
			Item i = iterator.next();
			
			if(i.getItemId() == item.getItemId()) {
				iterator.remove();
			}
		}
		
		itemList.add(item);
	}
	
	public void deleteItem(int id) {
		Iterator<Item> iterator = itemList.iterator();
		
		while(iterator.hasNext()) {
			Item i = iterator.next();
			
			if(i.getItemId() == id) {
				iterator.remove();
			}
		}
	}
}

