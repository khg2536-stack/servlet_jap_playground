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
import java.sql.*;

@WebServlet("/FoodsList")
public class FoodsList extends HttpServlet {

    private ServletContext context;
    private Connection conn;

    @Override
    public void init(ServletConfig config) throws ServletException {
        context = config.getServletContext();
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1",
                    "system", "oraclejava");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void destroy() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("<!doctype html><html lang=ko><head><meta charset=utf-8><title>음식목록</title>");
        out.println("</head><body>");
        try {
            String foodname = null;
            String category = null;
            int price = 0;
            String html = null;
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM foodlist";
            ResultSet rs = stmt.executeQuery(sql);
            out.println("<table border=\"1\"><tr><th>음식명</th><th>카테고리</th><th>가격</th></tr>");
            while (rs.next()) {
                foodname = rs.getString("foodname");
                category = rs.getString("category");
                price = rs.getInt("price");
                html = "<tr><td>" + foodname + "</td>";
                html += "<td>" + category + "</td>";
                html += "<td>" + price + "</td></tr>";
                out.println(html);
            }
            out.println("</table>");
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        out.println("</body></html>");
        out.close();
    }
}