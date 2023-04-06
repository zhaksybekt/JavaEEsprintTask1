package kz.bitlab.techorda.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import kz.bitlab.techorda.modules.DBManager;
import kz.bitlab.techorda.modules.WebPortal;


import java.io.IOException;
@WebServlet(value = "/details")
public class DetailsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long id= Long.valueOf(request.getParameter("id"));
        WebPortal portal= DBManager.getTask(id);
        if (portal!=null){
            request.setAttribute("portal",portal);
            request.getRequestDispatcher("/details.jsp").forward(request,response);

        }
        else{
            request.getRequestDispatcher("/404.jsp").forward(request,response);
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}

