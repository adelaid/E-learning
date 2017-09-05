package domain;

import domain.Address;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.4.v20160829-rNA", date="2017-08-25T13:55:18")
@StaticMetamodel(Lecturer.class)
public class Lecturer_ { 

    public static volatile SingularAttribute<Lecturer, String> firstName;
    public static volatile SingularAttribute<Lecturer, String> lastName;
    public static volatile SingularAttribute<Lecturer, String> password;
    public static volatile SingularAttribute<Lecturer, Address> address;
    public static volatile SingularAttribute<Lecturer, Long> id;
    public static volatile SingularAttribute<Lecturer, String> email;
    public static volatile SingularAttribute<Lecturer, String> username;

}