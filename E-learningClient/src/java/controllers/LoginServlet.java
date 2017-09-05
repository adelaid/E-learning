/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import ws.Course;
import ws.CourseWS_Service;
import ws.Exam;
import ws.ExamWS_Service;
import ws.Lecturer;
import ws.LecturerWS_Service;
import ws.Question;
import ws.Student;
import ws.StudentCourse;
import ws.StudentWS_Service;

/**
 *
 * @author Ada
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/ExamWS/ExamWS.wsdl")
    private ExamWS_Service service_3;

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/CourseWS/CourseWS.wsdl")
    private CourseWS_Service service_2;

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
        String type = request.getParameter("type");
        System.out.println(type);
        String username = request.getParameter("uname");
        String pass = request.getParameter("password");

        if (type.equals("Student")) {
            if (userExists(username, pass)) {
                Student ct = getStudent(username);
                request.getSession().setAttribute("user", ct);
                request.getSession().setAttribute("type", type);

                ArrayList<Course> courses = (ArrayList) getAllCoursesWithLecturer();
                List<StudentCourse> sc = getCourseByStudent(ct.getId());
                ArrayList<Course> coursesRegisteredAt = new ArrayList<>();
                List<Course> coursesNotRegisteredAt = new ArrayList<>();
                if (sc.size() != 0) {
                    for (StudentCourse s : sc) {
                        Course c = getCourse(s.getCourseId());
                        coursesRegisteredAt.add(c);

                        // 
                    }
                    request.getSession().setAttribute("coursesRegisteredAt", coursesRegisteredAt);
                    List<Exam> exams = new ArrayList<Exam>();
                    if (coursesRegisteredAt.size() != 0) {
                        System.out.println("1");
                        for (Course c : coursesRegisteredAt) {
                            List<Exam> ex = getExamsByCourse(c.getId());
                            exams.addAll(ex);
                            //System.out.println("Courses registered at: "+ c.getName());
                        }
                        request.getSession().setAttribute("exams", exams);
                        //-------------->

                        Set<Long> set1 = new HashSet<Long>();
                        for (Course c : courses) {
                            set1.add(c.getId());
                        }
                        //  set1.addAll(courses);

                        Set<Long> set2 = new HashSet<Long>();
                        for (Course c : coursesRegisteredAt) {
                            set2.add(c.getId());
                        }

                        set1.removeAll(set2);
                        //  set2.addAll(coursesRegisteredAt);
                        // set1.retainAll(set2);//set1=coursesNotregister at
                        for (Long l : set1) {
                            coursesNotRegisteredAt.add(getCourse(l));
                        }
                        //   ArrayList<Long> coursesNotRegisteredAt2 = new ArrayList<>(set1);
                        for (Course c : coursesNotRegisteredAt) {
                            System.out.println("Courses not registerd at: " + c.getName());
                        }
//                        Collection<Course> coursesCol = courses;
//                        Collection<Course> coursesRegAtCol = coursesRegisteredAt;
//                        request.getSession().setAttribute("coursesRegisteredAt", coursesRegisteredAt);
//                        Collection<Course> similar = new HashSet<Course>(coursesCol);
//
//                        Collection<Course> different = new HashSet<Course>();
//                        different.addAll(coursesCol);
//                        different.addAll(coursesRegAtCol);
//
//                        similar.retainAll(coursesRegAtCol);
//                        for (Course c : similar) {//similar=0
//                            System.out.println("course registered " + c.getName());
//                        }
//                        different.removeAll(similar);
//
//                        coursesNotRegisteredAt = new ArrayList<>(different);

                        request.getSession().setAttribute("coursesNotRegisteredAt", coursesNotRegisteredAt);
                    } else {
                        System.out.println("2");
                        request.getSession().setAttribute("coursesNotRegisteredAt", courses);
                    }
                }
                else{
                    request.getSession().setAttribute("coursesNotRegisteredAt", courses);
                }

                request.getSession().setAttribute("courses", courses);
                System.out.println("Logat ca student");
                request.getRequestDispatcher("IndexJSP.jsp").forward(request, response);

            } else {
//        String error = "User does not exist or password is incorrect";
//                request.getSession().setAttribute("LOGIN_ERROR", error);
                request.getRequestDispatcher("RegisterJSP.jsp").forward(request, response);
                System.out.println("Nelogat ca student");
            }

        } else if (type.equals("Lecturer")) {
            if (userExists_1(username, pass)) {
                Lecturer lt = getLecturer(username);

                request.getSession().setAttribute("user", lt);
                request.getSession().setAttribute("type", type);
                System.out.println("Logat ca profesor");
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
                List<Question> qs = getAllQuestions();
                List<Student> students = getAllStudents();
                request.getSession().setAttribute("students", students);
                request.getSession().setAttribute("qs", qs);
                request.getSession().setAttribute("courses", courses);
                request.getRequestDispatcher("IndexJSP.jsp").forward(request, response);
            } else {
//        String error = "User does not exist or password is incorrect";
//                request.getSession().setAttribute("LOGIN_ERROR", error);
                System.out.println("Nelogat ca profesor");
                request.getRequestDispatcher("RegisterJSP.jsp").forward(request, response);

            }

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

    private boolean userExists(java.lang.String username, java.lang.String password) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.StudentWS port = service.getStudentWSPort();
        return port.userExists(username, password);
    }

    private boolean userExists_1(java.lang.String username, java.lang.String password) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.LecturerWS port = service_1.getLecturerWSPort();
        return port.userExists(username, password);
    }

    private Student getStudent(java.lang.String username) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.StudentWS port = service.getStudentWSPort();
        return port.getStudent(username);
    }

    private Lecturer getLecturer(java.lang.String username) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.LecturerWS port = service_1.getLecturerWSPort();
        return port.getLecturer(username);
    }

    private java.util.List<ws.Course> getAllCourses() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.CourseWS port = service_2.getCourseWSPort();
        return port.getAllCourses();
    }

    private java.util.List<ws.Course> getAllCoursesWithLecturer() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.CourseWS port = service_2.getCourseWSPort();
        return port.getAllCoursesWithLecturer();
    }

    private java.util.List<ws.StudentCourse> getCourseByStudent(java.lang.Long studentId) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.StudentWS port = service.getStudentWSPort();
        return port.getCourseByStudent(studentId);
    }

    private Course getCourse(java.lang.Long id) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.CourseWS port = service_2.getCourseWSPort();
        return port.getCourse(id);
    }

    private java.util.List<ws.Course> getLecturerCourses(java.lang.Long lecturerId) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.LecturerWS port = service_1.getLecturerWSPort();
        return port.getLecturerCourses(lecturerId);
    }

    private java.util.List<ws.Exam> getExamsByCourse(java.lang.Long id) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.ExamWS port = service_3.getExamWSPort();
        return port.getExamsByCourse(id);
    }

    private java.util.List<ws.Question> getAllQuestions() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.ExamWS port = service_3.getExamWSPort();
        return port.getAllQuestions();
    }

    private java.util.List<ws.Question> getQuestionsByExam(java.lang.Long examId) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.ExamWS port = service_3.getExamWSPort();
        return port.getQuestionsByExam(examId);
    }

    private java.util.List<ws.Student> getAllStudents() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.StudentWS port = service.getStudentWSPort();
        return port.getAllStudents();
    }

}
