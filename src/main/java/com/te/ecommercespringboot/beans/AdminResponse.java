package com.te.ecommercespringboot.beans;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;


import lombok.Data;

@Data
@JsonRootName("response")
@JsonPropertyOrder({"status" , "message"})
@XmlRootElement(name="response")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdminResponse implements Serializable {

	@JsonProperty("status")
	@XmlElement(name = "status-code")
	private int statusCode;
	
	
	private String message;
	
	@JsonProperty("item_info")
	@XmlElement(name = "item-info")
	private Items item;
	
	private List<Items> itemList;

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Items getItem() {
		return item;
	}

	public void setItem(Items item) {
		this.item = item;
	}

	public List<Items> getItemList() {
		return itemList;
	}

	public void setItemList(List<Items> itemList) {
		this.itemList = itemList;
	}
	
	
}
