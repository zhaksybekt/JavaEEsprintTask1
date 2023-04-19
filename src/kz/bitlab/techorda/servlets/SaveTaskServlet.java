package kz.bitlab.techorda.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kz.bitlab.techorda.modules.Task;
import kz.bitlab.techorda.modules.DBManager;


import java.io.IOException;
@WebServlet(value = "/save-book")
public class SaveTaskServlet extends HttpServlet {
    @Override
    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("task_id"));
        String name = request.getParameter("task_name");
        String deadlinedate=request.getParameter("task_dd");
        String status=request.getParameter("task_status");

        Task task =
                DBManager.getTasks(id);
        if(task!=null){
            task.setName(name);
            task.setDeadlinedate(deadlinedate);
            task.setStatus(status);

            DBManager.updateTasks(task);
            response.sendRedirect("/details?book_id="+id);
        }else {
            response.sendRedirect("/");
        }
    }
}