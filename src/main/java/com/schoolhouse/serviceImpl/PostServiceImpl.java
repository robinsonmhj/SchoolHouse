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
import com.schoolhouse.dao.PostDao;
import com.schoolhouse.model.Post;
import com.schoolhouse.service.PostService;

/**
 * @author Haojie Ma
 * @date Jul 19, 2016
 */

@Service
public class PostServiceImpl extends GenericServiceImpl<Post,String> implements PostService{
	
	
	private PostDao postDao;
	public PostServiceImpl(){
		
		
	}
	
	@Autowired
    public PostServiceImpl(@Qualifier("PostDaoImpl") GenericDao<Post, String> genericDao) {
        super(genericDao);
        this.postDao = (PostDao) genericDao;
    }
	
	
	@Override
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
	public Post findPostById(long postId){
		 
		   return postDao.getPostById(postId);
		
	}
	

}


