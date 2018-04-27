/**
 * 
 */
package com.schoolhouse.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.schoolhouse.dao.DistanceDao;
import com.schoolhouse.model.Distance;


/**
 * @author Haojie Ma
 * @date Jul 19, 2016
 */
@Repository("DistanceDaoImpl")
public class DistanceDaoImpl extends GenericDaoImpl<Distance,String> implements DistanceDao{
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Long> getHouseListByCollegeId(int collegeId,int distance){
		
		Criteria cr=currentSession().createCriteria(Distance.class)
				.setProjection(Projections.projectionList().add(Projections.property("houseId"), "houseId"))
				.add(Restrictions.eq("collegeId", collegeId))
				.add(Restrictions.le("distance", distance));
	    return cr.list();
		
		
	}

}


