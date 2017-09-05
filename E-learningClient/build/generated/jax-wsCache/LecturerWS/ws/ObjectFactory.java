
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

    private final static QName _AddLecturer_QNAME = new QName("http://ws/", "addLecturer");
    private final static QName _GetAllLecturers_QNAME = new QName("http://ws/", "getAllLecturers");
    private final static QName _GetAllLecturersResponse_QNAME = new QName("http://ws/", "getAllLecturersResponse");
    private final static QName _GetLecturer_QNAME = new QName("http://ws/", "getLecturer");
    private final static QName _GetLecturerCourses_QNAME = new QName("http://ws/", "getLecturerCourses");
    private final static QName _GetLecturerCoursesResponse_QNAME = new QName("http://ws/", "getLecturerCoursesResponse");
    private final static QName _GetLecturerResponse_QNAME = new QName("http://ws/", "getLecturerResponse");
    private final static QName _UserExists_QNAME = new QName("http://ws/", "userExists");
    private final static QName _UserExistsResponse_QNAME = new QName("http://ws/", "userExistsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddLecturer }
     * 
     */
    public AddLecturer createAddLecturer() {
        return new AddLecturer();
    }

    /**
     * Create an instance of {@link GetAllLecturers }
     * 
     */
    public GetAllLecturers createGetAllLecturers() {
        return new GetAllLecturers();
    }

    /**
     * Create an instance of {@link GetAllLecturersResponse }
     * 
     */
    public GetAllLecturersResponse createGetAllLecturersResponse() {
        return new GetAllLecturersResponse();
    }

    /**
     * Create an instance of {@link GetLecturer }
     * 
     */
    public GetLecturer createGetLecturer() {
        return new GetLecturer();
    }

    /**
     * Create an instance of {@link GetLecturerCourses }
     * 
     */
    public GetLecturerCourses createGetLecturerCourses() {
        return new GetLecturerCourses();
    }

    /**
     * Create an instance of {@link GetLecturerCoursesResponse }
     * 
     */
    public GetLecturerCoursesResponse createGetLecturerCoursesResponse() {
        return new GetLecturerCoursesResponse();
    }

    /**
     * Create an instance of {@link GetLecturerResponse }
     * 
     */
    public GetLecturerResponse createGetLecturerResponse() {
        return new GetLecturerResponse();
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
     * Create an instance of {@link Course }
     * 
     */
    public Course createCourse() {
        return new Course();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddLecturer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "addLecturer")
    public JAXBElement<AddLecturer> createAddLecturer(AddLecturer value) {
        return new JAXBElement<AddLecturer>(_AddLecturer_QNAME, AddLecturer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllLecturers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAllLecturers")
    public JAXBElement<GetAllLecturers> createGetAllLecturers(GetAllLecturers value) {
        return new JAXBElement<GetAllLecturers>(_GetAllLecturers_QNAME, GetAllLecturers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllLecturersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAllLecturersResponse")
    public JAXBElement<GetAllLecturersResponse> createGetAllLecturersResponse(GetAllLecturersResponse value) {
        return new JAXBElement<GetAllLecturersResponse>(_GetAllLecturersResponse_QNAME, GetAllLecturersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLecturer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getLecturer")
    public JAXBElement<GetLecturer> createGetLecturer(GetLecturer value) {
        return new JAXBElement<GetLecturer>(_GetLecturer_QNAME, GetLecturer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLecturerCourses }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getLecturerCourses")
    public JAXBElement<GetLecturerCourses> createGetLecturerCourses(GetLecturerCourses value) {
        return new JAXBElement<GetLecturerCourses>(_GetLecturerCourses_QNAME, GetLecturerCourses.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLecturerCoursesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getLecturerCoursesResponse")
    public JAXBElement<GetLecturerCoursesResponse> createGetLecturerCoursesResponse(GetLecturerCoursesResponse value) {
        return new JAXBElement<GetLecturerCoursesResponse>(_GetLecturerCoursesResponse_QNAME, GetLecturerCoursesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLecturerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getLecturerResponse")
    public JAXBElement<GetLecturerResponse> createGetLecturerResponse(GetLecturerResponse value) {
        return new JAXBElement<GetLecturerResponse>(_GetLecturerResponse_QNAME, GetLecturerResponse.class, null, value);
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
