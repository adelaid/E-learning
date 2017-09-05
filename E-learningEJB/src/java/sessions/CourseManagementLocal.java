/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessions;

import domain.Course;
import domain.Material;
import java.util.Vector;
import javax.ejb.Local;

/**
 *
 * @author Ada
 */
@Local
public interface CourseManagementLocal {

    public void addCourse(String name, int duration, int noOfStudents, String description, String finalExaminationType, String startTime, String endTime);

    public Course getCourse(Long id);

    public void deleteCourse(Long id);

    public void editCourse(String name, int duration, String description, String finalexaminationtype, Long id, String startTime, String endTime);

    public void assignCoursetoLecturer(Long courseId, Long lecturerId);

    public Vector<Course> getAllCourses();

    public Vector<Course> getAllCoursesWithoutLecturer();

    public Vector<Course> getAllCoursesWithLecturer();

    public void updateNoOfStudents(Long courseId, int noS);

    public void addMaterial(Long courseId, String url, String name);
    
    public Vector<Material> getMaterialsByCourse(Long courseId);

}
