package com.oraclejava;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

@WebServlet("/CalcBmi")
public class CalcBmi extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String height = req.getParameter("height");
        String weight = req.getParameter("weight");

        double height2 = Double.parseDouble(height);
        double weight2 = Double.parseDouble(weight);
        double bmi = weight2 / (height2 / 100) * (height2 / 100);

        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("<html><head><title>Hello World2</title></head><body>");
        out.println("키 : " + height + "cm" + "<br>");
        out.println("몸무게 : " + weight + "cm" + "<br>");
        out.println("Bmi : " +bmi + "<br>");
        out.println("</body></html>");
        out.close();
    }
}
