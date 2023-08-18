/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.sp.backend;

import in.sp.dbqueries.DbQueries;
import java.io.IOException;
import java.sql.ResultSet;
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
public class Login extends HttpServlet 
{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String email = request.getParameter("email1");
        String pass = request.getParameter("pass1");
        
        ResultSet rs = DbQueries.login(email, pass);
        try
        {
            if(rs.next())
            {
                HttpSession session = request.getSession();
                session.setAttribute("session_name", rs.getString("name"));
                session.setAttribute("session_email", email);
                session.setAttribute("session_gender", rs.getString("gender"));
                session.setAttribute("session_city", rs.getString("city"));
                session.setAttribute("session_profilepic", rs.getString("profile_pic"));
                
                response.sendRedirect("profile.jsp");
            }
            else
            {
                request.setAttribute("error_message", "Email Id and Password did not match ");
                RequestDispatcher rd1 = request.getRequestDispatcher("error.jsp");
                rd1.include(request, response);
                
                RequestDispatcher rd2 = request.getRequestDispatcher("index.jsp");
                rd2.include(request, response);
                
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
