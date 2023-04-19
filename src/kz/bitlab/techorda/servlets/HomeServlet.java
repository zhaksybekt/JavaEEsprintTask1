package kz.bitlab.techorda.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kz.bitlab.techorda.modules.Task;
import kz.bitlab.techorda.modules.DBManager;


import java.io.IOException;
import java.util.ArrayList;
@WebServlet(value = "/home.html")
public class HomeServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Task> tasks = DBManager.getTasks();
        request.setAttribute("taski", tasks);
        request.getRequestDispatcher("/books.jsp").forward(request, response);
    }
}