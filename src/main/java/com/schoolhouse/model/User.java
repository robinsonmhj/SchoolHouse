/**
 * 
 */
package com.schoolhouse.model;

/**
 * @author Haojie Ma
 * @date Oct 21, 2015
 */





import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import com.schoolhouse.views.Views;



@Entity
@Table(name="user")
public class User {
	
	private long sourceId;
	private long id;
	private String name;
	@JsonView(Views.Detail.class)
	private String fname;
	@JsonView(Views.Detail.class)
	private String lname;
	@JsonView(Views.Detail.class)
	private String phone;
	@JsonView(Views.Detail.class)
	private String email;
	private long qq;
	private String weichat;
	private short type;
	private int collegeId;
	@JsonView(Views.Detail.class)
	private String company;
	@JsonIgnore
	private Set<Post> posts= new HashSet<Post>();
	
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Column(columnDefinition="char(13)")
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getQq() {
		return qq;
	}
	public void setQq(long qq) {
		this.qq = qq;
	}
	public String getWeichat() {
		return weichat;
	}
	public void setWeichat(String weichat) {
		this.weichat = weichat;
	}
	@Column(columnDefinition="tinyint")
	public short getType() {
		return type;
	}
	public void setType(short type) {
		this.type = type;
	}
	
	@Column(name="college_id")
	public int getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="id")
	public Set<Post> getPosts() {
		return posts;
	}
	public void setPosts(Set<Post> posts) {
		this.posts = posts;
	}
	
	
	
	
	
	
}


