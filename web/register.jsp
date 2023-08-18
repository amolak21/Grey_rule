<%-- 
    Document   : register
    Created on : 5 Apr, 2023, 9:08:07 PM
    Author     : Deepesh Panwar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
            function regValidation()
            {
                var user_name = document.regform.name1.value;
                var user_email = document.regform.email1.value;
                var user_pass = document.regform.pass1.value;
                var user_gender = document.regform.gender1.value;
                var user_city = document.regform.city1.value;
                
                var name_pattern = /^[a-zA-Z ]{5,30}$/;
                var email_pattern = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
                var pass_pattern = /^[a-zA-Z0-9@]{5,30}$/;
                
                if(!user_name.match(name_pattern))
                {
                    alert("Not a valid name");
                    return false;
                }
                else if(!user_email.match(email_pattern))
                {
                    alert("Not a valid email");
                    return false;
                }
                else if(!user_pass.match(pass_pattern))
                {
                    alert("Not a valid password");
                    return false;
                }
                else if(user_gender==="")
                {
                    alert("Select any one gender");
                    return false;
                }
                else if(user_city==="Select City")
                {
                    alert("Select any one city");
                    return false;
                }
                else
                {
                    document.regform.action="Register";
                    document.regform.submit();
                }
            }
        </script>
    </head>
    <body>
        
        <h3> Register Here </h3> <br/>
        <form method="post" name="regform" onsubmit="return regValidation()">
            <input type="text" name="name1" placeholder="Enter Name" class="reg_textfield_design" /> <br/> <br/>
            <input type="email" name="email1" placeholder="Enter Email" class="reg_textfield_design" /> <br/> <br/>
            <input type="password" name="pass1" placeholder="Enter Password" class="reg_textfield_design" /> <br/> <br/>
            <input type="radio" name="gender1" value="Male" /> Male &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="radio" name="gender1" value="Female" /> Female <br/> <br/>
            <select name="city1" class="reg_textfield_design">
                <option> Select City </option>
                <option> Chandigarh </option>
                <option> Delhi </option>
                <option> Pune </option>
                <option> Mumbai </option>
                <option> Banglore </option>
            </select> <br/> <br/>
            <input type="submit" value="Register" class="btn btn-primary" />
        </form>
    </body>
</html>
