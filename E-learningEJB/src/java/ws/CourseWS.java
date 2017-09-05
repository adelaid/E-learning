/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import domain.Course;
import domain.Material;
import java.util.Vector;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import sessions.CourseManagementLocal;

/**
 *
 * @author Ada
 */
@WebService(serviceName = "CourseWS")
@Stateless()
public class CourseWS {

    @EJB
    private CourseManagementLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "addCourse")
    @Oneway
    public void addCourse(@WebParam(name = "name") String name, @WebParam(name = "duration") int duration,  @WebParam(name = "noOfStudents") int noOfStudents,  @WebParam(name = "description") String description,  @WebParam(name = "finalExaminationType") String finalExaminationType, @WebParam(name = "startTime")String startTime,  @WebParam(name = "endTime")String endTime) {
        ejbRef.addCourse(name, duration, noOfStudents,description ,finalExaminationType,  startTime,  endTime);
    }
  

    @WebMethod(operationName = "getCourse")
    public Course getCourse(@WebParam(name = "id") Long id) {
        return ejbRef.getCourse(id);
    }
    @WebMethod(operationName = "assignCoursetoLecturer")
     @Oneway
    public void assignCoursetoLecturer(@WebParam(name = "courseId") Long courseId,@WebParam(name = "lecturerId") Long lecturerId) {
         ejbRef.assignCoursetoLecturer(courseId, lecturerId);
    }
     @WebMethod(operationName = "getAllCourses")
    public Vector<Course> getAllCourses() {
        return ejbRef.getAllCourses();
    }
    @WebMethod(operationName = "getAllCoursesWithoutLecturer")
    public Vector<Course> getAllCoursesWithoutLecturer() {
        return ejbRef.getAllCoursesWithoutLecturer();
    }
   
     @WebMethod(operationName = "getAllCoursesWithLecturer")
    public Vector<Course> getAllCoursesWithoLecturer() {
        return ejbRef.getAllCoursesWithLecturer();
    }
    
    
    @WebMethod(operationName = "deleteCourse")
    @Oneway
    public void deleteCourse(@WebParam(name="id") Long id){
    ejbRef.deleteCourse(id);
    }
     @WebMethod(operationName = "updateNoOfStudents")
    @Oneway
    public void updateNoOfStudents(@WebParam(name="courseId") Long courseId, @WebParam(name="noS") int noS){
    ejbRef.updateNoOfStudents(courseId, noS);
    }
    
    
    @WebMethod(operationName = "editCourse")
    @Oneway
    public void editCourse(@WebParam(name="name") String name,@WebParam(name="duration") int duration,@WebParam(name="description") String description,@WebParam(name="finalexaminationtype") String finalexaminationtype, @WebParam(name="id") Long id , @WebParam(name="startTime")String startTime, @WebParam(name="endTime")String endTime){
    ejbRef.editCourse(name, duration, description, finalexaminationtype, id, startTime, endTime);
    }
    
    @WebMethod(operationName = "addMaterial")
    @Oneway
    public void addMaterial(@WebParam(name="courseId") Long courseId,@WebParam(name="url") String url, @WebParam(name="name") String name){
    ejbRef.addMaterial(courseId, url, name);
    }
    
    @WebMethod(operationName = "getMaterialsByCourse")
    public Vector<Material> getMaterialsByCourse(@WebParam(name="courseId") Long courseId) {
        return ejbRef.getMaterialsByCourse(courseId);
                }
}
