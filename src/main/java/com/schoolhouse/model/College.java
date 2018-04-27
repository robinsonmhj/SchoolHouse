/**
 * 
 */
package com.schoolhouse.model;

import java.math.BigDecimal;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;
import com.schoolhouse.views.Views;



/**
 * @author Haojie Ma
 * @date Jun 29, 2016
 */

@Entity()
@Table(name="college")
public class College {
	
	private int id;
	@JsonView(Views.Summary.class)
	private String name;
	private String city;
	private String state;
	private String street;
	private String zip;
	@JsonView(Views.Summary.class)
	private BigDecimal lat;
	@JsonView(Views.Summary.class)
	private BigDecimal lng;
	private String placeId;
	
	/*
	@JsonIgnore
	private Set<Distance> distance= new HashSet<Distance>();
	*/
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Column(columnDefinition="char(2)")
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@Column(columnDefinition="char(5)")
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}

	public BigDecimal getLat() {
		return lat;
	}
	public void setLat(BigDecimal lat) {
		this.lat = lat;
	}

	public BigDecimal getLng() {
		return lng;
	}
	public void setLng(BigDecimal lng) {
		this.lng = lng;
	}
	@Column(name="place_id")
	public String getPlaceId() {
		return placeId;
	}
	public void setPlaceId(String placeId) {
		this.placeId = placeId;
	}
	
	/*
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="college_id",referencedColumnName="id")
	public Set<Distance> getDistance() {
		return distance;
	}
	public void setDistance(Set<Distance> distance) {
		this.distance = distance;
	}
	*/
	
	
	
}


