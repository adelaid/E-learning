/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import domain.Exam;
import domain.ExamGrades;
import domain.Question;
import java.util.Vector;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import sessions.ExamManagementLocal;

/**
 *
 * @author Ada
 */
@WebService(serviceName = "ExamWS")
@Stateless()
public class ExamWS {

    @EJB
    private ExamManagementLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "addExam")
    @Oneway
    public void addExam(@WebParam(name = "name") String name, @WebParam(name = "courseId") Long courseId, @WebParam(name = "duration") int duration, @WebParam(name = "startTime") String startTime, @WebParam(name = "endTime") String endTime) {
        ejbRef.addExam(name, courseId, duration, startTime, endTime);
    }

    @WebMethod(operationName = "addQuestion")
    @Oneway
    public void addQuestion(@WebParam(name = "question") String question, @WebParam(name = "answer") String answer, @WebParam(name = "courseId") Long courseId) {
        ejbRef.addQuestion(question, answer, courseId);
    }

    @WebMethod(operationName = "addQuestionToExam")
    @Oneway
    public void addQuestionToExam(@WebParam(name = "questionId") Long questionId, @WebParam(name = "examId") Long examId) {
        ejbRef.addQuestionToExam(questionId, examId);
    }

    @WebMethod(operationName = "getAllQuestions")
    public Vector<Question> getAllQuestions() {
        return ejbRef.getAllQuestions();
    }

    @WebMethod(operationName = "getExamsByCourse")
    public Vector<Exam> getExamsByCourse(@WebParam(name = "id") Long id) {
        return ejbRef.getExamsByCourse(id);
    }

    @WebMethod(operationName = "getQuestionsByExam")
    public Vector<Question> getQuestionsByExam(@WebParam(name = "examId") Long examId) {
        return ejbRef.getQuestionsByExam(examId);
    }

    @WebMethod(operationName = "gradeExam")
    @Oneway
    public void gradeExam(@WebParam(name = "examId") Long examId, @WebParam(name = "studentId") Long studentId, @WebParam(name = "grade") double grade) {
        ejbRef.gradeExam(examId, studentId, grade);
    }

    @WebMethod(operationName = "isExamTaken")
    public boolean isExamTaken(@WebParam(name = "examId") Long examId, @WebParam(name = "studentId") Long studentId) {
        return ejbRef.isExamTaken(examId, studentId);
    }
    
    @WebMethod(operationName="getExamGrade")
     public Vector<ExamGrades> getExamGrade(@WebParam(name="examId")Long examId){
     return ejbRef.getExamGrade(examId);
     }
}
