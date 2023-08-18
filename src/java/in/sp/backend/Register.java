package in.sp.backend;

import in.sp.dbqueries.DbQueries;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Deepesh Panwar
 */
public class Register extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name1");
        String email = request.getParameter("email1");
        String pass = request.getParameter("pass1");
        String gender = request.getParameter("gender1");
        String city = request.getParameter("city1");

        boolean status = DbQueries.checkEmailExist(email);
        if (status) {
            RequestDispatcher rd1 = request.getRequestDispatcher("index-header.jsp");
            rd1.include(request, response);

            request.setAttribute("error_message", "Email Id already exists ");

            RequestDispatcher rd2 = request.getRequestDispatcher("error.jsp");
            rd2.include(request, response);

            RequestDispatcher rd3 = request.getRequestDispatcher("index-body.jsp");
            rd3.include(request, response);

            RequestDispatcher rd4 = request.getRequestDispatcher("index-footer.jsp");
            rd4.include(request, response);
        } else {
            boolean status2 = DbQueries.registerUser(name, email, pass, gender, city);
            if (status2) {
                HttpSession session = request.getSession();
                session.setAttribute("session_name", name);
                session.setAttribute("session_email", email);
                session.setAttribute("session_gender", gender);
                session.setAttribute("session_city", city);

                if (gender.equals("Male")) {

                    session.setAttribute("session_profilepic", "male.png");
                } else {

                    session.setAttribute("session_profilepic", "female.png");

                }
                session.setAttribute("session_profilepic", "");

                response.sendRedirect("profile.jsp");
            } else {
                RequestDispatcher rd1 = request.getRequestDispatcher("index-header.jsp");
                rd1.include(request, response);

                request.setAttribute("error_message", "User Not registered due to some error");

                RequestDispatcher rd2 = request.getRequestDispatcher("error.jsp");
                rd2.include(request, response);

                RequestDispatcher rd3 = request.getRequestDispatcher("index-body.jsp");
                rd3.include(request, response);

                RequestDispatcher rd4 = request.getRequestDispatcher("index-footer.jsp");
                rd4.include(request, response);
            }
        }
    }
}
