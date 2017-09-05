package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddCourse_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Add Need</title>\n");
      out.write("        <link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"resources/css/jumbotron-narrow.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.17.47/css/bootstrap-datetimepicker.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <style>#success_message{ display: none;}</style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    ");

        String error = "";
        if (request.getAttribute("LOGIN_ERROR") != null) {
            error = (String) request.getAttribute("LOGIN_ERROR");
        }

    
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-default\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\">Informal Caretaker Distribution</a>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <li ><a href=\"IndexJSP.jsp\">Home</a></li>\n");
      out.write("                    <li><a href=\"LoginJSP.jsp\">Login</a></li>\n");
      out.write("                    <li><a href=\"LogoutC\">Logout</a></li>\n");
      out.write("                    <li><a href=\"RegisterJSP.jsp\">Register</a></li>\n");
      out.write("                    <li><a href=\"ViewPatientsListC\">View Patients List</a></li>\n");
      out.write("                    <li><a href=\"AddScheduleJSP.jsp\">Add Schedule</a></li>\n");
      out.write("                    <li class=\"active\"><a href=\"AddGeneralNeedJSP.jsp\">Add a general need</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>  \n");
      out.write("        <div id=\"bigmenu\">\n");
      out.write("\n");
      out.write("            <!--             <div id=\"bigmenulinks\">\n");
      out.write("            ");
if (session.getAttribute("user") == null) {
      out.write("\n");
      out.write("            <a href=\"LoginJSP.jsp\">Login</a>\n");
      out.write("            <a href=\"RegisterNew.jsp\">Register</a>\n");
      out.write("            \n");
      out.write("            ");
} else {
      out.write("\n");
      out.write("            You are logged in as <b>");
      out.print(session.getAttribute("user"));
      out.write("</b>\n");
      out.write("            <a href=\"LogoutC\">Logout</a>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("            \n");
      out.write("        </div>-->\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <form class=\"well form-horizontal\"  method=\"post\" action=\"AddCourseServlet\"  id=\"contact_form\">\n");
      out.write("                <fieldset>\n");
      out.write("\n");
      out.write("                    <!-- Form Name -->\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"col-md-4 control-label\" >Name</label> \n");
      out.write("                        <div class=\"col-md-4 inputGroupContainer\">\n");
      out.write("                            <div class=\"input-group\">\n");
      out.write("                                <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-user\"></i></span>\n");
      out.write("                                <input name=\"name\" id=\"name\"  class=\"form-control\"  type=\"text\" required>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"col-md-4 control-label\" >Duration in weeks</label> \n");
      out.write("                        <div class=\"col-md-4 inputGroupContainer\">\n");
      out.write("                            <div class=\"input-group\">\n");
      out.write("                                <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-user\"></i></span>\n");
      out.write("                                <input name=\"duration\" id=\"duration\"  class=\"form-control\"  type=\"text\" required>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"col-md-4 control-label\" >Start Date</label> \n");
      out.write("                                <div class=\"col-md-4 inputGroupContainer\">\n");
      out.write("                                    <div class='input-group date' id='datetimepicker1'>\n");
      out.write("                                        <span class=\"input-group-addon\">\n");
      out.write("                                            <span class=\"glyphicon glyphicon-calendar\"></span>\n");
      out.write("                                        </span>\n");
      out.write("                                        <input name=\"date\" id=\"date\" placeholder=\"\" class=\"form-control\"  type=\"text\" required>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        \n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"col-md-4 control-label\" >Description</label> \n");
      out.write("                        <div class=\"col-md-4 inputGroupContainer\">\n");
      out.write("                            <div class=\"input-group\">\n");
      out.write("                                <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-user\"></i></span>\n");
      out.write("                                <input name=\"description\" id=\"description\"  class=\"form-control\"  type=\"text\" required>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"col-md-4 control-label\" >Final Examination Type</label> \n");
      out.write("                        <div class=\"col-md-4 inputGroupContainer\">\n");
      out.write("                            <div class=\"input-group\">\n");
      out.write("                                   <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-user\"></i></span>\n");
      out.write("                                <select class=\"form-control\" id=\"type\" name=\"type\">\n");
      out.write("                                  <option value=\"Exam\" class=\"form-control\">Exam</option>\n");
      out.write("                                  <option value=\"Project-based\" class=\"form-control\">Project-based</option>\n");
      out.write("                                   \n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Success message -->\n");
      out.write("                    <div class=\"alert alert-success\" role=\"alert\" id=\"success_message\">Success <i class=\"glyphicon glyphicon-thumbs-up\"></i></div>\n");
      out.write("\n");
      out.write("                    <!-- Button -->\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"col-md-4 control-label\"></label>\n");
      out.write("                        <div class=\"col-md-4\">\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-warning\" >Send <span class=\"glyphicon glyphicon-send\"></span></button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </fieldset>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write(" <script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("            <script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.18.1/moment.min.js\"></script>\n");
      out.write("            <script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.0.0-alpha.6/js/bootstrap.min.js\"></script>\n");
      out.write("            <script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.17.47/js/bootstrap-datetimepicker.min.js\"></script>\n");
      out.write("\n");
      out.write("            <script type=\"text/javascript\">\n");
      out.write("                $(function () {\n");
      out.write("                    $('#datetimepicker1').datetimepicker({\n");
      out.write("                        format: 'YYYY-MM-DD'\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("                $(function () {\n");
      out.write("                    $('#datetimepicker2').datetimepicker({\n");
      out.write("                        format: 'HH:mm:ss'\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("                 $(function () {\n");
      out.write("                    $('#datetimepicker3').datetimepicker({\n");
      out.write("                        format: 'HH:mm:ss'\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            </script>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
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
