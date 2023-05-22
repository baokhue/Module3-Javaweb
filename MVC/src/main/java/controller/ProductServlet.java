package controller;

import bean.Product;
import service.ProductService;
import service.ProductServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", value = "/product")
public class ProductServlet extends HttpServlet {
    private ProductService service = new ProductServiceImpl();

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
            case "detail":
                showDetail(request, response);
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

    private void showSearchProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nameSearch = request.getParameter("name");
        Product product = service.search(nameSearch);
        request.setAttribute("product", product);
        request.getRequestDispatcher("/WEB-INF/search.jsp")
                .forward(request, response);
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> products = service.findAll();
        request.setAttribute("products", products);
        request.getRequestDispatcher("/WEB-INF/list.jsp")
                .forward(request, response);
    }

    private void showDeleteProduct(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/WEB-INF/delete.jsp")
                .forward(request, response);
    }

    private void showDetail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int idDetail = Integer.parseInt(request.getParameter("id"));
        Product product = service.findById(idDetail);
        request.setAttribute("product", product);
        request.getRequestDispatcher("/WEB-INF/detail.jsp")
                .forward(request, response);
    }

    private void showUpdate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int idDetail = Integer.parseInt(request.getParameter("id"));
        Product product = service.findById(idDetail);
        request.setAttribute("product", product);
        request.getRequestDispatcher("/WEB-INF/update.jsp")
                .forward(request, response);
    }

    private void showCreate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/create.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action) {
            case "create":
                doCreate(request, response);
                break;
            case "update":
                doUpdate(request, response);
                break;
            case "delete":
                doDel(request, response);
                break;
            default:
                response.sendRedirect("/product?action=list");
        }
    }

    private void doDel(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int idDetail = Integer.parseInt(request.getParameter("id"));
        if (service.delete(idDetail)){
            response.sendRedirect("/product");
        }
    }

    private void doUpdate(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        String detail = request.getParameter("detail");
        String producer = request.getParameter("producer");
        Product product = new Product(id, name, price, detail, producer);
        if (service.update(product)) {
            response.sendRedirect("/product");
        }
    }

    private void doCreate(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        String detail = request.getParameter("detail");
        String producer = request.getParameter("producer");
        Product product = new Product(id, name, price, detail, producer);
        if (service.create(product)) {
            response.sendRedirect("/product");
        } else {
            String errorMsg = "ID of product existed";
            request.setAttribute("error", errorMsg);
            request.getRequestDispatcher("/WEB-INF/create.jsp")
                    .forward(request, response);
        }
    }
}
