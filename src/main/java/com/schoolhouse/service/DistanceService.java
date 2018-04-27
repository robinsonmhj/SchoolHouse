/**
 * 
 */
package com.schoolhouse.service;

import java.util.List;

/**
 * @author Haojie Ma
 * @date Jul 19, 2016
 */
public interface DistanceService {
	
	public List<Long> findHouseListByCollegeId(int collegeId,int distance);

}


