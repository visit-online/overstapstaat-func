package io.quarkus;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServletOverstapStaat", urlPatterns = "/servlet/overstapstaat")
public class OverstapStaatServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setStatus(200);
        resp.addHeader("Content-Type", "text/plain");
        resp.getWriter().write("OverstapStaat servlet");
    }
}
