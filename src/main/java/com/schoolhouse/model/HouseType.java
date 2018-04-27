/**
 * 
 */
package com.schoolhouse.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;
import com.schoolhouse.views.Views;

/**
 * @author Haojie Ma
 * @date Dec 15, 2015
 */


@Entity
@Table(name="housetype")
public class HouseType {

	private short id;
	@JsonView(Views.Detail.class)
	private String type;
	
	
	@Id
	@Column(columnDefinition="tinyint")
	@GeneratedValue
	public short getId() {
		return id;
	}
	public void setId(short id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	

}


