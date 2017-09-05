<%-- 
    Document   : ViewQuestionJSP
    Created on : Aug 22, 2017, 11:13:38 PM
    Author     : Ada
--%>

<%@page import="ws.Course"%>
<%@page import="ws.Question"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Question</title>
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
                    <li ><a href="AddExam.jsp">Add Exam</a></li>
                    <li class="active"><a href="AddQuestions.jsp">Add Questions</a></li>
                    <li><a href="ViewStudentsGrades.jsp">View Students Grades</a></li>
                    <li><a href="AddMaterials.jsp">Add Materials</a></li>
                </ul>
            </div>
        </nav>  


        <%

            int i = Integer.parseInt(request.getParameter("query"));
            List<Question> qs = (List<Question>) session.getAttribute("qs");
            List<Course> cours = (List<Course>) session.getAttribute("courses");
            Question c = new Question();
            for (int j = 0; j < qs.size(); j++) {
                if (qs.get(j).getId() == i) {
                    c = qs.get(j);
                }
            }
            String ans = c.getAnswer();
            String[] parts = ans.split("##");


        %>

        <div class="loginform">

            <div class="form-element">

                <h2>View Question</h2>
                <form class="well form-horizontal" action="SetVisitC" method="post" id="contact_form">
                    <div class="row">
                        <div class='col-sm-6'>
                            <div class="form-group">
                                <label class="col-md-3 form-element" >Course </label> 
                                <p ><%=c.getCourse().getName()
                                    %></p> 






                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class='col-sm-6'>
                            <div class="form-group">
                                <label class="col-md-3 form-element" >Question: </label> 
                                <p ><%=c.getQuestion()%></p> 






                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class='col-sm-6'>
                            <div class="form-group">
                                <label class="col-md-3 form-element" >Correct Answer </label> 
                                <p ><%=parts[0]%></p> 






                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class='col-sm-6'>
                            <div class="form-group">
                                <label class="col-md-3 form-element" >Wrong Answer </label> 
                                <p ><%=parts[1]%></p> 






                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class='col-sm-6'>
                            <div class="form-group">
                                <label class="col-md-3 form-element" >Wrong Answer </label> 
                                <p ><%=parts[2]%></p> 






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