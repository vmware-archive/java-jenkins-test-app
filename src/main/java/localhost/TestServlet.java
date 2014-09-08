package localhost;

 import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns={"/test-servlet"})
public class TestServlet extends javax.servlet.http.HttpServlet {

public void service(javax.servlet.http.HttpServletRequest request,
                    javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, java.io.IOException
  {
      // Set response content type
      response.setContentType("text/html");

      // Actual logic goes here.
      java.io.PrintWriter out = response.getWriter();
      out.println("<h2>Hello from TestServlet!</h2>");
  }
}
