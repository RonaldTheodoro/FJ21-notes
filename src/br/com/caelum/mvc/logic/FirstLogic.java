package br.com.caelum.mvc.logic;

import br.com.caelum.mvc.logic.Logic;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstLogic implements Logic {

    @Override
    public String execute(
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        System.out.println("Execute first logic");
        System.out.println("Return a JSP page name");
        
        return "first-logic.jsp";
    }
    
}
