/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessions;

import domain.Course;
import domain.Exam;
import domain.Lecturer;
import java.util.Vector;
import javax.ejb.Local;

/**
 *
 * @author Ada
 */
@Local
public interface LecturerManagementLocal {

    public void addLecturer(String firstName, String lastName, String email, String username, String password, String city, String street, String streetNo);

    public boolean userExists(String username, String password);

    public Lecturer getLecturer(String username);

    public Vector<Lecturer> getAllLecturers();

    public Vector<Course> getLecturerCourses(Long lecturerId);

   
}
