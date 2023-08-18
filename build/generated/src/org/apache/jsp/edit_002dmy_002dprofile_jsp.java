package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class edit_002dmy_002dprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    String gender = (String) session.getAttribute("session_gender");
    String city = (String) session.getAttribute("session_city");

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Edit My Profile</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.2/font/bootstrap-icons.css\" />\n");
      out.write("\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js\" ></script>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            window.onload = function () {\n");
      out.write("                var js_gender = '");
      out.print(gender);
      out.write("';\n");
      out.write("                if (js_gender === \"Male\")\n");
      out.write("                {\n");
      out.write("                    document.getElementById(\"maleid\").checked = true;\n");
      out.write("                }\n");
      out.write("                else\n");
      out.write("                {\n");
      out.write("                    document.getElementById(\"femaleid\").checked = true;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("\n");
      out.write("                var js_city = '");
      out.print(city);
      out.write("';\n");
      out.write("                document.getElementById('cityoptions').value = js_city;\n");
      out.write("            };\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- header div starts -->\n");
      out.write("        <div class=\"container-fluid bg-secondary header_div\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-4\">\n");
      out.write("                        <a href=\"home.jsp\" class=\"navbar-brand text-light\">Grey Rule</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-3\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-5\">\n");
      out.write("                        <img src=\"images/profile_pic.jpg\" alt=\"\" class=\"img-fluid\" style=\"max-width: 50px\" />\n");
      out.write("                        <span class=\"text-light\"> ");
      out.print( session.getAttribute("session_name"));
      out.write(" </span>\n");
      out.write("                        &nbsp;&nbsp;\n");
      out.write("                        <button type=\"button\" class=\"btn btn-info dropdown-toggle btn-sm\" data-bs-toggle=\"dropdown\"> More </button>\n");
      out.write("                        <ul class=\"dropdown-menu\">\n");
      out.write("                            <li> <a href=\"home.jsp\" class=\"dropdown-item\"> Home </a> </li>\n");
      out.write("                            <li> <a href=\"profile.jsp\" class=\"dropdown-item\"> My Profile </a> </li>\n");
      out.write("                            <li> <a href=\"edit-my-profile.jsp\" class=\"dropdown-item bg-secondary text-light\"> Edit My profile </a> </li>\n");
      out.write("                            <li> <a href=\"logout\" class=\"dropdown-item\"> Logout </a> </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- header div close -->\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\" style=\"padding: 40px\">\n");
      out.write("                    <!-- Sidebar div starts -->\n");
      out.write("                    <div class=\"col-3 shadow-sm p-3 mb-5 bg-body rounded\">\n");
      out.write("                        <nav id=\"sidebarMenu\" class=\"collapse d-lg-block sidebar collapse bg-white\">\n");
      out.write("                            <div class=\"position-sticky\">\n");
      out.write("                                <div class=\"list-group list-group-flush mx-3 mt-4\">\n");
      out.write("                                    <a href=\"home.jsp\" class=\"list-group-item list-group-item-action py-2 ripple\">\n");
      out.write("                                        <i class=\"bi bi-newspaper\"></i> <span>News Feed</span>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a href=\"#\" class=\"list-group-item list-group-item-action py-2 ripple\">\n");
      out.write("                                        <i class=\"bi bi-wechat\"></i> <span>Messanger</span>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a href=\"#\" class=\"list-group-item list-group-item-action py-2 ripple\">\n");
      out.write("                                        <i class=\"bi bi-people\"></i> <span>Friend List</span>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a href=\"#\" class=\"list-group-item list-group-item-action py-2 ripple\">\n");
      out.write("                                        <i class=\"bi bi-stopwatch\"></i> <span>Watch</span>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a href=\"#\" class=\"list-group-item list-group-item-action py-2 ripple\">\n");
      out.write("                                        <i class=\"bi bi-shop\"></i> <span>Marketplace</span>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a href=\"#\" class=\"list-group-item list-group-item-action py-2 ripple\">\n");
      out.write("                                        <i class=\"bi bi-calendar-event\"></i> <span>Events</span>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a href=\"#\" class=\"list-group-item list-group-item-action py-2 ripple\">\n");
      out.write("                                        <i class=\"bi bi-file-earmark-break\"></i> <span>Page</span>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a href=\"#\" class=\"list-group-item list-group-item-action py-2 ripple\">\n");
      out.write("                                        <i class=\"bi bi-collection\"></i> <span>Group</span>\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </nav>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Sidebar div ends -->\n");
      out.write("\n");
      out.write("                    <div class=\"col-9\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-12 shadow-sm p-3 mb-5 bg-body rounded\">\n");
      out.write("                                <img src=\"images/profile_pic.jpg\" alt=\"\" style=\"max-width: 20%; border-radius: 10px; box-shadow: 0px 0px 5px #dddcdc; padding: 5px;\" />\n");
      out.write("                                <input type=\"file\" class=\"form-control\" style=\"width: 50%\" />\n");
      out.write("                                <input type=\"submit\" value=\"Change Profile Pic\" class=\"btn btn-secondary post_btn\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-12 shadow-sm p-3 mb-5 bg-body rounded\">\n");
      out.write("                                <div style=\"padding-left: 200px; padding-right: 200px\">\n");
      out.write("                                    <h4 style=\"text-align: center\"> Edit Profile Details </h4> <br/>\n");
      out.write("                                    <form class=\"row gy-2 gx-3 align-items-center\">\n");
      out.write("                                        <div>\n");
      out.write("                                            <div class=\"input-group\">\n");
      out.write("                                                <div class=\"input-group-text\"><i class=\"bi bi-person-fill\"></i></div>\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" id=\"autoSizingInputGroup\" value=\"");
      out.print( session.getAttribute("session_name"));
      out.write("\" placeholder=\"Name\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div>\n");
      out.write("                                            <label class=\"visually-hidden\" for=\"autoSizingInputGroup\">Email Id</label>\n");
      out.write("                                            <div class=\"input-group\">\n");
      out.write("                                                <div class=\"input-group-text\">@</div>\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" id=\"autoSizingInputGroup\" value=\"");
      out.print( session.getAttribute("session_email"));
      out.write("\" readonly>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div>\n");
      out.write("                                            <label class=\"visually-hidden\" for=\"autoSizingInputGroup\">Select Gender</label>\n");
      out.write("                                            <div class=\"input-group\">\n");
      out.write("                                                <input type=\"radio\" name=\"gender1\" id=\"maleid\" value=\"Male\" /> Male &emsp;&emsp; <input type=\"radio\" id=\"femaleid\" name=\"gender1\" value=\"Female\" /> Female\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div>\n");
      out.write("                                            <label class=\"visually-hidden\" for=\"autoSizingSelect\">Preference</label>\n");
      out.write("                                            <select class=\"form-select\" id=\"cityoptions\">\n");
      out.write("                                                <option> Select City </option>\n");
      out.write("                                                <option> Chandigarh </option>\n");
      out.write("                                                <option> Delhi </option>\n");
      out.write("                                                <option> Pune </option>\n");
      out.write("                                                <option> Mumbai </option>\n");
      out.write("                                                <option> Banglore </option>\n");
      out.write("                                            </select>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-auto\">\n");
      out.write("                                            <input type=\"submit\" value=\"Update\" class=\"btn btn-secondary\" />\n");
      out.write("                                        </div>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-12 shadow-sm p-3 mb-5 bg-body rounded\">\n");
      out.write("                                <div style=\"padding-left: 200px; padding-right: 200px\">\n");
      out.write("                                    <h4 style=\"color: red\"> Delete My Profile </h4> <br/>\n");
      out.write("                                    <form class=\"row gy-2 gx-3 align-items-center\">\n");
      out.write("                                        <div class=\"col-auto\">\n");
      out.write("                                            <input type=\"submit\" value=\"Delete My Profile\" class=\"btn btn-danger\" />\n");
      out.write("                                        </div>\n");
      out.write("                                    </form>  \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
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
