package servlet;

import model.Calculator;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", value = "/calculator")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("calculator/calculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float firstNumber = Float.parseFloat(request.getParameter("firstNumber"));
        request.setAttribute("firstNumber", firstNumber);
        float secondNumber = Float.parseFloat(request.getParameter("secondNumber"));
        request.setAttribute("secondNumber", secondNumber);
        char operator = request.getParameter("operator").charAt(0);
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Result:</h1>");
        try{
            float result = Calculator.calculator(firstNumber, secondNumber, operator);
            writer.println(firstNumber + " " + operator + " " + secondNumber + " = " + result);
        }catch (Exception ex){
            writer.println("Error: " + ex.getMessage());
        }
        writer.println("</html>");
    }
}
