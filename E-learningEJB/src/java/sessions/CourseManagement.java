/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessions;

import domain.Course;
import domain.Lecturer;
import domain.Material;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
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
public class CourseManagement implements CourseManagementLocal {

    @PersistenceContext(unitName = "E-learningEJBPU")
    private EntityManager em;

//    @Override
//    public void addCourse(String name, int duration, int noOfStudents, String description, String finalExaminationType) {
//        Course course = new Course();
//        course.setDuration(duration);
//        course.setName(name);
//        course.setNoOfStudents(noOfStudents);
//        course.setDescription(description);
//        course.setFinalExaminationType(finalExaminationType);
//        // Lecturer lecturer = em.find(Lecturer.class, lecturerId);
//        //  course.setLecturer(lecturer);
//
//        em.persist(course);
//    }
    


      @Override
    public void addCourse(String name, int duration, int noOfStudents, String description, String finalExaminationType, String startTime, String endTime) {
        Course course = new Course();
        course.setDuration(duration);
        course.setName(name);
        course.setNoOfStudents(noOfStudents);
        course.setDescription(description);
        course.setFinalExaminationType(finalExaminationType);
        
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.US);
        LocalDate startTim = LocalDate.parse(startTime, formatter);
        LocalDate endTim = LocalDate.parse(endTime, formatter);
        
        course.setStartDate(startTim);
        course.setEndDate(endTim);
        // Lecturer lecturer = em.find(Lecturer.class, lecturerId);
        //  course.setLecturer(lecturer);

        em.persist(course);
    }
    
    public void assignCoursetoLecturer(Long courseId, Long lecturerId) {

        String sQuery = "UPDATE Course p SET p.lecturer = :cookieUUID "
                + "WHERE p.id = :userID";
        Lecturer lecturer = em.find(Lecturer.class, lecturerId);
        Query query = em.createQuery(sQuery);
        query.setParameter("cookieUUID", lecturer);
        query.setParameter("userID", courseId);
        query.executeUpdate();
    }

    public Course getCourse(Long id) {
        Query query = em.createQuery("SELECT u FROM Course AS u WHERE u.id = '" + id + "'", Course.class);
        //  System.out.println("management " + query.getSingleResult().toString());
        Course course = (Course) query.getSingleResult();

        return course;
    }

    public void deleteCourse(Long id) {
        Course course = em.find(Course.class, id);

        em.remove(course);

    }
 public LocalDate getlDate(String t) {
        
        DateTimeFormatter formatterX
                = DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.US);
        LocalDate localDate = LocalDate.parse(t, formatterX);
        return localDate;
    }
    public void editCourse(String name, int duration, String description, String finalexaminationtype, Long id, String startTime, String endTime) {
        String sQuery = "UPDATE Course p SET p.description = :description, p.duration= :duration, p.name = :name, p.finalExaminationType = :finalexaminationtype, p.startDate = :startDate, p.endDate = :endDate "
                + "WHERE p.id = :courseID";
        //StudentCourse sc=em.find(StudentCourse.class, lecturerId);
        Query query = em.createQuery(sQuery);
        query.setParameter("description", description);
        query.setParameter("courseID", id);
        query.setParameter("duration", duration);
        query.setParameter("name", name);
        query.setParameter("finalexaminationtype", finalexaminationtype);
        LocalDate startDate=getlDate(startTime);
        LocalDate endDate=getlDate(endTime);
        
        query.setParameter("startDate", startDate);
        query.setParameter("endDate", endDate);

        query.executeUpdate();
    }

    public Vector<Course> getAllCourses() {
        Query query = em.createQuery("SELECT tl FROM Course tl", Course.class);
        return (Vector<Course>) query.getResultList();
    }

    public Vector<Course> getAllCoursesWithoutLecturer() {
        Query query = em.createQuery("SELECT tl FROM Course tl WHERE tl.lecturer is NULL", Course.class);
        return (Vector<Course>) query.getResultList();
    }

    public Vector<Course> getAllCoursesWithLecturer() {
        Query query = em.createQuery("SELECT tl FROM Course tl WHERE tl.lecturer is not NULL", Course.class);
        return (Vector<Course>) query.getResultList();
    }
    
    public void updateNoOfStudents(Long courseId, int noS){
    String sQuery = "UPDATE Course p SET p.noOfStudents = :cookieUUID "+
                 "WHERE p.id= :courseID";
 //StudentCourse sc=em.find(StudentCourse.class, lecturerId);
     Query query= em.createQuery(sQuery );
     query.setParameter("cookieUUID", noS);
     query.setParameter("courseID", courseId);
     
     query.executeUpdate();
    }
    
    public void addMaterial(Long courseId, String url, String name){
    Material m = new Material();
    Course c = em.find(Course.class, courseId);
    m.setCourse(c);
    m.setURLM(url);
    m.setName(name);
    em.persist(m);
    }
    
    public Vector<Material> getMaterialsByCourse(Long courseId){
    String sQuery = "Select p FROM Material AS p "
                + "WHERE p.course = :courseId";

        Query query = em.createQuery(sQuery);
       Course c= em.find(Course.class, courseId);
        query.setParameter("courseId", c);
        List<Material> m=query.getResultList();
        return (Vector<Material>)m;
    
    }

    public void persist(Object object) {
        em.persist(object);
    }
}
