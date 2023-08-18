/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class DeleteStatus extends HttpServlet 
{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String date1 = request.getParameter("date1");
        String time1 = request.getParameter("time1");
        
        HttpSession session = request.getSession();
        String email1 = (String) session.getAttribute("session_email");
        
        try
        {
            boolean status = DbQueries.deleteStatus(email1, date1, time1);
            if(status)
            {
                request.setAttribute("success_message", "Status deleted successfully");
                RequestDispatcher rd1 = request.getRequestDispatcher("profile.jsp");
                rd1.forward(request, response);
            }
            else
            {
                request.setAttribute("error_message", "Status not deleted due to some error");
                RequestDispatcher rd1 = request.getRequestDispatcher("profile.jsp");
                rd1.forward(request, response);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
