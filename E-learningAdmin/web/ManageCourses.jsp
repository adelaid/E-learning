<%-- 
    Document   : ManageCourses
    Created on : Aug 7, 2017, 12:39:21 PM
    Author     : Ada
--%>

<%@page import="ws.Lecturer"%>
<%@page import="java.util.List"%>
<%@page import="ws.Course"%>
<%@page import="ws.Course"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manage Courses</title>
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
                    <a class="navbar-brand" href="IndexJSP.jsp">E-Learning Admin Platform</a>
                </div>
                <ul class="nav navbar-nav">


                     <li > <a href="IndexJSP.jsp">Home</a></li>
                    <li><a href="LogoutServlet">Logout </a></li>
                    <li><a href="AddCourse.jsp">Add course</a></li>
                    <li > <a href="AssignCourseToLecturer.jsp">Assign Course to Lecturer</a></li>
                    <li class="active"><a href="ManageCourses.jsp">Manage courses</a></li>
                    <li><a href="ConfirmRegistrationToCourse.jsp">Confirm Registration To Course</a></li> 
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
            <% List<Course> courses = (List<Course>) session.getAttribute("courses");
           //  System.out.println("courses " + courses.size());
            %>
            
        </div>-->
        </div>

        <div class="container">

            <form class="well form-horizontal"  method="post" action="AddCourse.jsp"  id="contact_form">
                <fieldset>

                    <!-- Form Name -->


                    <div class="form-group">
                        <label class="col-md-4 control-label" >Courses: </label> 
                        <div class="col-md-4 inputGroupContainer">
                            <div class="input-group">
                                
                                 
                                <table>
                                    <tr ><td style="padding:0 15px 0 15px;" ><b>Name</b></td><td style="padding:0 15px 0 15px;" ><b>Action</b></td></tr>
                    <%for (Course c : courses) {%>
                    <tr>
                        <td style="padding:0 15px 0 15px;" ><%=c.getName()%></td>
                        <td style="padding:0 15px 0 15px;"><a href="EditCourse.jsp?edit=<%=c.getId()%>"> Edit</a></td>
                           
                      
                      
                        
                
                 
                      </tr>
                              <%}%>
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
                            <button type="submit" class="btn btn" >Add a new Course!</button>
                        </div>
                    </div>

                </fieldset>


            </form>



        </div>



    </body>
</html>