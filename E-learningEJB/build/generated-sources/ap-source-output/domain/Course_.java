package domain;

import domain.Lecturer;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.4.v20160829-rNA", date="2017-08-25T13:55:18")
@StaticMetamodel(Course.class)
public class Course_ { 

    public static volatile SingularAttribute<Course, Integer> duration;
    public static volatile SingularAttribute<Course, String> finalExaminationType;
    public static volatile SingularAttribute<Course, LocalDate> endDate;
    public static volatile SingularAttribute<Course, String> name;
    public static volatile SingularAttribute<Course, Integer> noOfStudents;
    public static volatile SingularAttribute<Course, String> description;
    public static volatile SingularAttribute<Course, Lecturer> lecturer;
    public static volatile SingularAttribute<Course, Long> id;
    public static volatile SingularAttribute<Course, LocalDate> startDate;

}