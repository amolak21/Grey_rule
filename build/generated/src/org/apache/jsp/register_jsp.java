package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

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
