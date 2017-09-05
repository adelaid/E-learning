/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import ws.Course;
import ws.CourseWS_Service;
import ws.Lecturer;
import ws.LecturerWS_Service;
import ws.Student;
import ws.StudentCourse;
import ws.StudentWS_Service;

/**
 *
 * @author Ada
 */
@WebServlet(name = "LoginAdminServlet", urlPatterns = {"/LoginAdminServlet"})
public class LoginAdminServlet extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/StudentWS/StudentWS.wsdl")
    private StudentWS_Service service_2;

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/LecturerWS/LecturerWS.wsdl")
    private LecturerWS_Service service_1;

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
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("uname");
        String pass = request.getParameter("password");
        if (username.equals("admin") && pass.equals("admin")) {

            List<Course> courses = getAllCourses();
            List<Course> unassignedcourses = getAllCoursesWithoutLecturer();
            List<Lecturer> lecturers = getAllLecturers();
            List<StudentCourse> studentcourse = getAllStudentCourse();
            List<Student> students=getAllStudents();
            request.getSession().setAttribute("students", students);
            request.getSession().setAttribute("studentcourse", studentcourse);
            request.getSession().setAttribute("unassignedcourses", unassignedcourses);
            request.getSession().setAttribute("courses", courses);
            request.getSession().setAttribute("lecturers", lecturers);
            request.getSession().setAttribute("user", "admin");

            request.getRequestDispatcher("IndexJSP.jsp").forward(request, response);
        } else {
//        String error = "User does not exist or password is incorrect";
//                request.getSession().setAttribute("LOGIN_ERROR", error);
            request.getRequestDispatcher("IndexJSP.jsp").forward(request, response);

        }
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

    private java.util.List<ws.Course> getAllCourses() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.CourseWS port = service.getCourseWSPort();
        return port.getAllCourses();
    }

    private java.util.List<ws.Lecturer> getAllLecturers() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.LecturerWS port = service_1.getLecturerWSPort();
        return port.getAllLecturers();
    }

    private java.util.List<ws.Course> getAllCoursesWithoutLecturer() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.CourseWS port = service.getCourseWSPort();
        return port.getAllCoursesWithoutLecturer();
    }

    private java.util.List<ws.StudentCourse> getAllStudentCourse() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.StudentWS port = service_2.getStudentWSPort();
        return port.getAllStudentCourse();
    }

    private java.util.List<ws.Student> getAllStudents() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.StudentWS port = service_2.getStudentWSPort();
        return port.getAllStudents();
    }

}
