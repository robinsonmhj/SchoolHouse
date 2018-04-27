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

import com.schoolhouse.dao.CollegeDao;
import com.schoolhouse.dao.GenericDao;
import com.schoolhouse.model.College;
import com.schoolhouse.service.CollegeService;

/**
 * @author Haojie Ma
 * @date Jun 30, 2016
 */

@Service
public class CollegeServiceImpl extends GenericServiceImpl<College,String> implements CollegeService{
	
	
	private CollegeDao collegeDao;
	public CollegeServiceImpl(){
		
		
	}
	
	@Autowired
    public CollegeServiceImpl(@Qualifier("CollegeDaoImpl") GenericDao<College, String> genericDao) {
        super(genericDao);
        this.collegeDao = (CollegeDao) genericDao;
    }
	
	
	@Override
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
	public College findCollegeByName(String name){
		 
		   return collegeDao.findCollegeByName(name);
		
	}
	@Override
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
	public List<College> findCollegeById(int id){
		
		return collegeDao.findCollegeById(id);
		
	}
}


