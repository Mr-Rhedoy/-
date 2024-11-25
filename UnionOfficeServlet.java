import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.ArrayList;

@WebServlet("/union-office")
public class UnionOfficeServlet extends HttpServlet {

    // Handle GET request to show the form
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        // Forward to the form page (index.jsp)
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }

    // Handle POST request after form submission
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        // Get the parameters from the form
        String firstName = request.getParameter("firstName");
        String surname = request.getParameter("surname");
        String fathersName = request.getParameter("fathersName");
        String mothersName = request.getParameter("mothersName");
        String mobileNumber = request.getParameter("mobileNumber");
        String dob = request.getParameter("dob");
        int holdingNumber = Integer.parseInt(request.getParameter("holdingNumber"));

        // Create the User object
        User user = new User(firstName, surname, fathersName, mothersName, mobileNumber, dob, holdingNumber);

        // Store the user object in the request attribute
        request.setAttribute("user", user);

        // Forward to the result page (result.jsp)
        RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
        dispatcher.forward(request, response);
    }
}
