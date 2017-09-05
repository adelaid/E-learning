<%-- 
    Document   : AddNeedJSP
    Created on : Mar 27, 2017, 2:10:55 PM
    Author     : Ada
--%>

<%@page import="ws.Lecturer"%>
<%@page import="ws.Course"%>

<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Assign Course To Lecturer</title>
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
                    <li  class="active"><a href="AssignCourseToLecturer.jsp">Assign Course to Lecturer</a></li>
                    <li><a href="ManageCourses.jsp">Manage courses</a></li>
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
            <% List<Course> courses = (List<Course>) session.getAttribute("unassignedcourses"); 
                List<Lecturer> lecturers = (List<Lecturer>) session.getAttribute("lecturers"); 
            %>
            
        </div>-->
        </div>

        <div class="container">

            <form class="well form-horizontal"  method="post" action="AssignLecturerServlet"  id="contact_form">
                <fieldset>

                    <!-- Form Name -->

                    <div class="form-group">
                        <label class="col-md-4 control-label" >Choose Lecturer</label> 
                        <div class="col-md-4 inputGroupContainer">
                            <div class="input-group">
                                 <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                <select class="form-control" id="lecturer" name="lecturer">
                                    <%  for (int i = 0; i < lecturers.size(); i++) {
                                            Lecturer option = lecturers.get(i);
                                    %>
                                    <option  value="<%= option.getId()%>"><%=option.getFirstName() + " " + option.getLastName() %></option>
                                    <% }%>
                                </select>
                            </div>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-4 control-label" >Choose Courses</label> 
                        <div class="col-md-4 inputGroupContainer">
                            <div class="input-group">
                                <%for(Course c : courses){
                                
                                %>
                                <input name="desc" id="desc"    type="checkbox" value="<%=c.getId()%>"><%=c.getName()%> <br>
                                
                                <%}%>
                            </div>
                        </div>
                    </div>
                 



                    <!-- Success message -->
                    <div class="alert alert-success" role="alert" id="success_message">Success <i class="glyphicon glyphicon-thumbs-up"></i></div>

                    <!-- Button -->
                    <div class="form-group">
                        <label class="col-md-4 control-label"></label>
                        <div class="col-md-4">
                            <button type="submit" class="btn btn" >Submit </button>
                        </div>
                    </div>

                </fieldset>


            </form>



        </div>



    </body>
</html>