/**
 * 
 */
package com.schoolhouse.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.schoolhouse.dao.HouseDao;
import com.schoolhouse.dao.GenericDao;
import com.schoolhouse.model.House;
import com.schoolhouse.service.HouseService;

/**
 * @author Haojie Ma
 * @date Jul 19, 2016
 */
@Service
public class HouseServiceImpl extends GenericServiceImpl<House,String> implements HouseService{
	
	
	private HouseDao houseDao;
	public HouseServiceImpl(){
		
		
	}
	
	@Autowired
    public HouseServiceImpl(@Qualifier("HouseDaoImpl") GenericDao<House, String> genericDao) {
        super(genericDao);
        this.houseDao = (HouseDao) genericDao;
    }
	
	
	@Override
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
	public List<House> findHousesByList(List<Long> houseList){
		   return houseDao.getHousesByList(houseList);
		
	}

	
	
	@Override
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
	public House findHouseById(long houseId){
		   return houseDao.getHouseById(houseId);
		
	}
}


