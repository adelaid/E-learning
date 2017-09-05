/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import ws.Course;
import ws.Exam;
import ws.ExamWS_Service;
import ws.Lecturer;
import ws.LecturerWS_Service;

/**
 *
 * @author Ada
 */
@WebServlet(name = "AddExamServlet", urlPatterns = {"/AddExamServlet"})
public class AddExamServlet extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/LecturerWS/LecturerWS.wsdl")
    private LecturerWS_Service service_1;

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/ExamWS/ExamWS.wsdl")
    private ExamWS_Service service;

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
        Lecturer lt=(Lecturer)request.getSession().getAttribute("user");
        String examName = request.getParameter("name");
        int duration = Integer.parseInt(request.getParameter("duration"));
        String dateStart = request.getParameter("datestart");
        String timeStart = request.getParameter("timestart");
        String dateEnd = request.getParameter("dateend");
        String timeEnd = request.getParameter("timeend");
        Long course = Long.parseLong(request.getParameter("course"));
        
        System.out.println(examName + duration + dateStart + timeStart + dateEnd +timeEnd + course);
        addExam(examName, course, duration, dateStart+" "+timeStart, dateEnd+" "+timeEnd);
        
        
         ArrayList<Course> courses = (ArrayList) getLecturerCourses(lt.getId());
                List<Exam> exams = new ArrayList<Exam>();
                if (courses.size() != 0) {
                    for (Course c : courses) {
                        List<Exam> ex = getExamsByCourse(c.getId());
                        exams.addAll(ex);

                    }
                    for (Exam e : exams) {
                        System.out.println(e.getName());
                    }
                    request.getSession().setAttribute("exams", exams);
                }
        
        
         request.getRequestDispatcher("AddQuestions.jsp").forward(request, response);
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

    private void addExam(java.lang.String name, java.lang.Long courseId, int duration, java.lang.String startTime, java.lang.String endTime) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.ExamWS port = service.getExamWSPort();
        port.addExam(name, courseId, duration, startTime, endTime);
    }

    private java.util.List<ws.Exam> getExamsByCourse(java.lang.Long id) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.ExamWS port = service.getExamWSPort();
        return port.getExamsByCourse(id);
    }

    private java.util.List<ws.Course> getLecturerCourses(java.lang.Long lecturerId) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.LecturerWS port = service_1.getLecturerWSPort();
        return port.getLecturerCourses(lecturerId);
    }

}
