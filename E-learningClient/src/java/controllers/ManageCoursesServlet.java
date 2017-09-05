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
import ws.CourseWS_Service;
import ws.Exam;
import ws.ExamGrades;
import ws.ExamWS_Service;
import ws.Material;
import ws.Student;

/**
 *
 * @author Ada
 */
@WebServlet(name = "ManageCoursesServlet", urlPatterns = {"/ManageCoursesServlet"})
public class ManageCoursesServlet extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/CourseWS/CourseWS.wsdl")
    private CourseWS_Service service_1;

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
        response.setContentType("text/html;charset=UTF-8");
        Student s = (Student) request.getSession().getAttribute("user");
        List<Exam> exams = (List<Exam>) request.getSession().getAttribute("exams");
        List<Exam> examsTaken = new ArrayList<Exam>();
        for (Exam e : exams) {
            System.out.println("exam name " + e.getName() + "size " + exams.size());
            if (isExamTaken(e.getId(), s.getId())) {
                System.out.println("tralala");
                examsTaken.add(e);
            }
            else{
              //  System.out.println("s-a dat examenuuuuuu");
            }
        }
        List<ExamGrades> eg=new ArrayList<>();
        for(Exam e: examsTaken){
        eg.addAll(getExamGrade(e.getId()));
        }
        
        for(ExamGrades g: eg){
            System.out.println("grades: " + g.getGrade());
        }
        request.getSession().setAttribute("examGrades", eg);
        request.getSession().setAttribute("examsTaken", examsTaken);
        
        //--- materiale
        List<Material> m = new ArrayList<Material>();
        List<Course> courses= (List<Course>)request.getSession().getAttribute("coursesRegisteredAt");
        for(Course c: courses){
        m.addAll(getMaterialsByCourse(c.getId()));
        }
        
         request.getSession().setAttribute("materials", m);
        request.getRequestDispatcher("ManageCourses.jsp").forward(request, response);
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

    private boolean isExamTaken(java.lang.Long examId, java.lang.Long studentId) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.ExamWS port = service.getExamWSPort();
        return port.isExamTaken(examId, studentId);
    }

    private java.util.List<ws.ExamGrades> getExamGrade(java.lang.Long examId) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.ExamWS port = service.getExamWSPort();
        return port.getExamGrade(examId);
    }

    private java.util.List<ws.Material> getMaterialsByCourse(java.lang.Long courseId) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.CourseWS port = service_1.getCourseWSPort();
        return port.getMaterialsByCourse(courseId);
    }

  

}
