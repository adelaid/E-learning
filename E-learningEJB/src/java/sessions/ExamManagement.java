/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessions;

import domain.Course;
import domain.Exam;
import domain.ExamGrades;
import domain.ExamQuestions;
import domain.Question;
import domain.Student;
import domain.StudentCourse;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
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
public class ExamManagement implements ExamManagementLocal {

    @PersistenceContext(unitName = "E-learningEJBPU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }

    public void addExam(String name, Long courseId, int duration, String startTime, String endTime) {
        Exam e = new Exam();
        e.setName(name);
        Course c = em.find(Course.class, courseId);
        e.setCourse(c);
        e.setDuration(duration);
        DateTimeFormatter formatterX
                = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss", Locale.US);
        LocalDateTime startTim = LocalDateTime.parse(startTime, formatterX);
        LocalDateTime endTim = LocalDateTime.parse(endTime, formatterX);
        e.setStartTime(startTim);
        e.setEndTime(endTim);
        em.persist(e);
    }

    public Vector<Exam> getExamsByCourse(Long id) {
        Course c = em.find(Course.class, id);
// Query query = em.createQuery("SELECT tl FROM Exam AS tl WHERE tl.course = '" + c + "'", Exam.class);
        //  Query query = em.createQuery("SELECT u FROM Lecturer AS u WHERE u.username = '" + username + "'", Lecturer.class);

        String sQuery = "Select p FROM Exam AS p  "
                + "WHERE p.course = :courseId";
        //StudentCourse sc=em.find(StudentCourse.class, lecturerId);
        Query query = em.createQuery(sQuery);
        // Lecturer l =em.find(Lecturer.class, lecturerId);
        query.setParameter("courseId", c);

        // return (Vector<Course>) query.getResultList();
        return (Vector<Exam>) query.getResultList();
    }

    public void addQuestion(String question, String answer, Long courseId) {
        Course c = em.find(Course.class, courseId);
        Question q = new Question();
        q.setQuestion(question);
        q.setAnswer(answer);
        q.setCourse(c);
        em.persist(q);
    }

    public void addQuestionToExam(Long questionId, Long examId) {
//    Exam e=em.find(Exam.class, examId);
//    Question q =em.find(Question.class, questionId);
        ExamQuestions eq = new ExamQuestions();
        eq.setExamId(examId);
        eq.setQuesId(questionId);
        em.persist(eq);
    }

    public Vector<Question> getAllQuestions() {

        Query query = em.createQuery("SELECT tl FROM Question tl", Question.class);
        return (Vector<Question>) query.getResultList();
    }

    public Vector<Question> getQuestionsByExam(Long examId) {
        String sQuery = "Select p FROM ExamQuestions AS p  "
                + "WHERE p.examId = :examId";
        //StudentCourse sc=em.find(StudentCourse.class, lecturerId);
        Query query = em.createQuery(sQuery);
        // Lecturer l =em.find(Lecturer.class, lecturerId);
        query.setParameter("examId", examId);

        // return (Vector<Course>) query.getResultList();
        List<Question> qs = new Vector<Question>();
        List<ExamQuestions> eqs = (Vector<ExamQuestions>) query.getResultList();
        for (ExamQuestions eq : eqs) {
            Question q = em.find(Question.class, eq.getQuesId());
            qs.add(q);
        }
        return (Vector<Question>) qs;
    }

    public void gradeExam(Long examId, Long studentId, double grade) {
        ExamGrades eg = new ExamGrades();
        eg.setExamId(examId);
        eg.setStudentId(studentId);
        eg.setGrade(grade);
        em.persist(eg);

    }
    
    public Vector<ExamGrades> getExamGrade(Long examId){
      String sQuery = "Select p FROM ExamGrades AS p "
                + "WHERE p.examId = :examId ";
       Query query = em.createQuery(sQuery);
     
        query.setParameter("examId", examId);
        return (Vector<ExamGrades>)query.getResultList();
    }

    public boolean isExamTaken(Long examId, Long studentId) {
        String sQuery = "Select p FROM ExamGrades AS p "
                + "WHERE p.examId = :examId and p.studentId= :studentId";

        Query query = em.createQuery(sQuery);
        query.setParameter("studentId", studentId);
        query.setParameter("examId", examId);
        //   Query query = em.createQuery("SELECT u FROM ExamGrades AS u WHERE u.examId = '" + username + "'", Student.class);
        List l =query.getResultList();
        if(l.size()!=0){ //s a dat examenul
            System.out.println("S-a dat exam");
           return true;
        }
        else{
            System.out.println("Nu s-a dat exam");
          return false;
        }
//        ExamGrades eg = (ExamGrades) query.getSingleResult();
//        if (eg.equals(null)) {
//            System.out.println("false");
//            return false;
//        } else {
//             System.out.println("true");
//            return true;
//        }
    
    }

    public Exam getExam(Long id) {
        Exam e = em.find(Exam.class, id);

        return e;

    }
}
