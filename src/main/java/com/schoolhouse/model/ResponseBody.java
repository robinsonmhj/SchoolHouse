/**
 * 
 */
package com.schoolhouse.model;


import java.util.Map;

import com.fasterxml.jackson.annotation.JsonView;
import com.schoolhouse.views.Views;


/**
 * @author Haojie Ma
 * @date Jul 18, 2016
 */
public class ResponseBody<K,V> {
	
	
	@JsonView(Views.Public.class)
	String msg;
	
	@JsonView(Views.Public.class)
	String code;
	
	@JsonView(Views.Public.class)
	Map<K,V> result;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Map<K,V> getResult() {
		return result;
	}

	public void setResult(Map<K,V> result) {
		this.result = result;
	}


}


