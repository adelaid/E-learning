/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessions;

import domain.Exam;
import domain.ExamGrades;
import domain.Question;
import java.util.Vector;
import javax.ejb.Local;

/**
 *
 * @author Ada
 */
@Local
public interface ExamManagementLocal {

    public void addExam(String name, Long courseId, int duration, String startTime, String endTime);

    public void addQuestion(String question, String answer, Long courseId);

    public void addQuestionToExam(Long questionId, Long examId);

    public Vector<Question> getAllQuestions();

    public Vector<Exam> getExamsByCourse(Long id);

    public Vector<Question> getQuestionsByExam(Long examId);

    public boolean isExamTaken(Long examId, Long studentId);
    
     public Vector<ExamGrades> getExamGrade(Long examId);

    public void gradeExam(Long examId, Long studentId, double grade);
}
