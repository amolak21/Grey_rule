/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.sp.backend;

import in.sp.dbqueries.DbQueries;
import in.sp.paths.PathsName;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
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
 * @author samolak67
 */
public class UploadStatus extends HttpServlet {

    String status_img_name = "", status_text = "";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload sfu = new ServletFileUpload(factory);

        try {
            // Parse the request to get file items.
            List<FileItem> fileItems = sfu.parseRequest(request);

            for (FileItem item : fileItems) {
                if (!item.isFormField()) {
                    if (item.getFieldName().equals("status_img")) {
                        status_img_name = new File(item.getName()).getName();
                        item.write(new File(PathsName.status_pic_path + status_img_name));
                    }
                } else {
                    if (item.getFieldName().equals("status_text")) {

                        status_text = item.getString();

                    }

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (status_img_name.equals("") && status_text.equals("")) {
            request.setAttribute("error_message", "Please select either status or image to upload ");
            RequestDispatcher rd1 = request.getRequestDispatcher("error.jsp");
            rd1.include(request, response);

            RequestDispatcher rd2 = request.getRequestDispatcher("profile.jsp");
            rd2.include(request, response);

        } else {
            HttpSession session = request.getSession();
            String email = (String) session.getAttribute("session_email");
            // date formatter
            DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd MMMM, yyyy");
            LocalDate date = LocalDate.now();
            String date1 = dtf1.format(date);

            DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm:ss");
            LocalTime time = LocalTime.now();
            String time1 = dtf2.format(time);

            boolean status = DbQueries.uploadStatus(email, status_text, status_img_name, date1, time1);
            if (status) {
                request.setAttribute("success_message", "status uploaded successfully ");
                RequestDispatcher rd1 = request.getRequestDispatcher("success.jsp");
                rd1.include(request, response);

                RequestDispatcher rd2 = request.getRequestDispatcher("profile.jsp");
                rd2.include(request, response);
            } else {
                request.setAttribute("error_message", "Status did not uploaded due to some error ,Try agian after some time ");
                RequestDispatcher rd1 = request.getRequestDispatcher("error.jsp");
                rd1.include(request, response);

                RequestDispatcher rd2 = request.getRequestDispatcher("profile.jsp");
                rd2.include(request, response);

            }

        }

    }

}
