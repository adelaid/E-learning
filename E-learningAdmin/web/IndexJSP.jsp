<%-- 
    Document   : IndexJSP
    Created on : Mar 21, 2017, 4:29:56 PM
    Author     : Ada
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index</title>
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <link href="resources/css/jumbotron-narrow.css" rel="stylesheet" type="text/css"/>
        <style>#success_message{ display: none;}</style>
        <style>



        </style>

    </head>
    <%
        String error = "";
        if (request.getAttribute("LOGIN_ERROR") != null) {
            error = (String) request.getAttribute("LOGIN_ERROR");
        }
        boolean log = false;
        if (request.getSession().getAttribute("user") != null) {
            log = true;
        }
//request.getSession().setAttribute("user", ct);

    %>
    <body background="index.png">
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="IndexJSP.jsp">E-Learning Admin Platform</a>
                </div>
                <ul class="nav navbar-nav">

                    <%if (log) {

                    %>
                    <li class="active"> <a href="IndexJSP.jsp">Home</a></li>

                    <li><a href="LogoutServlet">Logout </a></li>
                    <li><a href="AddCourse.jsp">Add course</a></li>
                    <li><a href="AssignCourseToLecturer.jsp">Assign Course to Lecturer</a></li>
                    <li><a href="ManageCourses.jsp">Manage courses</a></li>
                    <li><a href="ConfirmRegistrationToCourse.jsp">Confirm Registration To Course</a></li>
                        <%} else {%>
                    <li class="active"> <a href="IndexJSP.jsp">Home</a></li>
                    <li><a href="LoginJSP.jsp">Login</a></li>
                    
                        <%}%>
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

    </body>
</html>
