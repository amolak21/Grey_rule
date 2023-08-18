/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.sp.backend;

import in.sp.dbqueries.DbQueries;
import java.io.IOException;
import java.io.PrintWriter;
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
public class DeleteProfile extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        HttpSession session = request.getSession();
        String email = (String) session.getAttribute("session_email");
        
        boolean status1 = DbQueries.deleteUserProfileDetails(email);
        boolean status2 = DbQueries.deleteUserStatusDetails(email);
        
        if(status1 && status2)
        {
            response.sendRedirect("index.jsp");
        }
        else
        {
            request.setAttribute("error_message", "User not deleted due to some error");
            RequestDispatcher rd1 = request.getRequestDispatcher("error.jsp");
            rd1.include(request, response);

            RequestDispatcher rd2 = request.getRequestDispatcher("edit-my-profile.jsp");
            rd2.include(request, response);
        }
    }
    
}
