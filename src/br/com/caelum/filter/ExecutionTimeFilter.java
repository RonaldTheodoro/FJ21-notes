package br.com.caelum.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/*")
public class ExecutionTimeFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        
    }

    @Override
    public void doFilter(
            ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        long startTime = System.currentTimeMillis();
        
        chain.doFilter(request, response);
        
        long endTime = System.currentTimeMillis();
        
        String uri = ((HttpServletRequest)request).getRequestURI();
        String parameters = ((HttpServletRequest)request).getParameter("logic");
        System.out.println("URI: " + uri + "?logic=" + parameters);
        System.out.println("Request time: " + (endTime - startTime));
    }

    @Override
    public void destroy() {
        
    }
    
}
