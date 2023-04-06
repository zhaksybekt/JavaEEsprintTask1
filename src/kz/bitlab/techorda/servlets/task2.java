package kz.bitlab.techorda.servlets;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import kz.bitlab.techorda.modules.DBManager;
import kz.bitlab.techorda.modules.WebPortal;
import java.io.IOException;
import java.util.List;

@WebServlet(value = "/home")


public class task2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<WebPortal> portal= DBManager.getAllTask();
        request.setAttribute("portal",portal);
        request.getRequestDispatcher("/home.jsp").forward(request,response);
    }


}
