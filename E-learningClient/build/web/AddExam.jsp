<%-- 
    Document   : AddExam
    Created on : Aug 7, 2017, 7:22:48 PM
    Author     : Ada
--%>

<%@page import="java.util.List"%>
<%@page import="ws.Course"%>
<%@page import="ws.Course"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <link href="resources/css/jumbotron-narrow.css" rel="stylesheet" type="text/css"/>
        <link href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.17.47/css/bootstrap-datetimepicker.css" rel="stylesheet" type="text/css">
        <style>#success_message{ display: none;}</style>
        <title>Add Exam</title>
    </head>
    <%

        List<Course> courses = (List<Course>) session.getAttribute("courses");

        String error = "";
        if (request.getAttribute("LOGIN_ERROR") != null) {
            error = (String) request.getAttribute("LOGIN_ERROR");
        }

        boolean log = false;
        if (request.getSession().getAttribute("user") != null) {
            log = true;
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
                    <li class="active"><a href="AddExam.jsp">Add Exam</a></li>
                    <li><a href="AddQuestions.jsp">Add Questions</a></li>
                    <li><a href="ViewStudentsGrades.jsp">View Students Grades</a></li>
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
            
        </div>-->
        </div>
        <div class="container">

            <form class="well form-horizontal"  method="post" action="AddExamServlet"  id="contact_form">
                <fieldset>

                    <!-- Form Name -->


                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-md-4 control-label" >Exam Name</label> 
                        <div class="col-md-4 inputGroupContainer">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                <input name="name" id="name"  class="form-control"  type="text" required>
                            </div>
                        </div>
                    </div>


                    <div class="form-group">
                        <label class="col-md-4 control-label" >Choose Course</label> 
                        <div class="col-md-4 inputGroupContainer">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                <select class="form-control" id="course" name="course">
                                    <%for (Course c : courses) {%>


                                    <option value="<%=c.getId()%>" class="form-control"><%=c.getName()%></option>

                                    <% }%>
                                </select>
                            </div>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="password">Duration in minutes</label>
                        <div class="col-md-4 inputGroupContainer">

                            <div class="input-group">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                <input name="duration"  id ="duration" class="form-control"  type="text" required>
                            </div>
                        </div>
                    </div>



                    <div class="form-group">
                        <label class="col-md-4 control-label" for="password">Start Time</label>
                        <div class="col-md-4 inputGroupContainer">

                            <div class='input-group date' id='datetimepicker1'>
                                <span class="input-group-addon">
                                    <span class="glyphicon glyphicon-calendar"></span>
                                </span>
                                <input name="datestart" id="datestart" placeholder="" class="form-control"  type="text" required>
                            </div>

                            <div class='input-group date' id='datetimepicker2'>
                                <div class="input-group">
                                    <span class="input-group-addon">
                                        <span class="glyphicon glyphicon-calendar"></span> 
                                    </span>
                                    <input name="timestart" placeholder="" id ="timestart" class="form-control"  type="text" required>
                                </div>
                            </div>
                        </div>

                    </div>



                   


                    <div class="form-group">
                        <label class="col-md-4 control-label" for="password">End Time</label>
                        <div class="col-md-4 inputGroupContainer">

                            <div class='input-group date' id='datetimepicker3'>
                                <span class="input-group-addon">
                                    <span class="glyphicon glyphicon-calendar"></span>
                                </span>
                                <input name="dateend" id="dateend" placeholder="" class="form-control"  type="text" required>
                            </div>

                            <div class="input-group date" id='datetimepicker4'> 
                                <div class="input-group">
                                    <span class="input-group-addon">
                                        <span class="glyphicon glyphicon-calendar"></span> 
                                    </span>
                                    <input name="timeend" placeholder="" id ="timeend" class="form-control"  type="text" required>
                                </div>
                            </div>
                        </div>
                    </div>



                    <!-- Success message -->
                    <div class="alert alert-success" role="alert" id="success_message">Success <i class="glyphicon glyphicon-thumbs-up"></i></div>

                    <!-- Button -->
                    <div class="form-group">
                        <label class="col-md-4 control-label"></label>
                        <div class="col-md-4">
                            <button type="submit" class="btn btn" >Add exam </button>
                        </div>
                    </div>

                </fieldset>


            </form>
            <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
            <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.18.1/moment.min.js"></script>
            <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.0.0-alpha.6/js/bootstrap.min.js"></script>
            <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.17.47/js/bootstrap-datetimepicker.min.js"></script>

            <script type="text/javascript">
                $(function () {
                    $('#datetimepicker1').datetimepicker({
                        format: 'YYYY-MM-DD'
                    });
                });
                $(function () {
                    $('#datetimepicker2').datetimepicker({
                        format: 'HH:mm:ss'
                    });
                });
                $(function () {
                    $('#datetimepicker3').datetimepicker({
                          format: 'YYYY-MM-DD'
                    });
                });
                 $(function () {
                    $('#datetimepicker4').datetimepicker({
                        format: 'HH:mm:ss'
                    });
                });
            </script>
        </div>

    </body>
</html>
