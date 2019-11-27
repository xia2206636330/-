package com.gaze.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends  HandlerInterceptorAdapter{
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
    		throws Exception {
    	HttpSession session =request.getSession();
    	Object object =session.getAttribute("login");
    	if(object==null) {
    		response.sendRedirect("jsp/login.jsp");
    		return false;
    	}else {
    		
    		return true;
    	}
//    	return super.preHandle(request, response, handler);
    }

}
