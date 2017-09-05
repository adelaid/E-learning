<%-- 
    Document   : ViewGrades2
    Created on : Aug 26, 2017, 2:20:04 PM
    Author     : Ada
--%>

<%@page import="ws.Exam"%>
<%@page import="ws.Student"%>
<%@page import="ws.ExamGrades"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View grades</title>
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
                    <li ><a href="AddExam.jsp">Add Exam</a></li>
                    <li ><a href="AddQuestions.jsp">Add Questions</a></li>
                    <li class="active"><a href="ViewStudentsGrades.jsp">View Students Grades</a></li>
                    <li><a href="AddMaterials.jsp">Add Materials</a></li>
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
            <% //List<Course> courses = (List<Course>) session.getAttribute("coursesRegisteredAt");
                List<ExamGrades> eg = (List<ExamGrades>) session.getAttribute("eg");
                List<Student> students = (List<Student>) session.getAttribute("students");
                List<Exam> exams = (List<Exam>) session.getAttribute("exams");
                Exam ex = new Exam();
                for (Exam e : exams) {
                    if (e.getId().equals(eg.get(0).getExamId())) {
                        ex = e;
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
                        <label class="col-md-4 control-label" >View Grades for <%=ex.getName()%> </label> 
                        <div class="col-md-4 inputGroupContainer">
                            <div class="input-group">


                                <table>
                                    <tr ><td style="padding:0 15px 0 15px;" ><b>First Name</b></td><td style="padding:0 15px 0 15px;" ><b>Last Name</b></td><td style="padding:0 15px 0 15px;" ><b>Grade</b></td></tr>
                                    <%for (Student s : students) {%>
                                    <tr>
                                        <td style="padding:0 15px 0 15px;" ><%=s.getFirstName()%></td>
                                        <td style="padding:0 15px 0 15px;" ><%=s.getLastName()%></td>
                                        <%for (ExamGrades egs : eg) {
                                                if (s.getId().equals(egs.getStudentId())) {
                                        %>

                                            <td style="padding:0 15px 0 15px;" ><%=egs.getGrade()%></td>


                                        <%}

                                            }%>



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
                            <button type="submit" class="btn btn"onclick="history.back()" >Back</button>
                        </div>
                    </div>

                </fieldset>


            </form>



        </div>



    </body>
</html>