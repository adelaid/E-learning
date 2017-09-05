<%-- 
    Document   : ViewMaterials
    Created on : Aug 26, 2017, 2:53:17 PM
    Author     : Ada
--%>

<%@page import="ws.Course"%>
<%@page import="ws.Material"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Materials</title>
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <link href="resources/css/jumbotron-narrow.css" rel="stylesheet" type="text/css"/>
        <link href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.17.47/css/bootstrap-datetimepicker.css" rel="stylesheet" type="text/css">
        <style>#success_message{ display: none;}</style>

    </head>
    <%
        String error = "";
        if (request.getAttribute("LOGIN_ERROR") != null) {
            error = (String) request.getAttribute("LOGIN_ERROR");
        }

    %>
    <body>
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="IndexJSP.jsp">E-Learning Platform</a>
                </div>
                <ul class="nav navbar-nav">


                    <li > <a href="IndexJSP.jsp">Home</a></li>
                    <li><a href="LogoutServlet">Logout </a></li>
                    <li class="active"><a href="ManageCoursesServlet">Manage Courses</a></li>
                    <li><a href="RegisterToCourse.jsp">Register To Course</a></li>
                </ul>
            </div>
        </nav>  
        <div id="bigmenu">

            <!--             <div id="bigmenulinks">
            <%if (session.getAttribute("user") == null) {%>
            <a href="LoginJSP.jsp">Login</a>
            <a href="RegisterNew.jsp">Register</a>
            
            <%} else {%>
            You are logged in as <b><%=session.getAttribute("user")%></b>
            <a href="LogoutC">Logout</a>
            <%}%>
            <% List<Course> courses = (List<Course>) session.getAttribute("coursesRegisteredAt");

                List<Material> materials = (List<Material>) session.getAttribute("materials");

                int i = Integer.parseInt(request.getParameter("materialv")); //cursid

                Course c = new Course();
                for (Course cc : courses) {

                    if (cc.getId() == i) {

                        c = cc;
                    }
                }

                //  System.out.println("courses " + courses.size());
%>
                                                                                                
                                                                                            </div>-->
        </div>

        <div class="container">

            <form class="well form-horizontal"  method="post" action="AddCourse.jsp"  id="contact_form">
                <fieldset>

                    <!-- Form Name -->


                    <div class="form-group">
                        <label class="col-md-4 control-label" >Materials for <%=c.getName()%> </label> 
                        <div class="col-md-4 inputGroupContainer">
                            <div class="input-group">


                                <table>
                                    <tr ><td style="padding:0 15px 0 15px;" ><b>Material Name</b></td><td style="padding:0 15px 0 15px;" ><b>URL</b></td></tr>
                                    <%for (Material m : materials) {
                                            if (m.getCourse().getId().equals(c.getId())) {%>
                                    <tr>



                                        <td style="padding:0 15px 0 15px;"><%=m.getName()%></td>
                                            <td style="padding:0 15px 0 15px;"><a href="<%=m.getURLM()%>"> <%=m.getURLM()%></a></td>

                                    </tr>
                                    <%   }
                                        }
                                    %>
                                </table>


                            </div>
                        </div>
                    </div>






                    <!-- Success message -->
                    <div class="alert alert-success" role="alert" id="success_message">Success <i class="glyphicon glyphicon-thumbs-up"></i></div>

                    <!-- Button -->
                    <div class="form-group">
                        <label class="col-md-4 control-label"></label>
                        <div class="col-md-4">
                            <button type="submit" class="btn btn" onclick="history.back()" >Back</button>
                        </div>
                    </div>

                </fieldset>


            </form>



        </div>



    </body>
</html>