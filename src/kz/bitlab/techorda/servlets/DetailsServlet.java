package kz.bitlab.techorda.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kz.bitlab.techorda.modules.Task;
import kz.bitlab.techorda.modules.DBManager;


import java.io.IOException;
@WebServlet(value = "/details")
public class DetailsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = -1;
        try{
            id = Integer.parseInt(request.getParameter("book_id"));
        }
        catch (Exception e){
        }
        Task task = DBManager.getTasks(id);
        request.setAttribute(
                "taski", task);
        request.getRequestDispatcher
                        ("/details.jsp").
                forward(request, response);
    }
}
