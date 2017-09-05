/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Ada
 */
public class StudentCourseId implements Serializable {
    private Long studentId;
    private Long courseId;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.studentId);
        hash = 59 * hash + Objects.hashCode(this.courseId);
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
        final StudentCourseId other = (StudentCourseId) obj;
        if (!Objects.equals(this.studentId, other.studentId)) {
            return false;
        }
        if (!Objects.equals(this.courseId, other.courseId)) {
            return false;
        }
        return true;
    }
    
    
}
