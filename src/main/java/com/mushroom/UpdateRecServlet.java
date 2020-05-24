package com.mushroom;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/records/update")
public class UpdateRecServlet extends HttpServlet {
    private AddressBook addressBook;
    private Rec rec;

    @Override
    public void init() {
        addressBook = AddressBook.getInstance();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        rec = addressBook.read(request.getParameter("firstName"),request.getParameter("lastName"));
        request.setAttribute("rec", rec);
        request.getRequestDispatcher("/WEB-INF/update-rec.jsp").forward(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        rec.setFirstName(request.getParameter("firstName"));
        rec.setLastName(request.getParameter("lastName"));
        rec.setAddress(request.getParameter("address"));
        addressBook.update(rec.getFirstName(),rec.getLastName(),rec);
        response.sendRedirect("/rec/list");
    }
}

