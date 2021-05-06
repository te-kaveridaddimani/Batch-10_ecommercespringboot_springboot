package com.te.ecommercespringboot.dao;

import java.util.List;

import com.te.ecommercespringboot.beans.Items;




public interface AdminDAO {

	
	public boolean addItem(Items item);
	
	public boolean removeItem(Integer id);
	
	public Items searchItem(Integer id);
	
	public List<Items> getAllItems();
	
	public boolean updateItem(Items item);
}
