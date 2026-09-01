package com.oraclejava;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

@WebServlet("/hello2")
public class HelloServlet2 extends HttpServlet {

    private ServletContext context;

    @Override
    public void init(ServletConfig config) throws ServletException{
        context = config.getServletContext();
        context.log(LocalDateTime.now() + "예 : hello");
        System.out.println(LocalDateTime.now() + "  예 : hello");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("<html><head><title>Hello World2</title></head><body>");
        out.println("안녕2");
        out.println(LocalDateTime.now());
        out.println("</body></html>");
        out.close();

    }

    @Override
    public void destroy() {
        context.log(LocalDateTime.now() + "예 : hello 정지");
        System.out.println(LocalDateTime.now() + "  예 : hello 정지");
    }
}
