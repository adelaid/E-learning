<%-- 
    Document   : AddNewQS
    Created on : Aug 22, 2017, 9:33:40 PM
    Author     : Ada
--%>

<%@page import="ws.Course"%>
<%@page import="ws.Question"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="js/jquery-1.11.1.js" type="text/javascript"></script>
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <link href="resources/css/jumbotron-narrow.css" rel="stylesheet" type="text/css"/>
        <link href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.17.47/css/bootstrap-datetimepicker.css" rel="stylesheet" type="text/css">
        <style>#success_message{ display: none;}</style>
        <title>Add new question</title>

        
        
    </head>
    <%
  List<Course> courses = (List<Course>) session.getAttribute("courses");
        List<Question> qs = (List<Question>) session.getAttribute("qs");

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
                    <li ><a href="AddExam.jsp">Add Exam</a></li>
                    <li class="active"><a href="AddQuestions.jsp">Add Questions</a></li>
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

            <form class="well form-horizontal"  method="post" action="AddNewQsServlet"  id="contact_form">
                <fieldset>

               
                    
                    
                    <!-- Form Name -->
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

                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-md-4 control-label" >Question</label> 
                        <div class="col-md-4 inputGroupContainer">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                <input name="qs" id="qs" placeholder="Question" class="form-control"  type="text" required>
                            </div>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label" >Correct Answer</label> 
                        <div class="col-md-4 inputGroupContainer">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                <input name="ans1" id="ans1" placeholder="Correct Answer" class="form-control"  type="text" required>
                            </div>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label" >Wrong Answer</label> 
                        <div class="col-md-4 inputGroupContainer">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                <input name="ans2" id="ans2" placeholder="Answer" class="form-control"  type="text" required>
                            </div>
                        </div>
                    </div>


                    <div class="form-group" id="ctrl">
                        <label class="col-md-4 control-label" >Wrong Answer</label> 
                        <div class="col-md-4 inputGroupContainer">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                <input name="ans3" id="ans3" placeholder="Answer" class="form-control"  type="text" required>

                            </div>
                        </div>
                    </div>



                    <!-- Success message -->
                    <div class="alert alert-success" role="alert" id="success_message">Success <i class="glyphicon glyphicon-thumbs-up"></i></div>

                    <!-- Button -->
                    <div class="form-group">
                        <label class="col-md-4 control-label"></label>
                        <div class="col-md-4">
                            <button type="submit" class="btn btn" >Add question</button>
                        </div>
                    </div>

                </fieldset>


            </form>


        </div>

    </body>
</html>