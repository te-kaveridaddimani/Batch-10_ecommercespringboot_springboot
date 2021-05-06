package com.te.ecommercespringboot.service;

import java.util.List;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

import com.te.ecommercespringboot.beans.Items;



public interface AdminService {

	
	public boolean addItem(Items item);
	
	public boolean removeItem(Integer id);
	
	public Items searchItem(Integer id);
	
	public List<Items> getAllItems();
	
	public boolean updateItem(Item item);

	boolean updateItem(Items item);
}
