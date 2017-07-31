package com.TestMongo.entities;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="new_user")
public class Users extends AbstractDocument{
	
	private String email;
	
	private String name;
	
	private String password;
	
	

	public Users() {
		super();
	}
	
	

	public Users(String email, String name, String password) {
		super();
		this.email = email;
		this.name = name;
		this.password = password;
	}



	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
