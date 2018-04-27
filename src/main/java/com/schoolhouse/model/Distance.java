/**
 * 
 */
package com.schoolhouse.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Haojie Ma
 * @date Oct 21, 2015
 */


@Entity
@Table(name="distance")
public class Distance {

	private long id;
	private int collegeId;
	private Long houseId;
	/*
	@JsonIgnore
	private House house;
	@JsonIgnore
	private College college;
	*/
	private int distance;
	
	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Column(name="college_id")
	public int getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	@Column(name="house_id")
	public Long getHouseId() {
		return houseId;
	}
	public void setHouseId(Long houseId) {
		this.houseId = houseId;
	}
	/*
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "house_id")
	public House getHouse() {
		return house;
	}
	public void setHouse(House house) {
		this.house = house;
	}
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "college_id")
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	*/
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	

	
	
	
	
	

}

