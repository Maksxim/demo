package com.example.demo.servlets.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet (name = "LogoutServlet", urlPatterns = "/logout")
public class LogoutServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {


        final HttpSession session = req.getSession();

        session.removeAttribute("password");
        session.removeAttribute("login");
        session.removeAttribute("role");

        req.getRequestDispatcher("/WEB-INF/view/login.html").forward(req, res);
    }

}
