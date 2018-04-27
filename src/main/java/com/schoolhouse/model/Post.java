/**
 * 
 */
package com.schoolhouse.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import com.schoolhouse.views.Views;

/**
 * @author Haojie Ma
 * @date Dec 16, 2015
 */
@Entity()
@Table(name="post")
public class Post {
	
	@JsonView(Views.Summary.class)
	private long id;
	@JsonIgnore
	private User user;
	@JsonIgnore
	private House house;
	@JsonView(Views.Detail.class)
	private String summary;
	private short forRent;
	private short status;
	@JsonView({Views.Summary.class,Views.Detail.class})
	private int price;
	
	
	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}

	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id",referencedColumnName="id")  
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="house_id",referencedColumnName="id")
	public House getHouse() {
		return house;
	}


	public void setHouse(House house) {
		this.house = house;
	}

	@Column(columnDefinition="text")
	public String getSummary() {
		return summary;
	}


	public void setSummary(String summary) {
		this.summary = summary;
	}

	@Column(columnDefinition="tinyint")
	public short getForRent() {
		return forRent;
	}


	public void setForRent(short forRent) {
		this.forRent = forRent;
	}

	@Column(columnDefinition="tinyint")
	public short getStatus() {
		return status;
	}


	public void setStatus(short status) {
		this.status = status;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	
	

}


