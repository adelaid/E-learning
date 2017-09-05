/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import domain.Student;
import domain.StudentCourse;
import java.util.Vector;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import sessions.StudentManagementLocal;

/**
 *
 * @author Ada
 */
@WebService(serviceName = "StudentWS")
@Stateless()
public class StudentWS {

    @EJB
    private StudentManagementLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "addStudent")
    @Oneway
    public void addStudent(@WebParam(name = "firstName") String firstName, @WebParam(name = "lastName") String lastName, @WebParam(name = "email") String email, @WebParam(name = "username") String username, @WebParam(name = "password") String password,  @WebParam(name = "city") String city, @WebParam(name = "street") String street, @WebParam(name = "streetNo") String streetNo) {
        ejbRef.addStudent(firstName, lastName, email, username, password, city, street, streetNo);
    }
    
      @WebMethod(operationName = "getStudent")
    public Student getStudent(@WebParam(name = "username") String username) {
        return ejbRef.getStudent(username);
    }

    @WebMethod(operationName = "userExists")
    public boolean userExists(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {
        return ejbRef.userExists(username, password);
    }
    
     @WebMethod(operationName = "registerToCourse")
     @Oneway
    public void registerToCourse(@WebParam(name = "courseId") Long courseId,@WebParam(name = "studentId") Long studentId) {
         ejbRef.registerToCourse(courseId, studentId);
    }
    
     @WebMethod(operationName = "confirmRegisterToCourse")
     @Oneway
    public void confirmRegisterToCourse(@WebParam(name = "studentId") Long studentId,@WebParam(name = "courseId") Long courseId) {
         ejbRef.confirmRegisterToCourse(studentId, courseId);
    }
     @WebMethod(operationName = "getCourseByStudent")
     public Vector<StudentCourse> getCourseByStudent(@WebParam(name = "studentId")Long studentId){
     return ejbRef.getCourseByStudent(studentId);
     } 
     @WebMethod(operationName = "getAllStudentCourse")
     public Vector<StudentCourse> getAllStudentCourse(){
     return ejbRef.getAllStudentCourse();
     }
     @WebMethod(operationName = "getAllStudents")
     public Vector<Student> getAllStudents(){
     return ejbRef.getAllStudents();
     }
    
    
}
