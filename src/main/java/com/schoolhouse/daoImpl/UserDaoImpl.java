/**
 * 
 */
package com.schoolhouse.daoImpl;


import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.schoolhouse.dao.UserDao;
import com.schoolhouse.model.User;



/**
 * @author Haojie Ma
 * @date Dec 11, 2015
 */



@Repository("UserDaoImpl")
public class UserDaoImpl extends GenericDaoImpl<User,String> implements UserDao{
	
	@Override
    public User getUserById(long userId){
		Query query = currentSession().createQuery("from User where id=:userId");
        query.setParameter("userId", userId);
        return (User) query.uniqueResult();
	}
	
	
}


