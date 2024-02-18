package org.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/form")
public class FormServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        PrintWriter printWriter = resp.getWriter();

        String username = req.getParameter("username");
        String userAge = req.getParameter("userage");
        String gender = req.getParameter("gender");
        String country = req.getParameter("country");
        String []languages = req.getParameterValues("languages");

        printWriter.println("<p>username: " + username + "</p");
        printWriter.println("<p>userage: " + userAge + "</p");
        printWriter.println("<p>gender: " + gender + "</p");
        printWriter.println("<p>country: " + country + "</p");
        printWriter.println("<p>languages</p>");
        for (String language:languages) {
            printWriter.println("<li>" + language + "</li>");
        }



    }
}
