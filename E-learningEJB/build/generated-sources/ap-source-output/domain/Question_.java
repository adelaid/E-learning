package domain;

import domain.Course;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.4.v20160829-rNA", date="2017-08-25T13:55:18")
@StaticMetamodel(Question.class)
public class Question_ { 

    public static volatile SingularAttribute<Question, String> question;
    public static volatile SingularAttribute<Question, String> answer;
    public static volatile SingularAttribute<Question, Course> course;
    public static volatile SingularAttribute<Question, Long> id;

}