/**
 * 
 */
package com.schoolhouse.service;

import java.util.List;

import com.schoolhouse.model.House;

/**
 * @author Haojie Ma
 * @date Jul 19, 2016
 */
public interface HouseService {

	public List<House> findHousesByList(List<Long> houseList);
	public House findHouseById(long houseId);
}


