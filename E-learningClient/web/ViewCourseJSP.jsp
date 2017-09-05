<%-- 
    Document   : ViewCourseJSP
    Created on : Aug 1, 2017, 5:55:49 PM
    Author     : Ada
--%>

<%@page import="ws.Lecturer"%>
<%@page import="java.util.List"%>
<%@page import="ws.Course"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Course</title>
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <link href="resources/css/jumbotron-narrow.css" rel="stylesheet" type="text/css"/>
        <link href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.17.47/css/bootstrap-datetimepicker.css" rel="stylesheet" type="text/css">
        <style>#success_message{ display: none;}</style>
        <title>Add Schedule</title>
    </head>
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


        <%

            int i = Integer.parseInt(request.getParameter("query"));
            List<Course> courses = (List<Course>) session.getAttribute("courses");
            List<Lecturer> lecturers = (List<Lecturer>) session.getAttribute("lecturers");
            Course c = new Course();
            for (int j = 0; j < courses.size(); j++) {
                if (courses.get(j).getId() == i) {
                    c = courses.get(j);
                }
            }

        %>

        <div class="loginform">

            <div class="form-element">

                <h2>View Course Details</h2>
                <form class="well form-horizontal" action="SetVisitC" method="post" id="contact_form">

                    <div class="row">
                        <div class='col-sm-6'>
                            <div class="form-group">
                                <label class="col-md-3 form-element" >Course Name: </label> 
                                <p ><%=c.getName()%></p> 






                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class='col-sm-6'>
                            <div class="form-group">
                                <label class="col-md-3 form-element" >Description: </label> 
                                <p ><%=c.getDescription()%></p> 






                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class='col-sm-6'>
                            <div class="form-group">
                                <label class="col-md-3 form-element" >Start Date: </label> 
                                    <p ><%=c.getStartDate()%></p> 






                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class='col-sm-6'>
                            <div class="form-group">
                                <label class="col-md-3 form-element" >End Date: </label> 
                                    <p ><%=c.getEndDate()%></p> 






                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class='col-sm-6'>
                            <div class="form-group">
                                <label class="col-md-3 form-element" >Duration(in weeks): </label> 
                                <p><%=c.getDuration()%></p> 






                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class='col-sm-6'>
                            <div class="form-group">
                                <label class="col-md-3 form-element" >Final Examination Type: </label> 
                                <span ><p><%=c.getFinalExaminationType()%></p> 



                                    <input  placeholder="" class="form-control"  type="hidden"/></span>


                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class='col-sm-6'>
                            <div class="form-group">
                                <label class="col-md-3 form-element" >Lecturer: </label> 
                                <span ><p><%=c.getLecturer().getFirstName() + c.getLecturer().getLastName()%></p> 



                                    <input  placeholder="" class="form-control"  type="hidden"/></span>


                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class='col-sm-6'>
                            <div class="form-group">
                                <label class="col-md-3 form-element" >Lecturer e-mail address: </label> 
                                <span ><p><%=c.getLecturer().getEmail()%></p> 



                                    <input  placeholder="" class="form-control"  type="hidden"/></span>


                            </div>
                        </div>
                    </div>






                    <div class="row">
                        <div class='col-sm-6'>
                            <div class="form-group">

                                <div class="col-md-3">
                                    <button type="button" name="back" onclick="history.back()">Back</button>

                                </div>
                            </div>
                        </div>   

                    </div>
                </form>

            </div>
        </div>
    </body>
</html>
