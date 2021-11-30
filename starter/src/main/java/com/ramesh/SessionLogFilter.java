package com.ramesh;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.context.support.WebApplicationContextUtils;

@Component
public class SessionLogFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		//WebApplicationContextUtils.getRequiredWebApplicationContext(filterConfig.getServletContext());
		//Test appliation
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// HttpServletRequest httpReq = (HttpServletRequest) request;
		chain.doFilter(request, response);

	}

}
