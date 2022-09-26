package com.example.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet (name = "Task", urlPatterns = "/task")
public class Task extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.println("<html>" +
                "<h1>Homework</h1>" +
                "<h2> <a href=\"/FileUploader\">Work 1</a> , <a href=\"/User\">Work 2</a></h2>" +
                "</html>");
    }
}
