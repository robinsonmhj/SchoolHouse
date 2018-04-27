/**
 * 
 */
package com.schoolhouse.dao;


import java.util.List;

import com.schoolhouse.model.Distance;

/**
 * @author Haojie Ma
 * @date Jul 19, 2016
 */
public interface DistanceDao extends GenericDao<Distance,String>{
	
	
	public List<Long> getHouseListByCollegeId(int collegeId,int distance);
	
	

}


