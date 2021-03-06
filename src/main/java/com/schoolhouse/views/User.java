/**
 * 
 */
package com.schoolhouse.views;

/**
 * @author Haojie Ma
 * @date Oct 21, 2015
 */
import com.fasterxml.jackson.annotation.JsonView;
import com.schoolhouse.views.Views;


public class User {

	@JsonView(Views.Summary.class)
	String username;
	
	String password;
	
	@JsonView(Views.Summary.class)
	String email;
	
	@JsonView(Views.Summary.class)
	String phone;
	
	String address;

	public User(String username,String password,String email,String phone,String address){
		
		this.username=username;
		this.password=password;
		this.email=email;
		this.phone=phone;
		this.address=address;
		
		
		
	}
	
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
}


