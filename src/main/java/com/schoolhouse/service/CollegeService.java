/**
 * 
 */
package com.schoolhouse.service;

import java.util.List;

import com.schoolhouse.model.College;

/**
 * @author Haojie Ma
 * @date Jun 30, 2016
 */
public interface CollegeService {
	
	public College findCollegeByName(String name);
	public List<College> findCollegeById(int id);
	
	

}


