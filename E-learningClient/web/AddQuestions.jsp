<%-- 
    Document   : AddQuestions
    Created on : Aug 22, 2017, 5:19:43 PM
    Author     : Ada
--%>

<%@page import="ws.Question"%>
<%@page import="ws.Exam"%>
<%@page import="java.util.List"%>
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
        <title>Add Questions to Exam</title>
    </head>
    <%

        List<Course> courses = (List<Course>) session.getAttribute("courses");
        List<Exam> exams = (List<Exam>) session.getAttribute("exams");
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

            <form class="well form-horizontal"  method="post" action="AddQuestionsToExamServlet"  id="contact_form">
                <fieldset>

                    <!-- Form Name -->


                    <!-- Text input-->
                 


                    <div class="form-group">
                        <label class="col-md-4 control-label" >Choose Exam</label> 
                        <div class="col-md-4 inputGroupContainer">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                <select class="form-control" id="exam" name="exam">
                                    <%for (Exam c : exams) {%>


                                    <option value="<%=c.getId()%>" class="form-control"><%=c.getName() +"(Course: "+ c.getCourse().getName() +")"
                                        %></option>

                                    <% }%>
                                </select>
                            </div>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label" >Choose questions</label> 
                        <div class="col-md-4 inputGroupContainer">
                            <div class="input-group">
                                <%if (qs.size() != 0) {
                                        for (Question c : qs) {

                                %>
                                <input name="qs" id="qs"    type="checkbox" value="<%=c.getId()%>"><a href="ViewQuestionJSP.jsp?query=<%=c.getId()%>"> <%=c.getQuestion()%></a>
                                <br>

                                <%}
                                    }%>
                            </div>
                        </div>
                    </div>


                    <!-- Success message -->
                    <div class="alert alert-success" role="alert" id="success_message">Success <i class="glyphicon glyphicon-thumbs-up"></i></div>

                    <!-- Button -->
                    <div class="form-group">
                        <label class="col-md-4 control-label"></label>
                        <div class="col-md-4">
                            <button type="submit" class="btn btn" >Add selected questions </button>
                        </div>
                    </div>

                </fieldset>


            </form>
            <form class="well form-horizontal"  method="post" action="AddNewQS.jsp"  id="qs">
                <fieldset>
                     <div class="alert alert-success" role="alert" id="success_message">Success <i class="glyphicon glyphicon-thumbs-up"></i></div>
                    <div class="form-group">
                        <label class="col-md-4 control-label"></label>
                        <div class="col-md-4">
                            <button type="submit" class="btn btn" >Add new question!</button>
                        </div>
                    </div>
                    
                </fieldset>
            </form>

        </div>

    </body>
</html>