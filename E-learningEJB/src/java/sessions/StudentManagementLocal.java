/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessions;

import domain.Student;
import domain.StudentCourse;
import java.util.Vector;
import javax.ejb.Local;

/**
 *
 * @author Ada
 */
@Local
public interface StudentManagementLocal {

    public void addStudent(String firstName, String lastName, String email, String username, String password, String city, String street, String streetNo);

    public boolean userExists(String username, String password);

    public Student getStudent(String username);

    public void registerToCourse(Long courseId, Long studentId);

    public void confirmRegisterToCourse(Long studentId, Long courseId);
    
     public Vector<StudentCourse> getCourseByStudent(Long studentId) ;
     
     public Vector<StudentCourse> getAllStudentCourse();
     
     public Vector<Student> getAllStudents();
}
