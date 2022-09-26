package com.example.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.io.PrintWriter;

@MultipartConfig
@WebServlet (name = "FileUploader", urlPatterns = "/FileUploader")
public class FileUploader extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.println("<html>" +
                "<body>" +
                "<h1>Please choose file to upload:</h1>" +
                "<form action=\"/FileUploader\" method=\"POST\" enctype=\"multipart/form-data\">" +
                "<input type=\"file\" name=\"file\"><br>" +
                "<input type=\"submit\" value=\"Upload\"/>" +
                "</form>" +
                "</body>" +
                "</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Part filePart = req.getPart("file");
        String fileName = filePart.getSubmittedFileName();
        for (Part part : req.getParts()){
            part.write("D:\\less1\\demo\\" + fileName);
        }
        resp.getWriter().print("The file uploaded successfully");
    }
}
