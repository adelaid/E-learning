/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import ws.LecturerWS_Service;
import ws.StudentWS_Service;

/**
 *
 * @author Ada
 */
@WebServlet(name = "RegisterServlet", urlPatterns = {"/RegisterServlet"})
public class RegisterServlet extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/LecturerWS/LecturerWS.wsdl")
    private LecturerWS_Service service_1;

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/StudentWS/StudentWS.wsdl")
    private StudentWS_Service service;

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
        String userType=request.getParameter("type");
        String username=request.getParameter("uname");
      String mail = request.getParameter("mail");
        String pass = request.getParameter("password");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String city=request.getParameter("city");
        String street=request.getParameter("street");
        String streetNo=request.getParameter("streetno");
        if(userType.equals("Student")){
         addStudent(firstName, lastName, mail, username, pass, city, street, streetNo);
        }
        else{
            addLecturer(firstName, lastName, mail, username, pass, city, street, streetNo);
        }
       
      
        request.getRequestDispatcher("LoginJSP.jsp").forward(request, response);
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

    private void addStudent(java.lang.String firstName, java.lang.String lastName, java.lang.String email, java.lang.String username, java.lang.String password, java.lang.String city, java.lang.String street, java.lang.String streetNo) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.StudentWS port = service.getStudentWSPort();
        port.addStudent(firstName, lastName, email, username, password, city, street, streetNo);
    }

    private void addLecturer(java.lang.String firstName, java.lang.String lastName, java.lang.String email, java.lang.String username, java.lang.String password, java.lang.String city, java.lang.String street, java.lang.String streetNo) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.LecturerWS port = service_1.getLecturerWSPort();
        port.addLecturer(firstName, lastName, email, username, password, city, street, streetNo);
    }

}
