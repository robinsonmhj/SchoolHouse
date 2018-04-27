/**
 * 
 */
package com.schoolhouse.dao;



import com.schoolhouse.model.User;



/**
 * @author Haojie Ma
 * @date Dec 11, 2015
 */


public interface UserDao extends GenericDao<User,String>{
	
    public User getUserById(long userId);

   

}


