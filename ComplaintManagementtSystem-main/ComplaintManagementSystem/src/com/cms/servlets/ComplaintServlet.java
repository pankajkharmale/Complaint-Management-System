
package com.cms.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ComplaintServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title = request.getParameter("title");
        String description = request.getParameter("description");

        request.setAttribute("message", "Complaint submitted successfully!");
        request.getRequestDispatcher("enterComplaint.jsp").forward(request, response);
    }
}
