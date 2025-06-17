package com.example.servlet;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author josesaidolanogarcia
 */ // Definimos el servlet con la anotación @WebServlet
@WebServlet("/calculateServlet")
public class CalculateServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Configurar la respuesta
        response.setContentType("text/html");

        // Obtener parámetros de la solicitud (si aplica)
        String param1 = request.getParameter("param1");
        String param2 = request.getParameter("param2");
        String nombre = request.getParameter("param3");

        // Ejemplo de cálculo
        int result = 0;
        if (param1 != null && param2 != null) {
            try {
                int number1 = Integer.parseInt(param1);
                int number2 = Integer.parseInt(param2);
                result = number1 + number2; // Realiza un cálculo simple
            } catch (NumberFormatException e) {
                response.getWriter().println("Parámetros inválidos.");
                return;
            }
        }

        // Escribir la respuesta
        response.getWriter().println("<html><body>");
        response.getWriter().println("<h1>Resultado del cálculo: " + result + "</h1>");
        response.getWriter().println("<h1>Nombre: " + nombre + "</h1>");
        response.getWriter().println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Aquí puedes implementar lógica similar a la del método doGet o diferente según el caso
        doGet(request, response);
    }
}