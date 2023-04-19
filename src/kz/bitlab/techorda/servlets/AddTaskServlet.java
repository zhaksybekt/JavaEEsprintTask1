package kz.bitlab.techorda.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kz.bitlab.techorda.modules.Task;
import kz.bitlab.techorda.modules.DBManager;


import java.io.IOException;

@WebServlet(value = "/add-book")
public class AddTaskServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("task_name");
        String deadlinedate=request.getParameter("task_dd");
        String status=request.getParameter("task_status");


        Task task = new Task();
        task.setName(name);
        task.setDeadlinedate(deadlinedate);
        task.setStatus(status);

        DBManager.addTasks(task);
        response.sendRedirect("home.html");

    }
}
