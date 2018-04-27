/**
 * 
 */
package com.schoolhouse.service;

import java.util.List;

import com.schoolhouse.model.Post;


/**
 * @author Haojie Ma
 * @date Dec 14, 2015
 */

public interface GenericService<E,K> {
	
	public void add(E entity) ;
    public void saveOrUpdate(E entity) ;
    public void update(E entity) ;
    public void remove(E entity);
    public E get(K key);
    public List<E> getAll() ;
	/**
	 * @param postId
	 * @return
	 */
}


