package vn.hcmuaf.edu.fit;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "Servlet", value = "/Servlet")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println("Hello Get");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uname = request.getParameter("uname");
        String pass = request.getParameter("pass");
        if(uname == null || pass == null){
            request.setAttribute("error", "Username và Password không được bỏ trống");
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }else if (uname.equals("ti") && pass.equals("123")){
            response.sendRedirect("/");
        }else{
            request.setAttribute("error", "Sai Username hoặc Password");
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }
        response.getWriter().println("Username: "+uname);
        response.getWriter().println("Password: "+pass);
    }
}
