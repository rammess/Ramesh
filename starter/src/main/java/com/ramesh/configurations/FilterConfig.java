package com.ramesh.configurations;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ramesh.SessionLogFilter;

@Configuration
public class FilterConfig {

	SessionLogFilter sessionLogFilter;

	public FilterConfig(SessionLogFilter sessionLogFilter) {
		this.sessionLogFilter = sessionLogFilter;
	}
	
	@Bean
	public FilterRegistrationBean<SessionLogFilter> loggingFilter() {
		FilterRegistrationBean<SessionLogFilter> registrationBean = new FilterRegistrationBean<>();
		registrationBean.setFilter(sessionLogFilter);
		registrationBean.addUrlPatterns(
				"/pages/*"
		);
		return registrationBean;
	}

}
