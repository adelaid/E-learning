/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import ws.Course;
import ws.CourseWS_Service;
import ws.Lecturer;

/**
 *
 * @author Ada
 */
@WebServlet(name = "AddCourseServlet", urlPatterns = {"/AddCourseServlet"})
public class AddCourseServlet extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/CourseWS/CourseWS.wsdl")
    private CourseWS_Service service;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    public LocalDate getlDate(String t) {
        
        DateTimeFormatter formatterX
                = DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.US);
        LocalDate localDate = LocalDate.parse(t, formatterX);
        return localDate;
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name=request.getParameter("name");
        int duration=Integer.parseInt(request.getParameter("duration"));
        String description = request.getParameter("description");
        System.out.println(description);
        String finalexam=request.getParameter("type");
         String startTime= request.getParameter("date");
         LocalDate stime = getlDate(startTime);
         LocalDate etime=stime.plusWeeks(duration);
         String endTime= etime.toString();
       //  String endTime=
         System.out.println("startTime  " + startTime);
        addCourse(name, duration, 0, description, finalexam, startTime, endTime);
         List<Course> unassignedcourses = getAllCoursesWithoutLecturer();
      
              request.getSession().setAttribute("unassignedcourses", unassignedcourses);
          request.getRequestDispatcher("IndexJSP.jsp").forward(request, response);
       
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

  

    private java.util.List<ws.Course> getAllCoursesWithoutLecturer() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.CourseWS port = service.getCourseWSPort();
        return port.getAllCoursesWithoutLecturer();
    }

    private void addCourse(java.lang.String name, int duration, int noOfStudents, java.lang.String description, java.lang.String finalExaminationType, java.lang.String startTime, java.lang.String endTime) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.CourseWS port = service.getCourseWSPort();
        port.addCourse(name, duration, noOfStudents, description, finalExaminationType, startTime, endTime);
    }

    

}
