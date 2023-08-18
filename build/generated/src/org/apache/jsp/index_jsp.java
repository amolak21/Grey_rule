package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/login.jsp");
    _jspx_dependants.add("/register.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Social Network</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid bg-secondary header_div\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-4\">\n");
      out.write("                        <a href=\"index.jsp\" class=\"navbar-brand text-light\">Social Network</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-3\">\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-5\">\n");
      out.write("                        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"Login\" method=\"post\">\n");
      out.write("            <input type=\"text\" placeholder=\"Enter Email\" class=\"textfield_design\" name=\"email1\" />\n");
      out.write("            <input type=\"password\" placeholder=\"Enter Email\" class=\"textfield_design\" name=\"pass1\" />\n");
      out.write("            <input type=\"submit\" value=\"Login\" class=\"btn btn-warning\" />\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container-fluid bg-light body_div\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-6\" style=\"text-align: center; padding-top: 40px; padding-bottom: 40px\">\n");
      out.write("                    <img src=\"images/social_image (Small).png\" alt=\"\" class=\"img-fluid\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-6\" style=\"text-align: center; padding-top: 40px; padding-bottom: 40px\">\n");
      out.write("                    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script>\n");
      out.write("            function regValidation()\n");
      out.write("            {\n");
      out.write("                var user_name = document.regform.name1.value;\n");
      out.write("                var user_email = document.regform.email1.value;\n");
      out.write("                var user_pass = document.regform.pass1.value;\n");
      out.write("                var user_gender = document.regform.gender1.value;\n");
      out.write("                var user_city = document.regform.city1.value;\n");
      out.write("                \n");
      out.write("                var name_pattern = /^[a-zA-Z ]{5,30}$/;\n");
      out.write("                var email_pattern = /^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+$/;\n");
      out.write("                var pass_pattern = /^[a-zA-Z0-9@]{5,30}$/;\n");
      out.write("                \n");
      out.write("                if(!user_name.match(name_pattern))\n");
      out.write("                {\n");
      out.write("                    alert(\"Not a valid name\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if(!user_email.match(email_pattern))\n");
      out.write("                {\n");
      out.write("                    alert(\"Not a valid email\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if(!user_pass.match(pass_pattern))\n");
      out.write("                {\n");
      out.write("                    alert(\"Not a valid password\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if(user_gender===\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Select any one gender\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if(user_city===\"Select City\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Select any one city\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else\n");
      out.write("                {\n");
      out.write("                    document.regform.action=\"Register\";\n");
      out.write("                    document.regform.submit();\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <h3> Register Here </h3> <br/>\n");
      out.write("        <form method=\"post\" name=\"regform\" onsubmit=\"return regValidation()\">\n");
      out.write("            <input type=\"text\" name=\"name1\" placeholder=\"Enter Name\" class=\"reg_textfield_design\" /> <br/> <br/>\n");
      out.write("            <input type=\"email\" name=\"email1\" placeholder=\"Enter Email\" class=\"reg_textfield_design\" /> <br/> <br/>\n");
      out.write("            <input type=\"password\" name=\"pass1\" placeholder=\"Enter Password\" class=\"reg_textfield_design\" /> <br/> <br/>\n");
      out.write("            <input type=\"radio\" name=\"gender1\" value=\"Male\" /> Male &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"radio\" name=\"gender1\" value=\"Female\" /> Female <br/> <br/>\n");
      out.write("            <select name=\"city1\" class=\"reg_textfield_design\">\n");
      out.write("                <option> Select City </option>\n");
      out.write("                <option> Chandigarh </option>\n");
      out.write("                <option> Delhi </option>\n");
      out.write("                <option> Pune </option>\n");
      out.write("                <option> Mumbai </option>\n");
      out.write("                <option> Banglore </option>\n");
      out.write("            </select> <br/> <br/>\n");
      out.write("            <input type=\"submit\" value=\"Register\" class=\"btn btn-primary\" />\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"bg-dark\" style=\"padding: 40px\">\n");
      out.write("            footer\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
