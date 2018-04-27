/**
 * 
 */
package com.schoolhouse.daoImpl;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.schoolhouse.dao.PostDao;
import com.schoolhouse.model.Post;

/**
 * @author Haojie Ma
 * @date Jul 19, 2016
 */

@Repository("PostDaoImpl")
public class PostDaoImpl extends GenericDaoImpl<Post,String> implements PostDao {

	@Override
	public Post getPostById(long postId) {
		
		
		Query query = currentSession().createQuery("from Post p where id=:postId");
	    query.setLong("postId", postId);
	    
	    return (Post)query.uniqueResult();
		
	}

}


