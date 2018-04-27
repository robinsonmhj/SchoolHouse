/**
 * 
 */
package com.schoolhouse.dao;



import java.util.List;

import com.schoolhouse.model.College;
/**
 * @author Haojie Ma
 * @date Jun 30, 2016
 */
public interface CollegeDao extends GenericDao<College,String>{
	
	public College findCollegeByName(String name);
	public List<College> findCollegeById(int id);
	
	

}


