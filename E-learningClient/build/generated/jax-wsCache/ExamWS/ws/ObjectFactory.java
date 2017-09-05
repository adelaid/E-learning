
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddExam_QNAME = new QName("http://ws/", "addExam");
    private final static QName _AddQuestion_QNAME = new QName("http://ws/", "addQuestion");
    private final static QName _AddQuestionToExam_QNAME = new QName("http://ws/", "addQuestionToExam");
    private final static QName _GetAllQuestions_QNAME = new QName("http://ws/", "getAllQuestions");
    private final static QName _GetAllQuestionsResponse_QNAME = new QName("http://ws/", "getAllQuestionsResponse");
    private final static QName _GetExamGrade_QNAME = new QName("http://ws/", "getExamGrade");
    private final static QName _GetExamGradeResponse_QNAME = new QName("http://ws/", "getExamGradeResponse");
    private final static QName _GetExamsByCourse_QNAME = new QName("http://ws/", "getExamsByCourse");
    private final static QName _GetExamsByCourseResponse_QNAME = new QName("http://ws/", "getExamsByCourseResponse");
    private final static QName _GetQuestionsByExam_QNAME = new QName("http://ws/", "getQuestionsByExam");
    private final static QName _GetQuestionsByExamResponse_QNAME = new QName("http://ws/", "getQuestionsByExamResponse");
    private final static QName _GradeExam_QNAME = new QName("http://ws/", "gradeExam");
    private final static QName _IsExamTaken_QNAME = new QName("http://ws/", "isExamTaken");
    private final static QName _IsExamTakenResponse_QNAME = new QName("http://ws/", "isExamTakenResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddExam }
     * 
     */
    public AddExam createAddExam() {
        return new AddExam();
    }

    /**
     * Create an instance of {@link AddQuestion }
     * 
     */
    public AddQuestion createAddQuestion() {
        return new AddQuestion();
    }

    /**
     * Create an instance of {@link AddQuestionToExam }
     * 
     */
    public AddQuestionToExam createAddQuestionToExam() {
        return new AddQuestionToExam();
    }

    /**
     * Create an instance of {@link GetAllQuestions }
     * 
     */
    public GetAllQuestions createGetAllQuestions() {
        return new GetAllQuestions();
    }

    /**
     * Create an instance of {@link GetAllQuestionsResponse }
     * 
     */
    public GetAllQuestionsResponse createGetAllQuestionsResponse() {
        return new GetAllQuestionsResponse();
    }

    /**
     * Create an instance of {@link GetExamGrade }
     * 
     */
    public GetExamGrade createGetExamGrade() {
        return new GetExamGrade();
    }

    /**
     * Create an instance of {@link GetExamGradeResponse }
     * 
     */
    public GetExamGradeResponse createGetExamGradeResponse() {
        return new GetExamGradeResponse();
    }

    /**
     * Create an instance of {@link GetExamsByCourse }
     * 
     */
    public GetExamsByCourse createGetExamsByCourse() {
        return new GetExamsByCourse();
    }

    /**
     * Create an instance of {@link GetExamsByCourseResponse }
     * 
     */
    public GetExamsByCourseResponse createGetExamsByCourseResponse() {
        return new GetExamsByCourseResponse();
    }

    /**
     * Create an instance of {@link GetQuestionsByExam }
     * 
     */
    public GetQuestionsByExam createGetQuestionsByExam() {
        return new GetQuestionsByExam();
    }

    /**
     * Create an instance of {@link GetQuestionsByExamResponse }
     * 
     */
    public GetQuestionsByExamResponse createGetQuestionsByExamResponse() {
        return new GetQuestionsByExamResponse();
    }

    /**
     * Create an instance of {@link GradeExam }
     * 
     */
    public GradeExam createGradeExam() {
        return new GradeExam();
    }

    /**
     * Create an instance of {@link IsExamTaken }
     * 
     */
    public IsExamTaken createIsExamTaken() {
        return new IsExamTaken();
    }

    /**
     * Create an instance of {@link IsExamTakenResponse }
     * 
     */
    public IsExamTakenResponse createIsExamTakenResponse() {
        return new IsExamTakenResponse();
    }

    /**
     * Create an instance of {@link Question }
     * 
     */
    public Question createQuestion() {
        return new Question();
    }

    /**
     * Create an instance of {@link Course }
     * 
     */
    public Course createCourse() {
        return new Course();
    }

    /**
     * Create an instance of {@link Lecturer }
     * 
     */
    public Lecturer createLecturer() {
        return new Lecturer();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link ExamGrades }
     * 
     */
    public ExamGrades createExamGrades() {
        return new ExamGrades();
    }

    /**
     * Create an instance of {@link Exam }
     * 
     */
    public Exam createExam() {
        return new Exam();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddExam }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "addExam")
    public JAXBElement<AddExam> createAddExam(AddExam value) {
        return new JAXBElement<AddExam>(_AddExam_QNAME, AddExam.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddQuestion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "addQuestion")
    public JAXBElement<AddQuestion> createAddQuestion(AddQuestion value) {
        return new JAXBElement<AddQuestion>(_AddQuestion_QNAME, AddQuestion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddQuestionToExam }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "addQuestionToExam")
    public JAXBElement<AddQuestionToExam> createAddQuestionToExam(AddQuestionToExam value) {
        return new JAXBElement<AddQuestionToExam>(_AddQuestionToExam_QNAME, AddQuestionToExam.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllQuestions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAllQuestions")
    public JAXBElement<GetAllQuestions> createGetAllQuestions(GetAllQuestions value) {
        return new JAXBElement<GetAllQuestions>(_GetAllQuestions_QNAME, GetAllQuestions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllQuestionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAllQuestionsResponse")
    public JAXBElement<GetAllQuestionsResponse> createGetAllQuestionsResponse(GetAllQuestionsResponse value) {
        return new JAXBElement<GetAllQuestionsResponse>(_GetAllQuestionsResponse_QNAME, GetAllQuestionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExamGrade }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getExamGrade")
    public JAXBElement<GetExamGrade> createGetExamGrade(GetExamGrade value) {
        return new JAXBElement<GetExamGrade>(_GetExamGrade_QNAME, GetExamGrade.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExamGradeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getExamGradeResponse")
    public JAXBElement<GetExamGradeResponse> createGetExamGradeResponse(GetExamGradeResponse value) {
        return new JAXBElement<GetExamGradeResponse>(_GetExamGradeResponse_QNAME, GetExamGradeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExamsByCourse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getExamsByCourse")
    public JAXBElement<GetExamsByCourse> createGetExamsByCourse(GetExamsByCourse value) {
        return new JAXBElement<GetExamsByCourse>(_GetExamsByCourse_QNAME, GetExamsByCourse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExamsByCourseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getExamsByCourseResponse")
    public JAXBElement<GetExamsByCourseResponse> createGetExamsByCourseResponse(GetExamsByCourseResponse value) {
        return new JAXBElement<GetExamsByCourseResponse>(_GetExamsByCourseResponse_QNAME, GetExamsByCourseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQuestionsByExam }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getQuestionsByExam")
    public JAXBElement<GetQuestionsByExam> createGetQuestionsByExam(GetQuestionsByExam value) {
        return new JAXBElement<GetQuestionsByExam>(_GetQuestionsByExam_QNAME, GetQuestionsByExam.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQuestionsByExamResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getQuestionsByExamResponse")
    public JAXBElement<GetQuestionsByExamResponse> createGetQuestionsByExamResponse(GetQuestionsByExamResponse value) {
        return new JAXBElement<GetQuestionsByExamResponse>(_GetQuestionsByExamResponse_QNAME, GetQuestionsByExamResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GradeExam }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "gradeExam")
    public JAXBElement<GradeExam> createGradeExam(GradeExam value) {
        return new JAXBElement<GradeExam>(_GradeExam_QNAME, GradeExam.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsExamTaken }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "isExamTaken")
    public JAXBElement<IsExamTaken> createIsExamTaken(IsExamTaken value) {
        return new JAXBElement<IsExamTaken>(_IsExamTaken_QNAME, IsExamTaken.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsExamTakenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "isExamTakenResponse")
    public JAXBElement<IsExamTakenResponse> createIsExamTakenResponse(IsExamTakenResponse value) {
        return new JAXBElement<IsExamTakenResponse>(_IsExamTakenResponse_QNAME, IsExamTakenResponse.class, null, value);
    }

}
