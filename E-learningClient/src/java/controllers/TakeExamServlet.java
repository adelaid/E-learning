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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import ws.Exam;
import ws.ExamWS_Service;
import ws.Question;
import ws.Student;

/**
 *
 * @author Ada
 */
public class TakeExamServlet extends HttpServlet {

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
    public double giveGrade(int noOfQs, int correctAnswers) {
        double grade = ((100.0 / noOfQs) * correctAnswers)/10.0;
      //  System.out.println("1: " + (100 / noOfQs) + " 2: " + (100.0 / noOfQs) * correctAnswers+ " 3: " + ((100 / noOfQs) * correctAnswers)/10.0 );
      //  System.out.println("noOfQs"+ noOfQs);
       // System.out.println("correct " + correctAnswers);
        //System.out.println("g " + grade);
        
          return Math.round(grade * 2) / 2.0;
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 
        Long examId = Long.parseLong(request.getParameter("examId"));

        
        List<Question> qs = getQuestionsByExam(examId);
        int noOfQs = qs.size();
        int correctAnswers = 0;
        for (Question q : qs) {
            String s = request.getParameter("" + q.getId());
            String a = q.getAnswer();
            String[] parts = a.split("##");
            if (s.equals(parts[0])) { //daca e rasp corect
                correctAnswers++;
                
            }
        }
        double grade=giveGrade(noOfQs, correctAnswers);
        System.out.println("grade: "+grade);
        
        Student s= (Student)request.getSession().getAttribute("user");
        gradeExam(examId, s.getId(), grade);
        request.getRequestDispatcher("ManageCoursesServlet").forward(request, response);
        // String[] courses = request.getParameterValues("desc");
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

    private java.util.List<ws.Question> getQuestionsByExam(java.lang.Long examId) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.ExamWS port = service.getExamWSPort();
        return port.getQuestionsByExam(examId);
    }

    private void gradeExam(java.lang.Long examId, java.lang.Long studentId, double grade) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.ExamWS port = service.getExamWSPort();
        port.gradeExam(examId, studentId, grade);
    }


}
