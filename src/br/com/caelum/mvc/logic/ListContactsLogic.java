package br.com.caelum.mvc.logic;

import br.com.caelum.model.Contact;
import br.com.caelum.model.dao.ContactDAO;
import java.sql.Connection;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListContactsLogic implements Logic {

    @Override
    public String execute(
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        Connection connection = (Connection) request.getAttribute("connection");
        List<Contact> contacts = new ContactDAO(connection).getListContacts();
        
        request.setAttribute("contacts", contacts);
        return "WEB-INF/jsp/list-contacts.jsp";
    }
}
