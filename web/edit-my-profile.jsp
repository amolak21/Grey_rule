<!DOCTYPE html>

<%
    String gender = (String) session.getAttribute("session_gender");
    String city = (String) session.getAttribute("session_city");

    String profile_pic = (String) session.getAttribute("session_profilepic");

%>

<html>
    <head>
        <title>Edit My Profile</title>

        <link rel="stylesheet" type="text/css" href="css/style.css" />
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" />

        <link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.2/font/bootstrap-icons.css" />

        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" ></script>

        <script>
            window.onload = function () {
                var js_gender = '<%=gender%>';
                if (js_gender === "Male")
                {
                    document.getElementById("maleid").checked = true;
                }
                else
                {
                    document.getElementById("femaleid").checked = true;
                }


                var js_city = '<%=city%>';
                document.getElementById('cityoptions').value = js_city;
            }


            function updateValidation()
            {
                var user_name = document.updateform.name1.value;
                var user_gender = document.updateform.gender1.value;
                var user_city = document.updateform.city1.value;

                var name_pattern = /^[a-zA-Z ]{5,30}$/;

                if (!user_name.match(name_pattern))
                {
                    alert("Not a valid name");
                    return false;
                }
                else if (user_gender === "")
                {
                    alert("Select any one gender");
                    return false;
                }
                else if (user_city === "Select City")
                {
                    alert("Select any one city");
                    return false;
                }
                else
                {
                    document.updateform.action = "UpdateProfileDetails";
                    document.updateform.submit();
                }
            }

        </script>

    </head>
    <body>
        <!-- header div starts -->
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
                            <li> <a href="home.jsp" class="dropdown-item"> Home </a> </li>
                            <li> <a href="profile.jsp" class="dropdown-item"> My Profile </a> </li>
                            <li> <a href="edit-my-profile.jsp" class="dropdown-item bg-secondary text-light"> Edit My profile </a> </li>
                            <li> <a href="logout" class="dropdown-item"> Logout </a> </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
        <!-- header div close -->

        <div class="container-fluid">
            <div class="container">
                <div class="row" style="padding: 40px">
                    <!-- Sidebar div starts -->
                    <div class="col-3 shadow-sm p-3 mb-5 bg-body rounded">
                        <nav id="sidebarMenu" class="collapse d-lg-block sidebar collapse bg-white">
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
                    </div>
                    <!-- Sidebar div ends -->

                    <div class="col-9">
                        <div class="row">
                            <div class="col-12 shadow-sm p-3 mb-5 bg-body rounded">
                                <img src="profile-pics/<%=profile_pic%>" alt="" style="max-width: 20%; border-radius: 10px; box-shadow: 0px 0px 5px #dddcdc; padding: 5px;" />
                                <form action ="UpdateProfilePic" method="post" enctype="multipart/form-data">
                                    <input type="file" name = "profile_pic_file" class="form-control" style="width: 50%" />
                                    <input type="submit" value="Change Profile Pic" class="btn btn-secondary post_btn"/> 
                                </form>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-12 shadow-sm p-3 mb-5 bg-body rounded">
                                <div style="padding-left: 200px; padding-right: 200px">
                                    <h4 style="text-align: center"> Edit Profile Details </h4> <br/>
                                    <form name ="updateform" method="post" class="row gy-2 gx-3 align-items-center" onsubmit="return updateValidation()">
                                        <div>
                                            <div class="input-group">
                                                <div class="input-group-text"><i class="bi bi-person-fill"></i></div>
                                                <input type="text" class="form-control" id="autoSizingInputGroup" name = "name1" value="<%= session.getAttribute("session_name")%>" placeholder="Name">
                                            </div>
                                        </div>
                                        <div>
                                            <label class="visually-hidden" for="autoSizingInputGroup">Email Id</label>
                                            <div class="input-group">
                                                <div class="input-group-text">@</div>
                                                <input type="text" class="form-control" id="autoSizingInputGroup" name ="email1" value="<%= session.getAttribute("session_email")%>" readonly>
                                            </div>
                                        </div>
                                        <div>
                                            <label class="visually-hidden" for="autoSizingInputGroup">Select Gender</label>
                                            <div class="input-group">
                                                <input type="radio" name="gender1" id="maleid" value="Male"  /> Male &emsp;&emsp; <input type="radio" id="femaleid" name="gender1" value="Female" /> Female
                                            </div>
                                        </div>
                                        <div>
                                            <label class="visually-hidden" for="autoSizingSelect">Preference</label>
                                            <select class="form-select" id="cityoptions" name ="city1">
                                                <option> Select City </option>
                                                <option> Chandigarh </option>
                                                <option> Delhi </option>
                                                <option> Pune </option>
                                                <option> Mumbai </option>
                                                <option> Banglore </option>
                                            </select>
                                        </div>
                                        <div class="col-auto">
                                            <input type="submit" value="Update" class="btn btn-secondary" />
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                       <div class="row">
                            <div class="col-12 shadow-sm p-3 mb-5 bg-body rounded">
                                <div style="padding-left: 200px; padding-right: 200px">
                                    <h4 style="color: red"> Delete My Profile </h4> <br/>
                                    <form method="post" action="DeleteProfile" class="row gy-2 gx-3 align-items-center">
                                        <div class="col-auto">
                                            <input type="submit" value="Delete My Profile" class="btn btn-danger" />
                                        </div>
                                    </form>  
                                </div>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </div>
    </body>
</html>
