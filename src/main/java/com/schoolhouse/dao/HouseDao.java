/**
 * 
 */
package com.schoolhouse.dao;

import java.util.List;

import com.schoolhouse.model.House;

/**
 * @author Haojie Ma
 * @date Jul 19, 2016
 */
public interface HouseDao extends GenericDao<House,String>{
	
	public List<House> getHousesByList(List<Long> houseList);
	public House getHouseById(long houseId);
	

}


