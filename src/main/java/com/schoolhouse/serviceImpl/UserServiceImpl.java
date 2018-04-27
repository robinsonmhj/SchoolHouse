/**
 * 
 */
package com.schoolhouse.serviceImpl;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.schoolhouse.dao.GenericDao;
import com.schoolhouse.dao.UserDao;
import com.schoolhouse.model.User;
import com.schoolhouse.service.UserService;






/**
 * @author Haojie Ma
 * @date Dec 14, 2015
 */


@Service
public class UserServiceImpl extends GenericServiceImpl<User,String> implements UserService{

	private UserDao userDao;
	public UserServiceImpl(){
		
		
	}
	
	
	@Autowired
    public UserServiceImpl(@Qualifier("UserDaoImpl")GenericDao<User, String> genericDao) {
        super(genericDao);
        this.userDao = (UserDao) genericDao;
    }
	


    
    
    @Override
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public User findUserById(long userId){
    	
    	return userDao.getUserById(userId);
    	
    }

	
}


