/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;

import javax.persistence.Id;

/**
 *
 * @author Ada
 */
@Entity
public class StudentCourse implements Serializable {

    private static final long serialVersionUID = 1L;
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
    @Id
    private Long studentId;
    @Id
    private Long courseId;
    
    private String confirmed;

    public String getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(String confirmed) {
        this.confirmed = confirmed;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.studentId);
        hash = 23 * hash + Objects.hashCode(this.courseId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final StudentCourse other = (StudentCourse) obj;
        if (!Objects.equals(this.studentId, other.studentId)) {
            return false;
        }
        if (!Objects.equals(this.courseId, other.courseId)) {
            return false;
        }
        return true;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

   
    
}
