/**
 * 
 */
package com.schoolhouse.daoImpl;

import java.util.List;


import org.hibernate.Query;

import org.springframework.stereotype.Repository;

import com.schoolhouse.dao.CollegeDao;
import com.schoolhouse.model.College;

/**
 * @author Haojie Ma
 * @date Jun 30, 2016
 */
@Repository("CollegeDaoImpl")
public class CollegeDaoImpl extends GenericDaoImpl<College,String> implements CollegeDao{

	@Override
	public College findCollegeByName(String collgeName){
		

		Query query = currentSession().createQuery("from College where name=:collgeName");
	    query.setString("collgeName", collgeName);
	    return (College)query.uniqueResult();

		
		/*
		Query query = currentSession().createQuery("from College c join c.distance as d join d.house as h join h.post as p where name=:collgeName and d.distance<3000 and p.forRent=1 and p.status=1");
	    query.setString("collgeName", collgeName);
	    return query.list();
		*/
		
		/*
		Criteria cr = currentSession().createCriteria(College.class)
			    .setProjection(Projections.projectionList()
			      .add(Projections.property("name"), "name")
			      .add(Projections.property("lat"), "lat")
			      .add(Projections.property("lng"), "lng"))
			      .add( Restrictions.eq("name", collgeName))
			    .setResultTransformer(Transformers.aliasToBean(College.class));
		
		return (College) cr.uniqueResult();
		*/
		
		
	}
	@SuppressWarnings("unchecked")
	public List<College> findCollegeById(int collegeId){
		Query query = currentSession().createQuery("from College where id=:collegeId");
	    query.setInteger("collegeId", collegeId);
	    return query.list();
	}
	

	
	

}


