<%-- 
    Document   : AddGeneralNeedJSP
    Created on : Apr 4, 2017, 2:00:16 PM
    Author     : Ada
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Course</title>
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
                    <li class="active"><a href="AddCourse.jsp">Add course</a></li>
                    <li><a href="AssignCourseToLecturer.jsp">Assign Course to Lecturer</a></li>
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
            
        </div>-->
        </div>

        <div class="container">

            <form class="well form-horizontal"  method="post" action="AddCourseServlet"  id="contact_form">
                <fieldset>

                    <!-- Form Name -->

                    <div class="form-group">
                        <label class="col-md-4 control-label" >Name</label> 
                        <div class="col-md-4 inputGroupContainer">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                <input name="name" id="name"  class="form-control"  type="text" required>
                            </div>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-4 control-label" >Duration in weeks</label> 
                        <div class="col-md-4 inputGroupContainer">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                <input name="duration" id="duration"  class="form-control"  type="text" required>
                            </div>
                        </div>
                    </div>
                    
                            <div class="form-group">
                                <label class="col-md-4 control-label" >Start Date</label> 
                                <div class="col-md-4 inputGroupContainer">
                                    <div class='input-group date' id='datetimepicker1'>
                                        <span class="input-group-addon">
                                            <span class="glyphicon glyphicon-calendar"></span>
                                        </span>
                                        <input name="date" id="date" placeholder="" class="form-control"  type="text" required>
                                    </div>
                                </div>
                            </div>
                        

                    <div class="form-group">
                        <label class="col-md-4 control-label" >Description</label> 
                        <div class="col-md-4 inputGroupContainer">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                <input name="description" id="description"  class="form-control"  type="text" required>
                            </div>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label" >Final Examination Type</label> 
                        <div class="col-md-4 inputGroupContainer">
                            <div class="input-group">
                                   <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                <select class="form-control" id="type" name="type">
                                  <option value="Exam" class="form-control">Exam</option>
                                  <option value="Project-based" class="form-control">Project-based</option>
                                   
                                </select>
                            </div>
                        </div>
                    </div>
                    <!-- Success message -->
                    <div class="alert alert-success" role="alert" id="success_message">Success <i class="glyphicon glyphicon-thumbs-up"></i></div>

                    <!-- Button -->
                    <div class="form-group">
                        <label class="col-md-4 control-label"></label>
                        <div class="col-md-4">
                            <button type="submit" class="btn btn" >Add Course</button>
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
                        format: 'HH:mm:ss'
                    });
                });
            </script>

        </div>



    </body>
</html>
