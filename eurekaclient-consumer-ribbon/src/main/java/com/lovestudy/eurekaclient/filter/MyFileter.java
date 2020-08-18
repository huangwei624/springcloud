package com.lovestudy.eurekaclient.filter;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Order(1)
@Component
public class MyFileter implements Filter {
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("===============init==================");
	}
	
	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
		System.out.println("===============dofilter==================");
		
		// 处理逻辑
		
		
		filterChain.doFilter(servletRequest, servletResponse);
	}
	
	@Override
	public void destroy() {
		System.out.println("===============destroy==================");
	}
}
