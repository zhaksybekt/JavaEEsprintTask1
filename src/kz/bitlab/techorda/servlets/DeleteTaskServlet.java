package kz.bitlab.techorda.servlets;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import kz.bitlab.techorda.modules.DBManager;
import java.io.IOException;
@WebServlet(value = "/DeleteTaskServlet")
public class DeleteTaskServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));
        DBManager.deleteTask(id);
        response.sendRedirect("home.jsp");
    }
}
