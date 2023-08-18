<%-- 
    Document   : erooe
    Created on : 19 May, 2023, 3:01:32 PM
    Author     : samolak67
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    String message = (String)request.getAttribute("error_message");
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="alert alert-danger alert-dismissible fade show" style="text-align: center">
            <%= message %>
            <button type="button" class="btn-close" data-bs-dismiss="alert"></button>
        </div>
    </body>
</html>

