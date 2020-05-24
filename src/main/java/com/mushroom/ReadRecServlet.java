package com.mushroom;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/records/read")
public class ReadRecServlet extends HttpServlet {
    private AddressBook addressBook;

    @Override
    public void init() {
        addressBook = AddressBook.getInstance();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Rec rec = addressBook.read(request.getParameter("firstName"),request.getParameter("lastName"));
        request.setAttribute("rec", rec);
        request.getRequestDispatcher("/WEB-INF/read-rec.jsp").forward(request,response);
    }
}
