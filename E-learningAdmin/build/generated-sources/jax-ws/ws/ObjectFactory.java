
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

    private final static QName _AddCourse_QNAME = new QName("http://ws/", "addCourse");
    private final static QName _AssignCoursetoLecturer_QNAME = new QName("http://ws/", "assignCoursetoLecturer");
    private final static QName _DeleteCourse_QNAME = new QName("http://ws/", "deleteCourse");
    private final static QName _EditCourse_QNAME = new QName("http://ws/", "editCourse");
    private final static QName _GetAllCourses_QNAME = new QName("http://ws/", "getAllCourses");
    private final static QName _GetAllCoursesResponse_QNAME = new QName("http://ws/", "getAllCoursesResponse");
    private final static QName _GetAllCoursesWithLecturer_QNAME = new QName("http://ws/", "getAllCoursesWithLecturer");
    private final static QName _GetAllCoursesWithLecturerResponse_QNAME = new QName("http://ws/", "getAllCoursesWithLecturerResponse");
    private final static QName _GetAllCoursesWithoutLecturer_QNAME = new QName("http://ws/", "getAllCoursesWithoutLecturer");
    private final static QName _GetAllCoursesWithoutLecturerResponse_QNAME = new QName("http://ws/", "getAllCoursesWithoutLecturerResponse");
    private final static QName _GetCourse_QNAME = new QName("http://ws/", "getCourse");
    private final static QName _GetCourseResponse_QNAME = new QName("http://ws/", "getCourseResponse");
    private final static QName _UpdateNoOfStudents_QNAME = new QName("http://ws/", "updateNoOfStudents");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddCourse }
     * 
     */
    public AddCourse createAddCourse() {
        return new AddCourse();
    }

    /**
     * Create an instance of {@link AssignCoursetoLecturer }
     * 
     */
    public AssignCoursetoLecturer createAssignCoursetoLecturer() {
        return new AssignCoursetoLecturer();
    }

    /**
     * Create an instance of {@link DeleteCourse }
     * 
     */
    public DeleteCourse createDeleteCourse() {
        return new DeleteCourse();
    }

    /**
     * Create an instance of {@link EditCourse }
     * 
     */
    public EditCourse createEditCourse() {
        return new EditCourse();
    }

    /**
     * Create an instance of {@link GetAllCourses }
     * 
     */
    public GetAllCourses createGetAllCourses() {
        return new GetAllCourses();
    }

    /**
     * Create an instance of {@link GetAllCoursesResponse }
     * 
     */
    public GetAllCoursesResponse createGetAllCoursesResponse() {
        return new GetAllCoursesResponse();
    }

    /**
     * Create an instance of {@link GetAllCoursesWithLecturer }
     * 
     */
    public GetAllCoursesWithLecturer createGetAllCoursesWithLecturer() {
        return new GetAllCoursesWithLecturer();
    }

    /**
     * Create an instance of {@link GetAllCoursesWithLecturerResponse }
     * 
     */
    public GetAllCoursesWithLecturerResponse createGetAllCoursesWithLecturerResponse() {
        return new GetAllCoursesWithLecturerResponse();
    }

    /**
     * Create an instance of {@link GetAllCoursesWithoutLecturer }
     * 
     */
    public GetAllCoursesWithoutLecturer createGetAllCoursesWithoutLecturer() {
        return new GetAllCoursesWithoutLecturer();
    }

    /**
     * Create an instance of {@link GetAllCoursesWithoutLecturerResponse }
     * 
     */
    public GetAllCoursesWithoutLecturerResponse createGetAllCoursesWithoutLecturerResponse() {
        return new GetAllCoursesWithoutLecturerResponse();
    }

    /**
     * Create an instance of {@link GetCourse }
     * 
     */
    public GetCourse createGetCourse() {
        return new GetCourse();
    }

    /**
     * Create an instance of {@link GetCourseResponse }
     * 
     */
    public GetCourseResponse createGetCourseResponse() {
        return new GetCourseResponse();
    }

    /**
     * Create an instance of {@link UpdateNoOfStudents }
     * 
     */
    public UpdateNoOfStudents createUpdateNoOfStudents() {
        return new UpdateNoOfStudents();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCourse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "addCourse")
    public JAXBElement<AddCourse> createAddCourse(AddCourse value) {
        return new JAXBElement<AddCourse>(_AddCourse_QNAME, AddCourse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignCoursetoLecturer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "assignCoursetoLecturer")
    public JAXBElement<AssignCoursetoLecturer> createAssignCoursetoLecturer(AssignCoursetoLecturer value) {
        return new JAXBElement<AssignCoursetoLecturer>(_AssignCoursetoLecturer_QNAME, AssignCoursetoLecturer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCourse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "deleteCourse")
    public JAXBElement<DeleteCourse> createDeleteCourse(DeleteCourse value) {
        return new JAXBElement<DeleteCourse>(_DeleteCourse_QNAME, DeleteCourse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditCourse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "editCourse")
    public JAXBElement<EditCourse> createEditCourse(EditCourse value) {
        return new JAXBElement<EditCourse>(_EditCourse_QNAME, EditCourse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCourses }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAllCourses")
    public JAXBElement<GetAllCourses> createGetAllCourses(GetAllCourses value) {
        return new JAXBElement<GetAllCourses>(_GetAllCourses_QNAME, GetAllCourses.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCoursesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAllCoursesResponse")
    public JAXBElement<GetAllCoursesResponse> createGetAllCoursesResponse(GetAllCoursesResponse value) {
        return new JAXBElement<GetAllCoursesResponse>(_GetAllCoursesResponse_QNAME, GetAllCoursesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCoursesWithLecturer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAllCoursesWithLecturer")
    public JAXBElement<GetAllCoursesWithLecturer> createGetAllCoursesWithLecturer(GetAllCoursesWithLecturer value) {
        return new JAXBElement<GetAllCoursesWithLecturer>(_GetAllCoursesWithLecturer_QNAME, GetAllCoursesWithLecturer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCoursesWithLecturerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAllCoursesWithLecturerResponse")
    public JAXBElement<GetAllCoursesWithLecturerResponse> createGetAllCoursesWithLecturerResponse(GetAllCoursesWithLecturerResponse value) {
        return new JAXBElement<GetAllCoursesWithLecturerResponse>(_GetAllCoursesWithLecturerResponse_QNAME, GetAllCoursesWithLecturerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCoursesWithoutLecturer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAllCoursesWithoutLecturer")
    public JAXBElement<GetAllCoursesWithoutLecturer> createGetAllCoursesWithoutLecturer(GetAllCoursesWithoutLecturer value) {
        return new JAXBElement<GetAllCoursesWithoutLecturer>(_GetAllCoursesWithoutLecturer_QNAME, GetAllCoursesWithoutLecturer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCoursesWithoutLecturerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAllCoursesWithoutLecturerResponse")
    public JAXBElement<GetAllCoursesWithoutLecturerResponse> createGetAllCoursesWithoutLecturerResponse(GetAllCoursesWithoutLecturerResponse value) {
        return new JAXBElement<GetAllCoursesWithoutLecturerResponse>(_GetAllCoursesWithoutLecturerResponse_QNAME, GetAllCoursesWithoutLecturerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCourse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCourse")
    public JAXBElement<GetCourse> createGetCourse(GetCourse value) {
        return new JAXBElement<GetCourse>(_GetCourse_QNAME, GetCourse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCourseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCourseResponse")
    public JAXBElement<GetCourseResponse> createGetCourseResponse(GetCourseResponse value) {
        return new JAXBElement<GetCourseResponse>(_GetCourseResponse_QNAME, GetCourseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateNoOfStudents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "updateNoOfStudents")
    public JAXBElement<UpdateNoOfStudents> createUpdateNoOfStudents(UpdateNoOfStudents value) {
        return new JAXBElement<UpdateNoOfStudents>(_UpdateNoOfStudents_QNAME, UpdateNoOfStudents.class, null, value);
    }

}
