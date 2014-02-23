package com.github.crehn.restdemo.boundary;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;

/**
 * Necessary for CORS; makes it possible to access the documentation also
 * through a swagger-ui which is not deployed on the same domain
 */
public class ApiOriginFilter implements javax.servlet.Filter {
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
			ServletException {
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		httpResponse.addHeader("Access-Control-Allow-Origin", "*");
		httpResponse.addHeader("Access-Control-Allow-Headers", "Content-Type");
		httpResponse.addHeader("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT");
		chain.doFilter(request, response);
	}
	
	@Override
	public void destroy() {//
	}
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {//
	}
}