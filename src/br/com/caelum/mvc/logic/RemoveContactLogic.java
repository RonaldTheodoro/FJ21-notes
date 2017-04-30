package br.com.caelum.mvc.logic;

import br.com.caelum.model.Contact;
import br.com.caelum.model.dao.ContactDAO;
import java.sql.Connection;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RemoveContactLogic implements Logic {

    @Override
    public String execute(
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        long id = Long.parseLong(request.getParameter("id"));
        
        Contact contact = new Contact();
        
        contact.setId(id);
        Connection connection = (Connection) request.getAttribute("connection");
        ContactDAO contactDAO = new ContactDAO(connection);
        contactDAO.removeContact(contact);
        
        System.out.println("Remove contact");
        
        return "mvc?logic=ListContactsLogic";
    }
    
}
