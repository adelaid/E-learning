/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessions;

import domain.Address;
import domain.Course;
import domain.Lecturer;
import domain.Student;
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
public class LecturerManagement implements LecturerManagementLocal {
    
    @PersistenceContext(unitName = "E-learningEJBPU")
    private EntityManager em;

    public void addLecturer(String firstName, String lastName, String email, String username, String password, String city, String street, String streetNo) {
        
        Lecturer l = new Lecturer();
        Address a = new Address();
        l.setEmail(email);
        l.setFirstName(firstName);
        l.setLastName(lastName);
        l.setPassword(password);
        l.setUsername(username);
        
        a.setCity(city);
        a.setStreet(street);
        a.setStreetNo(streetNo);
        em.persist(a);
        l.setAddress(a);
        em.persist(l);
        
    }
    
     public boolean userExists(String username, String password) {

        Query query = em.createQuery("SELECT u FROM Lecturer AS u WHERE u.username = '" + username + "'", Lecturer.class);
        Lecturer st = (Lecturer) query.getSingleResult();
        if (st.getPassword().equals(password)) {
        
            return true;

        } else {
         
            return false;
        }
    }
  
   public Lecturer getLecturer(String username) {
        Query query = em.createQuery("SELECT u FROM Lecturer AS u WHERE u.username = '" + username + "'", Lecturer.class);
        //  System.out.println("management " + query.getSingleResult().toString());
        Lecturer st = (Lecturer) query.getSingleResult();

        return st;
    }
   
   public Vector<Course> getLecturerCourses(Long lecturerId){
      // 
    String sQuery = "Select p FROM Course AS p  "
                + "WHERE p.lecturer = :lecturerId";
        //StudentCourse sc=em.find(StudentCourse.class, lecturerId);
        Query query = em.createQuery(sQuery);
        Lecturer l =em.find(Lecturer.class, lecturerId);
        query.setParameter("lecturerId", l);
    
        return (Vector<Course>) query.getResultList();
   }
   
   public Vector<Lecturer> getAllLecturers() {
        Query query = em.createQuery("SELECT tl FROM Lecturer tl", Lecturer.class);
        return (Vector<Lecturer>) query.getResultList();
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public void persist(Object object) {
        em.persist(object);
    }
}
