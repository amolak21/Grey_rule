<%@page import="java.sql.ResultSet"%>
<%@page import="in.sp.dbqueries.DbQueries"%>
<!DOCTYPE html>
<%
    String session_email = (String) session.getAttribute("session_email");
    String profile_pic = (String) session.getAttribute("session_profilepic");
%>
<html>
    <head>
        <title>Home</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" />
        <link rel="stylesheet" type="text/css" href="css/style.css" />

        <link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.2/font/bootstrap-icons.css" />

        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" ></script>

        <script>
            function likeStatus(statusid)
            {
                //alert(statusid);
                var obj = new XMLHttpRequest();
                obj.open("GET", "LikeStatus?statusid=" + statusid, true);
                obj.send();
                obj.onreadystatechange = function ()
                {
                    if (obj.readyState === 4 && obj.status === 200)
                    {
                        document.getElementById('resgenerated' + statusid).innerHTML = obj.responseText;
                    }
                }
            }
            function dislikeStatus(statusid)
            {
                //alert(statusid);
                var obj = new XMLHttpRequest();
                obj.open("GET", "disLikeStatus?statusid=" + statusid, true);
                obj.send();
                obj.onreadystatechange = function ()
                {
                    if (obj.readyState === 4 && obj.status === 200)
                    {
                        document.getElementById('resgenerated' + statusid).innerHTML = obj.responseText;
                    }
                }
            }
        </script>




    </head>
    <body>
        <div class="container-fluid bg-secondary header_div">
            <div class="container">
                <div class="row">
                    <div class="col-4">
                        <a href="home.jsp" class="navbar-brand text-light">Grey Rule</a>
                    </div>
                    <div class="col-3">

                    </div>
                    <div class="col-5">
                        <a href="profile.jsp" style="text-decoration: none">
                            <img src="profile-pics/<%=profile_pic%>" alt="" class="img-fluid dp_img_style" />
                            <span class="text-light"> <%= session.getAttribute("session_name")%> </span>
                        </a>
                        &nbsp;&nbsp;
                        <button type="button" class="btn btn-info dropdown-toggle btn-sm" data-bs-toggle="dropdown"> More </button>
                        <ul class="dropdown-menu">
                            <li> <a href="home.jsp" class="dropdown-item bg-secondary text-light"> Home </a> </li>
                            <li> <a href="profile.jsp" class="dropdown-item"> My Profile </a> </li>
                            <li> <a href="edit-my-profile.jsp" class="dropdown-item"> Edit My profile </a> </li>
                            <li> <a href="logout" class="dropdown-item"> Logout </a> </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>

        <div class="container-fluid">
            <div class="container">
                <div class="row" style="padding: 40px">
                    <!-- Sidebar div starts -->
                    <div class="col-3 shadow-sm p-3 mb-5 bg-body rounded">
                        <nav id="sidebarMenu" class="collapse d-lg-block sidebar collapse bg-white" style="position: fixed">
                            <div class="position-sticky">
                                <div class="list-group list-group-flush mx-3 mt-4">
                                    <a href="home.jsp" class="list-group-item list-group-item-action py-2 ripple">
                                        <i class="bi bi-newspaper"></i> <span>News Feed</span>
                                    </a>
                                    <a href="#" class="list-group-item list-group-item-action py-2 ripple">
                                        <i class="bi bi-wechat"></i> <span>Messanger</span>
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
                        <!-- Sidebar -->
                    </div> <!-- Sidebar div ends -->

                    <!-- status div starts -->
                    <div class="col-9">
                        <%
                            try {
                                ResultSet rs = DbQueries.getAllStatus();

                                while (rs.next()) {
                                    String name1 = rs.getString("name");
                                    String profile_pic1 = rs.getString("profile_pic");

                                    String statusid = rs.getString("statusid");
                                    String email1 = rs.getString("email");
                                    String status_text1 = rs.getString("status_text");
                                    String status_img1 = rs.getString("status_image");
                                    String date1 = rs.getString("date1");
                                    String time1 = rs.getString("time1");

                                    int count_likes = DbQueries.countLikes(statusid);

                                    if (!status_text1.equals("") && !status_img1.equals("")) {
                        %>

                        <div class="shadow p-4 mb-5 bg-body rounded">
                            <div class="status_heading">
                                <a href="user-profile.jsp?email=<%=email1%>" style="text-decoration: none"><img src="profile-pics/<%=profile_pic1%>" alt="" class="dp_img_style" /> &nbsp;&nbsp; <%=name1%> </a>  <span class="small text-secondary" style="float: right"> <%=date1%> [<%=time1%>] </span>
                            </div>
                            <div class="row shadow-sm p-3 mb-5 bg-body rounded">
                                <%=status_text1%> <br/> <br/>
                                <div>
                                    <img src="status-images/<%=status_img1%>" alt="" style="max-width: 80%" />
                                </div>
                            </div>
                            <div class="status_heading">
                                 <%
                                         if(count_likes!=0){
                                            %>
                                             <%=count_likes%>
                                            <%
                                         }
                                    
                                 %>
                                <%
                                    boolean status = DbQueries.displayLikeOrDislikeIcon(statusid, session_email);
                                    if (status) {
                                %>
                                <span id="resgenerated<%=statusid%>" ><i class="bi bi-hand-thumbs-up-fill" id="<%=statusid%>" onclick="dislikeStatus(<%=statusid%>)"></i></span>

                                <%
                                } else {
                                %>
                                <span id="resgenerated<%=statusid%>" ><i class="bi bi-hand-thumbs-up" id="<%=statusid%>" onclick="likeStatus(<%=statusid%>)"></i></span>

                                <%

                                    }

                                %>
                            </div>
                        </div>

                        <%                        } else if (status_text1.equals("")) {
                        %>

                        <div class="shadow p-4 mb-5 bg-body rounded">
                            <div class="status_heading">
                                <a href="user-profile.jsp?email=<%=email1%>" style="text-decoration: none"><img src="profile-pics/<%=profile_pic1%>" alt="" class="dp_img_style" /> &nbsp;&nbsp; <%=name1%> </a>  <span class="small text-secondary" style="float: right"> <%=date1%> [<%=time1%>] </span>
                            </div>
                            <div class="row shadow-sm p-3 mb-5 bg-body rounded">
                                <img src="status-images/<%=status_img1%>" alt="" style="max-width: 80%" />
                            </div>
                            <div class="status_heading">
                              <%
                                         if(count_likes!=0){
                                            %>
                                             <%=count_likes%>
                                            <%
                                         }
                                    
                                 %>
                                <%
                                    boolean status = DbQueries.displayLikeOrDislikeIcon(statusid, session_email);
                                    if (status) {
                                %>
                                <span id="resgenerated<%=statusid%>" ><i class="bi bi-hand-thumbs-up-fill" id="<%=statusid%>" onclick="dislikeStatus(<%=statusid%>)"></i></span>

                                <%
                                } else {
                                %>
                                <span id="resgenerated<%=statusid%>" ><i class="bi bi-hand-thumbs-up" id="<%=statusid%>" onclick="likeStatus(<%=statusid%>)"></i></span>

                                <%

                                    }

                                %>   </div>
                        </div>

                        <%                        } else if (status_img1.equals("")) {
                        %>

                        <div class="shadow p-4 mb-5 bg-body rounded">
                            <div class="status_heading">
                                <a href="user-profile.jsp?email=<%=email1%>" style="text-decoration: none"><img src="profile-pics/<%=profile_pic1%>" alt="" class="dp_img_style" /> &nbsp;&nbsp; <%=name1%> </a>  <span class="small text-secondary" style="float: right"> <%=date1%> [<%=time1%>] </span>
                            </div>
                            <div class="row shadow-sm p-3 mb-5 bg-body rounded">
                                <%=status_text1%>
                            </div>
                            <div class="status_heading">
                               <%
                                         if(count_likes!=0){
                                            %>
                                             <%=count_likes%>
                                            <%
                                         }
                                    
                                 %>
                                <%
                                    boolean status = DbQueries.displayLikeOrDislikeIcon(statusid, session_email);
                                    if (status) {
                                %>
                                <span id="resgenerated<%=statusid%>" ><i class="bi bi-hand-thumbs-up-fill" id="<%=statusid%>" onclick="dislikeStatus(<%=statusid%>)"></i></span>

                                <%
                                } else {
                                %>
                                <span id="resgenerated<%=statusid%>" ><i class="bi bi-hand-thumbs-up" id="<%=statusid%>" onclick="likeStatus(<%=statusid%>)"></i></span>

                                <%

                                    }

                                %> </div>
                        </div>

                        <%                                    }

                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        %>

                    </div><!-- status div ends -->
                </div>
            </div>
        </div>


    </body>
</html>
