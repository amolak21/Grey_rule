package in.sp.backend;

import in.sp.dbqueries.DbQueries;
import in.sp.paths.PathsName;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author Deepesh Panwar
 */
public class UpdateProfilePic extends HttpServlet
{
    String attachment_name;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.setContentType("text/html");

        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload sfu = new ServletFileUpload(factory);

        try
        {
            // Parse the request to get file items.
            List<FileItem> fileItems = sfu.parseRequest(request);
            
            for(FileItem item : fileItems)
            {
                if(!item.isFormField())
                {
                    if(item.getFieldName().equals("profile_pic_file"))
                    {
                        attachment_name = new File(item.getName()).getName();
                        item.write(new File(PathsName.profile_pic_path+attachment_name));
                    }
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        try
        {
            HttpSession session = request.getSession();
            
            String email = (String) session.getAttribute("session_email");
            
            boolean status = DbQueries.updateProfilePic(email, attachment_name);
            if(status)
            {
                session.setAttribute("session_profilepic", attachment_name);
                
                request.setAttribute("success_message", "Profile pic updated successfully");
                RequestDispatcher rd1 = request.getRequestDispatcher("success.jsp");
                rd1.include(request, response);

                RequestDispatcher rd2 = request.getRequestDispatcher("edit-my-profile.jsp");
                rd2.include(request, response);
            }
            else
            {
                request.setAttribute("error_message", "Profile pic not updated due to some error");
                RequestDispatcher rd1 = request.getRequestDispatcher("error.jsp");
                rd1.include(request, response);

                RequestDispatcher rd2 = request.getRequestDispatcher("edit-my-profile.jsp");
                rd2.include(request, response);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
