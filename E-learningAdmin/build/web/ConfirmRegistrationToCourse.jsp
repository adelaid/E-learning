<%-- 
    Document   : ConfirmRegistrationToCourse
    Created on : Aug 7, 2017, 4:49:22 PM
    Author     : Ada
--%>

<%@page import="ws.Student"%>
<%@page import="ws.StudentCourse"%>
<%@page import="java.util.List"%>
<%@page import="ws.Course"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirm Registration To Course</title>
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <link href="resources/css/jumbotron-narrow.css" rel="stylesheet" type="text/css"/>
        <link href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.17.47/css/bootstrap-datetimepicker.css" rel="stylesheet" type="text/css">
        <style>#success_message{ display: none;}</style>

    </head>
    <%
        List<Course> courses = (List<Course>) session.getAttribute("courses");
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
                    <li ><a href="ManageCourses.jsp">Manage courses</a></li>
                    <li class="active"><a href="ConfirmRegistrationToCourse.jsp">Confirm Registration To Course</a></li> 
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
            <% List<StudentCourse> studentcourses = (List<StudentCourse>) session.getAttribute("studentcourse");
                List<Student> students = (List<Student>) session.getAttribute("students");
                //  System.out.println("courses " + courses.size());
            %>
            
        </div>-->
        </div>

        <div class="container">

            <form class="well form-horizontal"  method="post" action="ConfirmRegisterToCourseServlet"  id="contact_form">
                <fieldset>

                    <!-- Form Name -->


                    <div class="form-group">
                        <label class="col-md-4 control-label" >Students asking to register to courses: </label> 
                        <div class="col-md-4 inputGroupContainer">
                            <div class="input-group">


                                <table>
                                    <tr ><td style="padding:0 30px 0 30px;" ><b>Student</b></td><td style="padding:0 15px 0 15px;" ><b>Course Name</b></td><td style="padding:0 15px 0 15px;" ><b>Course Duration</b></td><td style="padding:0 30px 0 30px;" ><b>Lecturer</b></td><td style="padding:0 15px 0 15px;" ><b>No of students</b></td><td style="padding:0 15px 0 15px;" ><b>Confirm Registration</b></td></tr>
                                    <%for (StudentCourse sc : studentcourses) {%>
                                    <%

                                        for (Student s : students) {

                                            if (sc.getStudentId().equals(s.getId())) {


                                    %>
                                    <tr>
                                        <td style="padding:0 30px 0 30px;" ><%=s.getFirstName() + " " + s.getLastName()%></td>
                                        <%for (Course c : courses) {
                                                if (sc.getCourseId().equals(c.getId())) {


                                        %>
                                        <td style="padding:0 15px 0 15px;"><%=c.getName()%></td>
                                        <td style="padding:0 15px 0 15px;"><%=c.getDuration()%></td>
                                        <td style="padding:0 30px 0 30px;"><%=c.getLecturer().getFirstName() + " " + c.getLecturer().getLastName()%></td>
                                        <td style="padding:0 15px 0 15px;"><%=c.getNoOfStudents()%></td>

                                        <td style="padding:0 15px 0 15px;"><input name="qs" id="qs"    type="checkbox" value="<%=s.getId() + "-" + c.getId()%>">Confirm</td>



                                    </tr>
                                    <%}
                                                    }
                                                }
                                            }
                                        }%>
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
                            <button type="submit" class="btn btn" >Submit</button>
                        </div>
                    </div>

                </fieldset>


            </form>



        </div>



    </body>
</html>