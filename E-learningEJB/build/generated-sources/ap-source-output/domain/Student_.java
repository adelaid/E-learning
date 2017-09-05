package domain;

import domain.Address;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.4.v20160829-rNA", date="2017-08-25T13:55:18")
@StaticMetamodel(Student.class)
public class Student_ { 

    public static volatile SingularAttribute<Student, String> firstName;
    public static volatile SingularAttribute<Student, String> lastName;
    public static volatile SingularAttribute<Student, String> password;
    public static volatile SingularAttribute<Student, Address> address;
    public static volatile SingularAttribute<Student, Long> id;
    public static volatile SingularAttribute<Student, String> email;
    public static volatile SingularAttribute<Student, String> username;

}