/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessions;

import domain.Address;
import domain.Course;
import domain.Student;
import domain.StudentCourse;
import java.util.Vector;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Ada
 */
@Stateless
public class StudentManagement implements StudentManagementLocal {

    @PersistenceContext(unitName = "E-learningEJBPU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }

    @Override
    public void addStudent(String firstName, String lastName, String email, String username, String password, String city, String street, String streetNo) {
        Student s = new Student();
        Address a = new Address();

        a.setCity(city);
        a.setStreet(street);
        a.setStreetNo(streetNo);
        em.persist(a);

        s.setFirstName(firstName);
        s.setLastName(lastName);
        s.setEmail(email);
        s.setUsername(username);
        s.setPassword(password);
   

        s.setAddress(a);
        em.persist(s);

    }
  public boolean userExists(String username, String password) {

        Query query = em.createQuery("SELECT u FROM Student AS u WHERE u.username = '" + username + "'", Student.class);
        Student st = (Student) query.getSingleResult();
        if (st.getPassword().equals(password)) {
            System.out.println("exista");
            return true;

        } else {
            System.out.println("nu exista");
            return false;
        }
    }
  
   public Student getStudent(String username) {
        Query query = em.createQuery("SELECT u FROM Student AS u WHERE u.username = '" + username + "'", Student.class);
        //  System.out.println("management " + query.getSingleResult().toString());
        Student st = (Student) query.getSingleResult();

        return st;
    }
   
   public void registerToCourse(Long courseId, Long studentId){
   StudentCourse sc=new StudentCourse();
   sc.setCourseId(courseId);
   sc.setStudentId(studentId);
   sc.setConfirmed("NO");
   em.persist(sc);
   }
   
   public void confirmRegisterToCourse(Long studentId, Long courseId){
    String sQuery = "UPDATE StudentCourse p SET p.confirmed = :cookieUUID "+
                 "WHERE p.studentId = :userID AND p.courseId= :courseID";
 //StudentCourse sc=em.find(StudentCourse.class, lecturerId);
     Query query= em.createQuery(sQuery );
     query.setParameter("cookieUUID", "YES");
     query.setParameter("courseID", courseId);
     query.setParameter("userID", studentId);
     query.executeUpdate();
   }
   public Vector<StudentCourse> getCourseByStudent(Long studentId) {
        Query query = em.createQuery("SELECT tl FROM StudentCourse tl WHERE tl.studentId ='" + studentId + "'", StudentCourse.class);
        return (Vector<StudentCourse>) query.getResultList();
    }
   
    public Vector<StudentCourse> getAllStudentCourse() {
        Query query = em.createQuery("SELECT tl FROM StudentCourse tl WHERE tl.confirmed='"+"NO"+"'", StudentCourse.class);
        return (Vector<StudentCourse>) query.getResultList();
    }
     public Vector<Student> getAllStudents() {
        Query query = em.createQuery("SELECT tl FROM Student tl", Student.class);
        return (Vector<Student>) query.getResultList();
    }
    
   
}
