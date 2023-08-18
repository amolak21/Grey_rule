package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>My Profile</title>\n");
      out.write("\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <link rel =\"stylesheet\" type=\"text/css\" href =\"css/style.css\"/>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.2/font/bootstrap-icons.css\" />\n");
      out.write("\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js\" ></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- header div starts -->\n");
      out.write("        <div class=\"container-fluid bg-secondary header_div\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-4\" >\n");
      out.write("                        <a href=\"home.jsp\" class=\"navbar-brand text-light\"  >GREY RULE</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-3 \">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-5\">\n");
      out.write("                        <image src=\"images/male.png\" alt=\"\" class=\"img-fluid\" style=\"max-width: 50px\"/>\n");
      out.write("                        <span class=\"text-light\"> ");
      out.print( session.getAttribute("session_name"));
      out.write("</span>\n");
      out.write("                        &nbsp;&nbsp;\n");
      out.write("                        <button type=\"button\" class=\"btn btn-info dropdown-toggle dropdown-toggle btn-sm\" data-bs-toggle=\"dropdown\">More</button>\n");
      out.write("                        <ul class=\"dropdown-menu\">\n");
      out.write("                            <li><a href=\"home.jsp\" class=\"dropdown-item  \"> Home</a></li>\n");
      out.write("                            <li><a href=\"profile.jsp\" class=\"dropdown-item bg-secondary text-light\"> My Profile</a></li>\n");
      out.write("                            <li><a href=\"edit-my-profile.jsp\" class=\"dropdown-item\">Edit My Profile</a></li>\n");
      out.write("                            <li><a href=\"logout\" class=\"dropdown-item\">Logout</a></li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- header div end -->\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\" style=\"padding: 40px\">\n");
      out.write("                    <!-- Side bar div starts -->\n");
      out.write("                    <div class=\"col-3 shadow-sm p-3 mb-5 bg-body rounded\">\n");
      out.write("                        <nav id=\"sidebarMenu\" class=\"collapse d-lg-block sidebar collapse bg-white\" >\n");
      out.write("                            <div class=\"position-sticky\">\n");
      out.write("                                <div class=\"list-group list-group-flush mx-3 mt-4\">\n");
      out.write("                                    <a href=\"home.jsp\" class=\"list-group-item list-group-item-action py-2 ripple \">\n");
      out.write("                                        <i class=\"bi bi-newspaper\"></i> <span>News Feed</span>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a href=\"#\" class=\"list-group-item list-group-item-action py-2 ripple\">\n");
      out.write("                                        <i class=\"bi bi-wechat\"></i> <span>Messenger</span>\n");
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
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!-- Side bar div ends -->\n");
      out.write("\n");
      out.write("                    <!-- status div starts -->\n");
      out.write("                    <div class=\"col-9\">\n");
      out.write("                        <div class=\"row\" >\n");
      out.write("                            <div class=\"col-3\">\n");
      out.write("                                <img src=\"images/profile_pic.jpg\" alt=\"\" class=\"profile_pic_design\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-9\" style=\"\">\n");
      out.write("                                <a href=\"edit-my-profile.jsp\"> <i class=\"bi bi-pencil-fill\" style=\"float: right\"></i></a>\n");
      out.write("                                <h3 class=\"text-secondary\" > ");
      out.print( session.getAttribute("session_name"));
      out.write("</h3>\n");
      out.write("                                <b>Email : </b>  ");
      out.print( session.getAttribute("session_email"));
      out.write("<br/>\n");
      out.write("                                <b>Gender : </b>  ");
      out.print( session.getAttribute("session_gender"));
      out.write("<br/>\n");
      out.write("                                <b>City: </b> ");
      out.print( session.getAttribute("session_city"));
      out.write(" <br/>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-12 p-3\">\n");
      out.write("                                <div class=\"shadow p-4 mb-5 bg-body rounded\">\n");
      out.write("                                    <h5><i class=\"bi bi-postcard\"></i> Post Status</h5><br/>\n");
      out.write("                                    <div class=\"row \">\n");
      out.write("                                        <textarea class=\"status_textarea_design\" placeholder=\"What are your thoughts\"></textarea>\n");
      out.write("                                    </div><br/>\n");
      out.write("                                    <input type=\"file\" class=\"form-control\" style=\"width:100%\" /><br/>\n");
      out.write("                                    <input type=\"submit\" value=\"Post\" class=\"btn btn-secondary\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-12\">\n");
      out.write("                                <div class=\"shadow p-4 mb-5 bg-body rounded\">\n");
      out.write("                                    <img src=\"images/profile_pic.jpg\" alt=\"\" style=\"max-width: 55px\" /> Amolak Singh &nbsp;<span class=\"small text-secondary\" style=\"float: right\"> 1st January, 2023 [10:20pm] </span>\n");
      out.write("                                    <div class=\"row shadow-sm p-3 mb-5 bg-body rounded\">\n");
      out.write("                                        I Bought a new Car <br/> <br/>\n");
      out.write("                                        <img src=\"images/car.jpg\" alt=\"\" style=\"max-width: 80%\" />\n");
      out.write("                                    </div>\n");
      out.write("                                    <a href=\"\" style=\"float: right\"><i class=\"bi bi-trash3-fill\"></i></a> <br/>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"shadow p-4 mb-5 bg-body rounded\">\n");
      out.write("                                    <img src=\"images/profile_pic.jpg\" alt=\"\" style=\"max-width: 50px\" /> Amolak Singh &nbsp;  <span class=\"small text-secondary\" style=\"float: right\"> 1st January, 2023 [10:20pm] </span>\n");
      out.write("                                    <div class=\"row shadow-sm p-3 mb-5 bg-body rounded\">\n");
      out.write("                                        Everyone needs a little push sometimes. Whether you're starting out on a new career path or need a burst of motivation, these inspiring words will remind you that success is possible. Plus, check out more powerful quotes that will get you in a positive mindset.\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <a href=\"\" style=\"float: right\"><i class=\"bi bi-trash3-fill\"></i></a> <br/>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <div class=\"shadow p-4 mb-5 bg-body rounded\">\n");
      out.write("                                    <img src=\"images/profile_pic.jpg\" alt=\"\" style=\"max-width: 50px\" /> Amolak Singh &nbsp; <span class=\"small text-secondary\" style=\"float: right\"> 1st January, 2023 [10:20pm] </span>\n");
      out.write("                                    <div class=\"row shadow-sm p-3 mb-5 bg-body rounded\">\n");
      out.write("                                        This is my new car <br/><br/> \n");
      out.write("                                        <img src=\"images/car.jpg\" alt=\"\" style=\"max-width: 80%\" />\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <a href=\"\" style=\"float: right\"><i class=\"bi bi-trash3-fill\"></i></a> <br/>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div> \n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
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
