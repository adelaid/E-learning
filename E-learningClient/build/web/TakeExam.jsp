<%-- 
    Document   : TakeExam
    Created on : Aug 23, 2017, 11:24:30 AM
    Author     : Ada
--%>

<%@page import="java.util.Collections"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ws.Question"%>
<%@page import="ws.Exam"%>
<%@page import="ws.Course"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Take Exam</title>
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
                    <li class="active"><a href="ManageCoursesServlet">Manage Courses</a></li>
                    <li><a href="RegisterToCourse.jsp">Register To Course</a></li>
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
            <% List<Course> courses = (List<Course>) session.getAttribute("coursesRegisteredAt");
                List<Exam> exams = (List<Exam>) session.getAttribute("exams");
                int i = Integer.parseInt(request.getParameter("exam"));//51
                System.out.println("e " + i);
                Exam e = new Exam();
                for (Exam ee : exams) {
                    if (ee.getId() == i) {
                        e = ee;

                    }
                }
                boolean dispatcher = false;
                if (request.getAttribute("dispatcher") != null) {
                    dispatcher = (Boolean) request.getAttribute("dispatcher");
                }
                List<Question> qs = new ArrayList();
                if (!dispatcher) {
                    RequestDispatcher rd = request.getRequestDispatcher("/getQuestionsServlet");
                    request.setAttribute("examId", e.getId());
                    rd.forward(request, response);
                } else {
                    qs = (List<Question>) request.getAttribute("qs");
                }

            %>
            
        </div>-->
        </div>

        <div class="container">

            <form class="well form-horizontal"  method="post" action="TakeExamServlet"  id="contact_form">
                <fieldset>
                    <input name="examId" id="examId" type="text" value="<%=i%>" hidden>
                    <!-- Form Name -->

                    <%int contor = 1;
                        for (Question q : qs) {

                    %>
                    <div class="form-group">
                        <label class="col-md-4 control-label" ><%=contor + ". " + q.getQuestion()%></label> 
                        <div class="col-md-4 inputGroupContainer">
                            <div class="input-group">

                                <%String[] parts = q.getAnswer().split("##");
                                    List<String> strList = Arrays.asList(parts);
                                    Collections.shuffle(strList);
                                    parts = strList.toArray(new String[strList.size()]);

                                %>
                                <input name="<%=q.getId()%>" id="<%=q.getId()%>"type="radio" value="<%=parts[0]%>"><%=parts[0]%> <br>
                                <input name="<%=q.getId()%>" id="<%=q.getId()%>"type="radio" value="<%=parts[1]%>"><%=parts[1]%> <br>
                                <input name="<%=q.getId()%>" id="<%=q.getId()%>"type="radio" value="<%=parts[2]%>"><%=parts[2]%> <br>


                            </div>
                        </div>
                    </div>

                    <%contor++;
                        }%>


                    <!-- Success message -->
                    <div class="alert alert-success" role="alert" id="success_message">Success <i class="glyphicon glyphicon-thumbs-up"></i></div>

                    <!-- Button -->
                    <div class="form-group">
                        <label class="col-md-4 control-label"></label>
                        <div class="col-md-4">
                            <button type="submit" class="btn btn" >Submit answers </button>
                        </div>
                    </div>

                </fieldset>


            </form>



        </div>



    </body>
</html>