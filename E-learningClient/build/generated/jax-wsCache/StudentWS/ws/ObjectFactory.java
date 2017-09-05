
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

    private final static QName _AddStudent_QNAME = new QName("http://ws/", "addStudent");
    private final static QName _ConfirmRegisterToCourse_QNAME = new QName("http://ws/", "confirmRegisterToCourse");
    private final static QName _GetAllStudentCourse_QNAME = new QName("http://ws/", "getAllStudentCourse");
    private final static QName _GetAllStudentCourseResponse_QNAME = new QName("http://ws/", "getAllStudentCourseResponse");
    private final static QName _GetAllStudents_QNAME = new QName("http://ws/", "getAllStudents");
    private final static QName _GetAllStudentsResponse_QNAME = new QName("http://ws/", "getAllStudentsResponse");
    private final static QName _GetCourseByStudent_QNAME = new QName("http://ws/", "getCourseByStudent");
    private final static QName _GetCourseByStudentResponse_QNAME = new QName("http://ws/", "getCourseByStudentResponse");
    private final static QName _GetStudent_QNAME = new QName("http://ws/", "getStudent");
    private final static QName _GetStudentResponse_QNAME = new QName("http://ws/", "getStudentResponse");
    private final static QName _RegisterToCourse_QNAME = new QName("http://ws/", "registerToCourse");
    private final static QName _UserExists_QNAME = new QName("http://ws/", "userExists");
    private final static QName _UserExistsResponse_QNAME = new QName("http://ws/", "userExistsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddStudent }
     * 
     */
    public AddStudent createAddStudent() {
        return new AddStudent();
    }

    /**
     * Create an instance of {@link ConfirmRegisterToCourse }
     * 
     */
    public ConfirmRegisterToCourse createConfirmRegisterToCourse() {
        return new ConfirmRegisterToCourse();
    }

    /**
     * Create an instance of {@link GetAllStudentCourse }
     * 
     */
    public GetAllStudentCourse createGetAllStudentCourse() {
        return new GetAllStudentCourse();
    }

    /**
     * Create an instance of {@link GetAllStudentCourseResponse }
     * 
     */
    public GetAllStudentCourseResponse createGetAllStudentCourseResponse() {
        return new GetAllStudentCourseResponse();
    }

    /**
     * Create an instance of {@link GetAllStudents }
     * 
     */
    public GetAllStudents createGetAllStudents() {
        return new GetAllStudents();
    }

    /**
     * Create an instance of {@link GetAllStudentsResponse }
     * 
     */
    public GetAllStudentsResponse createGetAllStudentsResponse() {
        return new GetAllStudentsResponse();
    }

    /**
     * Create an instance of {@link GetCourseByStudent }
     * 
     */
    public GetCourseByStudent createGetCourseByStudent() {
        return new GetCourseByStudent();
    }

    /**
     * Create an instance of {@link GetCourseByStudentResponse }
     * 
     */
    public GetCourseByStudentResponse createGetCourseByStudentResponse() {
        return new GetCourseByStudentResponse();
    }

    /**
     * Create an instance of {@link GetStudent }
     * 
     */
    public GetStudent createGetStudent() {
        return new GetStudent();
    }

    /**
     * Create an instance of {@link GetStudentResponse }
     * 
     */
    public GetStudentResponse createGetStudentResponse() {
        return new GetStudentResponse();
    }

    /**
     * Create an instance of {@link RegisterToCourse }
     * 
     */
    public RegisterToCourse createRegisterToCourse() {
        return new RegisterToCourse();
    }

    /**
     * Create an instance of {@link UserExists }
     * 
     */
    public UserExists createUserExists() {
        return new UserExists();
    }

    /**
     * Create an instance of {@link UserExistsResponse }
     * 
     */
    public UserExistsResponse createUserExistsResponse() {
        return new UserExistsResponse();
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link StudentCourse }
     * 
     */
    public StudentCourse createStudentCourse() {
        return new StudentCourse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "addStudent")
    public JAXBElement<AddStudent> createAddStudent(AddStudent value) {
        return new JAXBElement<AddStudent>(_AddStudent_QNAME, AddStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmRegisterToCourse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "confirmRegisterToCourse")
    public JAXBElement<ConfirmRegisterToCourse> createConfirmRegisterToCourse(ConfirmRegisterToCourse value) {
        return new JAXBElement<ConfirmRegisterToCourse>(_ConfirmRegisterToCourse_QNAME, ConfirmRegisterToCourse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllStudentCourse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAllStudentCourse")
    public JAXBElement<GetAllStudentCourse> createGetAllStudentCourse(GetAllStudentCourse value) {
        return new JAXBElement<GetAllStudentCourse>(_GetAllStudentCourse_QNAME, GetAllStudentCourse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllStudentCourseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAllStudentCourseResponse")
    public JAXBElement<GetAllStudentCourseResponse> createGetAllStudentCourseResponse(GetAllStudentCourseResponse value) {
        return new JAXBElement<GetAllStudentCourseResponse>(_GetAllStudentCourseResponse_QNAME, GetAllStudentCourseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllStudents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAllStudents")
    public JAXBElement<GetAllStudents> createGetAllStudents(GetAllStudents value) {
        return new JAXBElement<GetAllStudents>(_GetAllStudents_QNAME, GetAllStudents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllStudentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAllStudentsResponse")
    public JAXBElement<GetAllStudentsResponse> createGetAllStudentsResponse(GetAllStudentsResponse value) {
        return new JAXBElement<GetAllStudentsResponse>(_GetAllStudentsResponse_QNAME, GetAllStudentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCourseByStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCourseByStudent")
    public JAXBElement<GetCourseByStudent> createGetCourseByStudent(GetCourseByStudent value) {
        return new JAXBElement<GetCourseByStudent>(_GetCourseByStudent_QNAME, GetCourseByStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCourseByStudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCourseByStudentResponse")
    public JAXBElement<GetCourseByStudentResponse> createGetCourseByStudentResponse(GetCourseByStudentResponse value) {
        return new JAXBElement<GetCourseByStudentResponse>(_GetCourseByStudentResponse_QNAME, GetCourseByStudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getStudent")
    public JAXBElement<GetStudent> createGetStudent(GetStudent value) {
        return new JAXBElement<GetStudent>(_GetStudent_QNAME, GetStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getStudentResponse")
    public JAXBElement<GetStudentResponse> createGetStudentResponse(GetStudentResponse value) {
        return new JAXBElement<GetStudentResponse>(_GetStudentResponse_QNAME, GetStudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterToCourse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "registerToCourse")
    public JAXBElement<RegisterToCourse> createRegisterToCourse(RegisterToCourse value) {
        return new JAXBElement<RegisterToCourse>(_RegisterToCourse_QNAME, RegisterToCourse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserExists }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "userExists")
    public JAXBElement<UserExists> createUserExists(UserExists value) {
        return new JAXBElement<UserExists>(_UserExists_QNAME, UserExists.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserExistsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "userExistsResponse")
    public JAXBElement<UserExistsResponse> createUserExistsResponse(UserExistsResponse value) {
        return new JAXBElement<UserExistsResponse>(_UserExistsResponse_QNAME, UserExistsResponse.class, null, value);
    }

}
