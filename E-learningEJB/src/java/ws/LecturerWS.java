/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import domain.Course;
import domain.Lecturer;
import domain.Student;
import java.util.Vector;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import sessions.LecturerManagementLocal;

/**
 *
 * @author Ada
 */
@WebService(serviceName = "LecturerWS")
@Stateless()
public class LecturerWS {

    @EJB
    private LecturerManagementLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "addLecturer")
    @Oneway
    public void addLecturer(@WebParam(name = "firstName") String firstName, @WebParam(name = "lastName") String lastName, @WebParam(name = "email") String email, @WebParam(name = "username") String username, @WebParam(name = "password") String password, @WebParam(name = "city") String city, @WebParam(name = "street") String street, @WebParam(name = "streetNo") String streetNo) {
        ejbRef.addLecturer(firstName, lastName, email, username, password, city, street, streetNo);
    }
      @WebMethod(operationName = "getLecturer")
    public Lecturer getLecturer(@WebParam(name = "username") String username) {
        return ejbRef.getLecturer(username);
    }

    @WebMethod(operationName = "userExists")
    public boolean userExists(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {
        return ejbRef.userExists(username, password);
    }
    
      @WebMethod(operationName = "getAllLecturers")
    public Vector<Lecturer> getAllLecturers() {
        return ejbRef.getAllLecturers();
    }
    @WebMethod(operationName = "getLecturerCourses")
    public Vector<Course> getLecturerCourses(@WebParam(name = "lecturerId")Long lecturerId){
    return ejbRef.getLecturerCourses(lecturerId);
    }
    
}
