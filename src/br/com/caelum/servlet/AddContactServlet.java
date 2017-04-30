package br.com.caelum.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.model.Contact;
import br.com.caelum.model.dao.ContactDAO;
import java.sql.Connection;
import javax.servlet.RequestDispatcher;

@WebServlet("/addContact")
public class AddContactServlet extends HttpServlet {
	   
    @Override
    protected void service(
            HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {     
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String email = request.getParameter("email");
        String dateText = request.getParameter("birthDate");
        Calendar birthDate = null;

        try {
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dateText);
            birthDate = Calendar.getInstance();
            birthDate.setTime(date);
        } catch (ParseException error) {
            out.println("Data convertion error: " + error.getMessage());
            return ;
        }

        Contact contact = new Contact();

        contact.setName(name);
        contact.setEmail(email);
        contact.setAddress(address);
        contact.setBirthDate(birthDate);

        Connection connection = (Connection) request.getAttribute("connection");
        ContactDAO contactDAO = new ContactDAO(connection);
        contactDAO.addContact(contact);

        RequestDispatcher requestDispatcher;
        requestDispatcher = request.getRequestDispatcher("/contact-added.jsp");
        requestDispatcher.forward(request, response);
    }
}
