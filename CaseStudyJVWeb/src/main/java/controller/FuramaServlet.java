package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "FuramaServlet", value = "/furama")
public class FuramaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "list";
        }

        switch (action) {
            case "create":
                showCreate(request, response);
                break;
            case "update":
                showUpdate(request, response);
                break;
            case "delete":
                showDeleteProduct(request,response);
                break;
            case "search":
                showSearchProduct(request, response);
                break;
            default:
                showList(request, response);
        }
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) {
    }

    private void showSearchProduct(HttpServletRequest request, HttpServletResponse response) {
    }

    private void showDeleteProduct(HttpServletRequest request, HttpServletResponse response) {
    }

    private void showUpdate(HttpServletRequest request, HttpServletResponse response) {
    }

    private void showCreate(HttpServletRequest request, HttpServletResponse response) {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
