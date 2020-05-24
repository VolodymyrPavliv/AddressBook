package com.mushroom;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/records/create")
public class CreateRecServlet extends HttpServlet {
   private AddressBook addressBook;

    @Override
    public void init() {
        addressBook = AddressBook.getInstance();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("error"," ");
        request.getRequestDispatcher("/WEB-INF/create-rec.jsp").forward(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String address = request.getParameter("address");

        Rec rec = new Rec(firstName,lastName, address);
        if(addressBook.creat(rec)) {
            response.sendRedirect("/records/list");
        }else {
            request.setAttribute("error","An error occurred! Please try again!");
            request.getRequestDispatcher("/WEB-INF/create-rec.jsp").forward(request,response);
        }
    }
}
