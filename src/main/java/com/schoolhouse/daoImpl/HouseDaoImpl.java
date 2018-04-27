/**
 * 
 */
package com.schoolhouse.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.schoolhouse.dao.HouseDao;
import com.schoolhouse.model.House;

/**
 * @author Haojie Ma
 * @date Jul 19, 2016
 */
@Repository("HouseDaoImpl")
public class HouseDaoImpl extends GenericDaoImpl<House,String> implements HouseDao{
	
	@SuppressWarnings("unchecked")
	@Override
	public List<House> getHousesByList(List<Long> houseList){
		Query query = currentSession().createQuery("from House h join h.post as p where h.id in (:houseList) and p.forRent=1 and p.status=1");
	    query.setParameterList("houseList", houseList);
	    return query.list();
	}
	
	@Override
	public House getHouseById(long houseId){
		//Query query = currentSession().createQuery("from House h join h.type as t where h.id =:houseId");
		Query query = currentSession().createQuery("from House h where h.id =:houseId");
	    query.setLong("houseId", houseId);
	    return (House)query.uniqueResult();
	}

}


