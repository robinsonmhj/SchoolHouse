/**
 * 
 */
package com.schoolhouse.model;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import com.schoolhouse.views.Views;

/**
 * @author Haojie Ma
 * @date Dec 15, 2015
 */

@Entity
@Table(name="house")
public class House {

	private long sourceId;
	private long id;
	@JsonView(Views.Detail.class)
	private String street;
	@JsonView(Views.Detail.class)
	private String city;
	@JsonView(Views.Detail.class)
	private String state;
	@JsonView(Views.Detail.class)
	private String zip;
	@JsonView(Views.Summary.class)
	private BigDecimal lat;
	@JsonView(Views.Summary.class)
	private BigDecimal lng;
	private String placeId;
	@JsonView(Views.Detail.class)
	private HouseType type;
	@JsonView({Views.Summary.class,Views.Detail.class})
	private BigDecimal bath;
	@JsonView({Views.Summary.class,Views.Detail.class})
	private short bed;
	@JsonView(Views.Summary.class)
	@JsonIgnore
	private Set<Post> post= new HashSet<Post>();
	/*
	@JsonIgnore
	private Set<Distance> distance= new HashSet<Distance>();
	*/
	
	
	@Transient
	@Column(name="source_id")
	public long getSourceId() {
		return sourceId;
	}

	public void setSourceId(long sourceId) {
		this.sourceId = sourceId;
	}

	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
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
	
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "type_id",referencedColumnName="id")  
	public HouseType getType() {
		return type;
	}

	public void setType(HouseType type) {
		this.type = type;
	}


	public BigDecimal getBath() {
		return bath;
	}

	public void setBath(BigDecimal bath) {
		this.bath = bath;
	}
	
	@Column(columnDefinition="tinyint")
	public short getBed() {
		return bed;
	}

	public void setBed(short bed) {
		this.bed = bed;
	}
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="house_id",referencedColumnName="id")
	public Set<Post> getPost() {
		return post;
	}

	
	public void setPost(Set<Post> post) {
		this.post = post;
	}

	/*
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="house_id")
	public Set<Distance> getDistance() {
		return distance;
	}
	
	public void setDistance(Set<Distance> distance) {
		this.distance = distance;
	}
	
	*/
	

}


