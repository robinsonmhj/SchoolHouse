/**
 * 
 */
package com.schoolhouse.service;

import com.schoolhouse.model.User;






/**
 * @author Haojie Ma
 * @date Dec 14, 2015
 */

public interface UserService extends GenericService<User,String>{
    public User findUserById(long userId);

}


