/**
 * 
 */
package com.schoolhouse.dao;


import com.schoolhouse.model.Post;

/**
 * @author Haojie Ma
 * @date Jul 19, 2016
 */
public interface PostDao extends GenericDao<Post,String>{
	
	public Post getPostById(long id);

}


