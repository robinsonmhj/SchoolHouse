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


import com.schoolhouse.dao.DistanceDao;
import com.schoolhouse.dao.GenericDao;
import com.schoolhouse.model.Distance;
import com.schoolhouse.service.DistanceService;

/**
 * @author Haojie Ma
 * @date Jul 19, 2016
 */

@Service
public class DistanceServiceImpl extends GenericServiceImpl<Distance,String> implements DistanceService{
	
	private DistanceDao distanceDao;
	public DistanceServiceImpl(){
		
		
	}
	
	@Autowired
    public DistanceServiceImpl(@Qualifier("DistanceDaoImpl") GenericDao<Distance, String> genericDao) {
        super(genericDao);
        this.distanceDao = (DistanceDao) genericDao;
    }
	
	@Override
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
	public List<Long> findHouseListByCollegeId(int collegeId,int distance){
		 
		   return distanceDao.getHouseListByCollegeId(collegeId, distance);
	}

}


