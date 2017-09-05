
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
@WebService(name = "ExamWS", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ExamWS {


    /**
     * 
     * @param studentId
     * @param examId
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "isExamTaken", targetNamespace = "http://ws/", className = "ws.IsExamTaken")
    @ResponseWrapper(localName = "isExamTakenResponse", targetNamespace = "http://ws/", className = "ws.IsExamTakenResponse")
    @Action(input = "http://ws/ExamWS/isExamTakenRequest", output = "http://ws/ExamWS/isExamTakenResponse")
    public boolean isExamTaken(
        @WebParam(name = "examId", targetNamespace = "")
        Long examId,
        @WebParam(name = "studentId", targetNamespace = "")
        Long studentId);

    /**
     * 
     * @param question
     * @param answer
     * @param courseId
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "addQuestion", targetNamespace = "http://ws/", className = "ws.AddQuestion")
    @Action(input = "http://ws/ExamWS/addQuestion")
    public void addQuestion(
        @WebParam(name = "question", targetNamespace = "")
        String question,
        @WebParam(name = "answer", targetNamespace = "")
        String answer,
        @WebParam(name = "courseId", targetNamespace = "")
        Long courseId);

    /**
     * 
     * @return
     *     returns java.util.List<ws.Question>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllQuestions", targetNamespace = "http://ws/", className = "ws.GetAllQuestions")
    @ResponseWrapper(localName = "getAllQuestionsResponse", targetNamespace = "http://ws/", className = "ws.GetAllQuestionsResponse")
    @Action(input = "http://ws/ExamWS/getAllQuestionsRequest", output = "http://ws/ExamWS/getAllQuestionsResponse")
    public List<Question> getAllQuestions();

    /**
     * 
     * @param id
     * @return
     *     returns java.util.List<ws.Exam>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getExamsByCourse", targetNamespace = "http://ws/", className = "ws.GetExamsByCourse")
    @ResponseWrapper(localName = "getExamsByCourseResponse", targetNamespace = "http://ws/", className = "ws.GetExamsByCourseResponse")
    @Action(input = "http://ws/ExamWS/getExamsByCourseRequest", output = "http://ws/ExamWS/getExamsByCourseResponse")
    public List<Exam> getExamsByCourse(
        @WebParam(name = "id", targetNamespace = "")
        Long id);

    /**
     * 
     * @param studentId
     * @param grade
     * @param examId
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "gradeExam", targetNamespace = "http://ws/", className = "ws.GradeExam")
    @Action(input = "http://ws/ExamWS/gradeExam")
    public void gradeExam(
        @WebParam(name = "examId", targetNamespace = "")
        Long examId,
        @WebParam(name = "studentId", targetNamespace = "")
        Long studentId,
        @WebParam(name = "grade", targetNamespace = "")
        double grade);

    /**
     * 
     * @param duration
     * @param name
     * @param startTime
     * @param endTime
     * @param courseId
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "addExam", targetNamespace = "http://ws/", className = "ws.AddExam")
    @Action(input = "http://ws/ExamWS/addExam")
    public void addExam(
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "courseId", targetNamespace = "")
        Long courseId,
        @WebParam(name = "duration", targetNamespace = "")
        int duration,
        @WebParam(name = "startTime", targetNamespace = "")
        String startTime,
        @WebParam(name = "endTime", targetNamespace = "")
        String endTime);

    /**
     * 
     * @param examId
     * @return
     *     returns java.util.List<ws.Question>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getQuestionsByExam", targetNamespace = "http://ws/", className = "ws.GetQuestionsByExam")
    @ResponseWrapper(localName = "getQuestionsByExamResponse", targetNamespace = "http://ws/", className = "ws.GetQuestionsByExamResponse")
    @Action(input = "http://ws/ExamWS/getQuestionsByExamRequest", output = "http://ws/ExamWS/getQuestionsByExamResponse")
    public List<Question> getQuestionsByExam(
        @WebParam(name = "examId", targetNamespace = "")
        Long examId);

    /**
     * 
     * @param questionId
     * @param examId
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "addQuestionToExam", targetNamespace = "http://ws/", className = "ws.AddQuestionToExam")
    @Action(input = "http://ws/ExamWS/addQuestionToExam")
    public void addQuestionToExam(
        @WebParam(name = "questionId", targetNamespace = "")
        Long questionId,
        @WebParam(name = "examId", targetNamespace = "")
        Long examId);

    /**
     * 
     * @param examId
     * @return
     *     returns java.util.List<ws.ExamGrades>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getExamGrade", targetNamespace = "http://ws/", className = "ws.GetExamGrade")
    @ResponseWrapper(localName = "getExamGradeResponse", targetNamespace = "http://ws/", className = "ws.GetExamGradeResponse")
    @Action(input = "http://ws/ExamWS/getExamGradeRequest", output = "http://ws/ExamWS/getExamGradeResponse")
    public List<ExamGrades> getExamGrade(
        @WebParam(name = "examId", targetNamespace = "")
        Long examId);

}