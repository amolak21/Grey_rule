<%@page import="java.sql.ResultSet"%>
<%@page import="in.sp.dbqueries.DbQueries"%>
<%
    String user_email = (String) request.getParameter("email");
    
    if(user_email.equals((String)session.getAttribute("session_email")))
    {
        response.sendRedirect("profile.jsp");
    }
    
    String user_name="", user_gender="", user_city="", user_profile_pic="";
    try
    {
        ResultSet rs = DbQueries.userProfileDetails(user_email);
        while(rs.next())
        {
            user_name = rs.getString("name");
            user_gender = rs.getString("gender");
            user_city = rs.getString("city");
            user_profile_pic = rs.getString("profile_pic");
        }
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
%>


<html>
    <head>
        <title>My Profile</title>

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" />
        <link rel ="stylesheet" type="text/css" href ="css/style.css"/>

        <link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.2/font/bootstrap-icons.css" />

        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" ></script>


    </head>
    <body>

        <!-- header div starts -->
        <div class="container-fluid bg-secondary header_div">
            <div class="container">
                <div class="row">
                    <div class="col-4" >
                        <a href="home.jsp" class="navbar-brand text-light"  >GREY RULE</a>
                    </div>
                    <div class="col-3 ">
                    </div>
                    <div class="col-5">
                       <a href="profile.jsp" style="text-decoration: none">
                        <img src="profile-pics/<%=session.getAttribute("session_profilepic")%>" alt="" class="img-fluid dp_img_style" />
                        <span class="text-light"> <%= session.getAttribute("session_name")%> </span>
                        </a>
                        &nbsp;&nbsp;
                        <button type="button" class="btn btn-info dropdown-toggle dropdown-toggle btn-sm" data-bs-toggle="dropdown">More</button>
                        <ul class="dropdown-menu">
                            <li><a href="home.jsp" class="dropdown-item  "> Home</a></li>
                            <li><a href="profile.jsp" class="dropdown-item "> My Profile</a></li>
                            <li><a href="edit-my-profile.jsp" class="dropdown-item">Edit My Profile</a></li>
                            <li><a href="logout" class="dropdown-item">Logout</a></li>

                        </ul>

                    </div>

                </div>
            </div>
        </div>
        <!-- header div end -->

        <div class="container-fluid">
            <div class="container">
                <div class="row" style="padding: 40px">
                    <!-- Side bar div starts -->
                    <div class="col-3 shadow-sm p-3 mb-5 bg-body rounded">
                        <nav id="sidebarMenu" class="collapse d-lg-block sidebar collapse bg-white" >
                            <div class="position-sticky">
                                <div class="list-group list-group-flush mx-3 mt-4">
                                    <a href="home.jsp" class="list-group-item list-group-item-action py-2 ripple ">
                                        <i class="bi bi-newspaper"></i> <span>News Feed</span>
                                    </a>
                                    <a href="#" class="list-group-item list-group-item-action py-2 ripple">
                                        <i class="bi bi-wechat"></i> <span>Messenger</span>
                                    </a>
                                    <a href="#" class="list-group-item list-group-item-action py-2 ripple">
                                        <i class="bi bi-people"></i> <span>Friend List</span>
                                    </a>
                                    <a href="#" class="list-group-item list-group-item-action py-2 ripple">
                                        <i class="bi bi-stopwatch"></i> <span>Watch</span>
                                    </a>
                                    <a href="#" class="list-group-item list-group-item-action py-2 ripple">
                                        <i class="bi bi-shop"></i> <span>Marketplace</span>
                                    </a>
                                    <a href="#" class="list-group-item list-group-item-action py-2 ripple">
                                        <i class="bi bi-calendar-event"></i> <span>Events</span>
                                    </a>
                                    <a href="#" class="list-group-item list-group-item-action py-2 ripple">
                                        <i class="bi bi-file-earmark-break"></i> <span>Page</span>
                                    </a>
                                    <a href="#" class="list-group-item list-group-item-action py-2 ripple">
                                        <i class="bi bi-collection"></i> <span>Group</span>
                                    </a>
                                </div>
                            </div>
                        </nav>

                    </div>

                    <!-- Side bar div ends -->

                    <!-- status div starts -->
                    <div class="col-9">
                        <div class="row" >
                            <div class="col-3">
                                <img src="profile-pics/<%=user_profile_pic%>" alt="" class="profile_pic_design"/>
                            </div>
                            <div class="col-9" style="">
                               <h3 class="text-secondary" > <%= user_name%></h3>
                                <b>Email : </b>  <%=user_email%><br/>
                                <b>Gender : </b>  <%= user_gender%><br/>
                                <b>City: </b> <%= user_city%> <br/>
                            </div>
                        </div><br/><br/>
                        
                        <div class="row">
                            <div class="col-12">
                                <%
                                    try {
                                        ResultSet rs = DbQueries.userProfileStatus(user_email);
                                        while (rs.next()) {
                                            String status_text = rs.getString("status_text");
                                            String status_img = rs.getString("status_image");
                                            String date1 = rs.getString("date1");
                                            String time1 = rs.getString("time1");

                                            if (!status_text.equals("") && !status_img.equals("")) {
                                %>

                                <div class="shadow p-4 mb-5 bg-body rounded">
                                    <div class="status_heading">
                                        <img src="profile-pics/<%=user_profile_pic%>" alt="" class="dp_img_style" /> &nbsp;&nbsp; <%=user_name%>  <span class="small text-secondary" style="float: right"> <%=date1%> [<%=time1%>] </span>
                                    </div>
                                    <div class="row shadow-sm p-3 mb-5 bg-body rounded">
                                        <%=status_text%> <br/> <br/>
                                        <div>
                                            <img src="status-images/<%=status_img%>" alt="" style="max-width: 80%" />
                                        </div>
                                    </div>
                                   
                                </div>

                                <%
                                } else if (status_text.equals("")) {
                                %>

                                <div class="shadow p-4 mb-5 bg-body rounded">
                                    <div class="status_heading">
                                        <img src="profile-pics/<%=user_profile_pic%>" alt="" class="dp_img_style" /> &nbsp;&nbsp; <%=user_name%>  <span class="small text-secondary" style="float: right"> <%=date1%> [<%=time1%>] </span>
                                    </div>
                                    <div class="row shadow-sm p-3 mb-5 bg-body rounded">
                                        <img src="status-images/<%=status_img%>" alt="" style="max-width: 80%" />
                                    </div>
                                    
                                </div>

                                <%
                                } else if (status_img.equals("")) {
                                %>

                                <div class="shadow p-4 mb-5 bg-body rounded">
                                    <div class="status_heading">
                                        <img src="profile-pics/<%=user_profile_pic%>" alt="" class="dp_img_style" /> &nbsp;&nbsp; <%=user_name%>  <span class="small text-secondary" style="float: right"> <%=date1%> [<%=time1%>] </span>
                                    </div>
                                    <div class="row shadow-sm p-3 mb-5 bg-body rounded">
                                        <%=status_text%>
                                    </div>
                                   
                                </div>

                                <%
                                            }
                                        }
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                %>

                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </div>

    </body>
</html>
