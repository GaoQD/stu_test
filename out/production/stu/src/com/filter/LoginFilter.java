package com.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName LoginFilter
 * @Author THINK
 * @Date 2019/9/11 10:30
 */

public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse)servletResponse;
        Object user = request.getSession().getAttribute("user");
        if (user == null) {
            response.sendRedirect("index.jsp");
        } else {
            filterChain.doFilter(request,response);
        }
    }

    @Override
    public void destroy() {

    }
}
