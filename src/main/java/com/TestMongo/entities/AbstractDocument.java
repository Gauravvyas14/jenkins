package com.TestMongo.entities;

import org.springframework.data.annotation.Id;

public class AbstractDocument {
	
	@Id
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	

}
