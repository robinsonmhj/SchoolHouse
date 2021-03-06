/**
 * 
 */
package com.schoolhouse.interceptor;

/**
 * @author Haojie Ma
 * @date Oct 27, 2015
 */
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.log4j.Logger;

public class ErrorHandler implements Filter {

	private static Logger log=Logger.getLogger(ErrorHandler.class);
	
	
	@Override
	public void destroy() {
		// ...
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		//
	}

	@Override
	public void doFilter(ServletRequest request, 
               ServletResponse response, FilterChain chain)
		throws IOException, ServletException {

		
		HttpServletResponse s=(HttpServletResponse)response;
		HttpServletRequest r=(HttpServletRequest)request;
		try {
			chain.doFilter(request, response);
			
		} catch (Exception ex) {
			//request.setAttribute("errorMessage", ex);
			//System.out.println(r.getContextPath());
			//request.getRequestDispatcher(r.getContextPath()+"/error").forward(request, response);;
			log.info("",ex);
			s.sendRedirect(r.getContextPath()+"/error");
			return;
		}

	}

}


