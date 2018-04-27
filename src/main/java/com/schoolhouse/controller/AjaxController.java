/**
 * 
 */
package com.schoolhouse.controller;

/**
 * @author Haojie Ma
 * @date Oct 21, 2015
 */

import java.util.HashMap;
import java.util.List;









import java.util.Map;

import javax.servlet.http.HttpServletRequest;











import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.schoolhouse.model.College;
import com.schoolhouse.model.House;
import com.schoolhouse.model.Post;
import com.schoolhouse.model.ResponseBody;
import com.schoolhouse.model.User;
import com.schoolhouse.service.CollegeService;
import com.schoolhouse.service.DistanceService;
import com.schoolhouse.service.HouseService;
import com.schoolhouse.service.PostService;
import com.schoolhouse.service.UserService;
import com.schoolhouse.views.Views;


@RestController
public class AjaxController {
	private static Logger log=Logger.getLogger(AjaxController.class);
	
	 @Autowired(required=true)
	 private CollegeService collegeService;
	 
	 @Autowired(required=true)
	 private DistanceService distanceService;
	 
	 @Autowired(required=true)
	 private HouseService houseService;
	 
	 @Autowired(required=true)
	 private PostService postService;
	 
	 @Autowired(required=true)
	 private UserService userService;
	 
	 
	
	 

	 
	
	@JsonView(Views.Summary.class)
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public ResponseBody<String,Object> search(HttpServletRequest request,@RequestBody String search) { // it will return the model

		ResponseBody<String,Object> result = new ResponseBody<String,Object>();
		log.info("request body is "+search);
		search=search.replace("\"", "");
		College college=collegeService.findCollegeByName(search);
		if(college==null)
			result.setMsg("no data returned");
		else{
			
			int collegeId=college.getId();
			int distance=3000;
			List<Long> houseList=distanceService.findHouseListByCollegeId(collegeId, distance);
			if(houseList==null||houseList.isEmpty()){
				result.setMsg("no data returned");
				result.setCode("200");
				log.error("We don't have any house info for "+search);
				return result;
			}
			List<House> posts=houseService.findHousesByList(houseList);
			Map<String,Object> map= new HashMap<String,Object>();
			map.put("CollegeInfo", college);
			map.put("HouseInfo", posts);
			result.setResult(map);
			result.setMsg("Succeed");
		}
			
		result.setCode("200");
	    return result;
	    

	}
	
	
	
	@JsonView(Views.Detail.class)
	@RequestMapping(value = "/postDetail", method = RequestMethod.GET)
	public ResponseBody<String,Object> getPostDetail(HttpServletRequest request) { // it will return the model

		Long postId=Long.valueOf(request.getParameter("pid"));
		ResponseBody<String,Object> result = new ResponseBody<String,Object>();
		log.info("request body is "+postId);
		//postId=postId.replace("\"", "");
		Post post=postService.findPostById(Long.valueOf(postId));
		if(post==null)
			result.setMsg("no data returned");
		else{
			long houseId=post.getHouse().getId();
			long userId=post.getUser().getId();
			House house=houseService.findHouseById(houseId);
			User user=userService.findUserById(userId);
			Map<String,Object> map= new HashMap<String,Object>();
			map.put("PostInfo",post);
			map.put("HouseInfo",house);
			map.put("UserInfo",user);
			result.setResult(map);
			result.setMsg("Succeed");
		}
		result.setCode("200");
	    return result;
	    

	}
	
}

