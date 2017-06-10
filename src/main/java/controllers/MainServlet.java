package controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Joey on 8-6-2017.
 */
@WebServlet(name = "main", urlPatterns = "/")
public class MainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("Hello, Student!");
        // https://youtu.be/D3nnjmK1GwE?t=3m35s
        // https://www.youtube.com/watch?v=dmMdLW92hBA
    }
}
