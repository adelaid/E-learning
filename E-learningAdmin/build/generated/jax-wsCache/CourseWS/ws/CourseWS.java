
package ws;

import java.util.List;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CourseWS", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CourseWS {


    /**
     * 
     * @return
     *     returns java.util.List<ws.Course>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllCoursesWithoutLecturer", targetNamespace = "http://ws/", className = "ws.GetAllCoursesWithoutLecturer")
    @ResponseWrapper(localName = "getAllCoursesWithoutLecturerResponse", targetNamespace = "http://ws/", className = "ws.GetAllCoursesWithoutLecturerResponse")
    @Action(input = "http://ws/CourseWS/getAllCoursesWithoutLecturerRequest", output = "http://ws/CourseWS/getAllCoursesWithoutLecturerResponse")
    public List<Course> getAllCoursesWithoutLecturer();

    /**
     * 
     * @param lecturerId
     * @param courseId
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "assignCoursetoLecturer", targetNamespace = "http://ws/", className = "ws.AssignCoursetoLecturer")
    @Action(input = "http://ws/CourseWS/assignCoursetoLecturer")
    public void assignCoursetoLecturer(
        @WebParam(name = "courseId", targetNamespace = "")
        Long courseId,
        @WebParam(name = "lecturerId", targetNamespace = "")
        Long lecturerId);

    /**
     * 
     * @return
     *     returns java.util.List<ws.Course>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllCoursesWithLecturer", targetNamespace = "http://ws/", className = "ws.GetAllCoursesWithLecturer")
    @ResponseWrapper(localName = "getAllCoursesWithLecturerResponse", targetNamespace = "http://ws/", className = "ws.GetAllCoursesWithLecturerResponse")
    @Action(input = "http://ws/CourseWS/getAllCoursesWithLecturerRequest", output = "http://ws/CourseWS/getAllCoursesWithLecturerResponse")
    public List<Course> getAllCoursesWithLecturer();

    /**
     * 
     * @param id
     * @return
     *     returns ws.Course
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCourse", targetNamespace = "http://ws/", className = "ws.GetCourse")
    @ResponseWrapper(localName = "getCourseResponse", targetNamespace = "http://ws/", className = "ws.GetCourseResponse")
    @Action(input = "http://ws/CourseWS/getCourseRequest", output = "http://ws/CourseWS/getCourseResponse")
    public Course getCourse(
        @WebParam(name = "id", targetNamespace = "")
        Long id);

    /**
     * 
     * @param id
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "deleteCourse", targetNamespace = "http://ws/", className = "ws.DeleteCourse")
    @Action(input = "http://ws/CourseWS/deleteCourse")
    public void deleteCourse(
        @WebParam(name = "id", targetNamespace = "")
        Long id);

    /**
     * 
     * @return
     *     returns java.util.List<ws.Course>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllCourses", targetNamespace = "http://ws/", className = "ws.GetAllCourses")
    @ResponseWrapper(localName = "getAllCoursesResponse", targetNamespace = "http://ws/", className = "ws.GetAllCoursesResponse")
    @Action(input = "http://ws/CourseWS/getAllCoursesRequest", output = "http://ws/CourseWS/getAllCoursesResponse")
    public List<Course> getAllCourses();

    /**
     * 
     * @param duration
     * @param finalExaminationType
     * @param name
     * @param noOfStudents
     * @param description
     * @param startTime
     * @param endTime
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "addCourse", targetNamespace = "http://ws/", className = "ws.AddCourse")
    @Action(input = "http://ws/CourseWS/addCourse")
    public void addCourse(
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "duration", targetNamespace = "")
        int duration,
        @WebParam(name = "noOfStudents", targetNamespace = "")
        int noOfStudents,
        @WebParam(name = "description", targetNamespace = "")
        String description,
        @WebParam(name = "finalExaminationType", targetNamespace = "")
        String finalExaminationType,
        @WebParam(name = "startTime", targetNamespace = "")
        String startTime,
        @WebParam(name = "endTime", targetNamespace = "")
        String endTime);

    /**
     * 
     * @param duration
     * @param finalexaminationtype
     * @param name
     * @param description
     * @param startTime
     * @param id
     * @param endTime
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "editCourse", targetNamespace = "http://ws/", className = "ws.EditCourse")
    @Action(input = "http://ws/CourseWS/editCourse")
    public void editCourse(
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "duration", targetNamespace = "")
        int duration,
        @WebParam(name = "description", targetNamespace = "")
        String description,
        @WebParam(name = "finalexaminationtype", targetNamespace = "")
        String finalexaminationtype,
        @WebParam(name = "id", targetNamespace = "")
        Long id,
        @WebParam(name = "startTime", targetNamespace = "")
        String startTime,
        @WebParam(name = "endTime", targetNamespace = "")
        String endTime);

    /**
     * 
     * @param noS
     * @param courseId
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "updateNoOfStudents", targetNamespace = "http://ws/", className = "ws.UpdateNoOfStudents")
    @Action(input = "http://ws/CourseWS/updateNoOfStudents")
    public void updateNoOfStudents(
        @WebParam(name = "courseId", targetNamespace = "")
        Long courseId,
        @WebParam(name = "noS", targetNamespace = "")
        int noS);

}
