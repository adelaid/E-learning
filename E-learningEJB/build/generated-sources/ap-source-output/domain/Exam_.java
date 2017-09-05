package domain;

import domain.Course;
import domain.Student;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.4.v20160829-rNA", date="2017-08-25T13:55:18")
@StaticMetamodel(Exam.class)
public class Exam_ { 

    public static volatile SingularAttribute<Exam, Integer> duration;
    public static volatile SingularAttribute<Exam, Student> student;
    public static volatile SingularAttribute<Exam, Double> grade;
    public static volatile SingularAttribute<Exam, String> name;
    public static volatile SingularAttribute<Exam, Course> course;
    public static volatile SingularAttribute<Exam, LocalDateTime> startTime;
    public static volatile SingularAttribute<Exam, Long> id;
    public static volatile SingularAttribute<Exam, LocalDateTime> endTime;

}