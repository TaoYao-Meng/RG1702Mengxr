import javax.servlet.annotation.WebServlet;
import java.io.IOException;

    @WebServlet(urlPatterns = "/mult")
    public class Servlet2 extends javax.servlet.http.HttpServlet {
        @Override
        protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        }

        @Override
        protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

            String a = request.getParameter("a");
            String b = request.getParameter("b");
            int c = Integer.parseInt(a)*Integer.parseInt(b);
            response.getWriter().println(c);


        }
    }

