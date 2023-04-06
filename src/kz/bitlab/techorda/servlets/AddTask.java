package kz.bitlab.techorda.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import kz.bitlab.techorda.modules.DBManager;
import kz.bitlab.techorda.modules.WebPortal;

import java.io.IOException;

@WebServlet( value = "/")
public class AddTask extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/addtask.jsp").forward(request,response);

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name=request.getParameter("name");
        String status=request.getParameter("status");
        String deadline=request.getParameter("deadline");
        String description=request.getParameter("description");
        WebPortal ts=new WebPortal(1l,name,description,deadline,status);
        DBManager.addTask(ts);
        response.sendRedirect("/?success");}

}
