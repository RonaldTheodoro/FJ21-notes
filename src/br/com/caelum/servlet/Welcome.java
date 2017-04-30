package br.com.caelum.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
    name="Welcome",
    urlPatterns={"/welcome", "/bemvindo"},
    initParams={
        @WebInitParam(name="parameter01", value="value01"),
        @WebInitParam(name="parameter02", value="value02")
    }
)
public class Welcome extends HttpServlet {
    private String parameter01;
    private String parameter02;

    @Override
    public void init(ServletConfig config) throws ServletException {
            super.init(config);
            this.parameter01 = config.getInitParameter("parameter01");
            this.parameter02 = config.getInitParameter("parameter02");
    }

    @Override
    protected void service(
            HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Welcome Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Hello World</h1>");
        out.println("<p>Parameter 01: " + parameter01 + "</p>");
        out.println("<p>Parameter 02: " + parameter02 + "</p>");
        out.println("</body>");
        out.println("</html>");

        out.close();
    }
}
