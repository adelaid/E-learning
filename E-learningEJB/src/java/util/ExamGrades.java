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
public class ExamGrades implements Serializable {

    private Long examId;
    private Long studentId;
   

    public Long getExamId() {
        return examId;
    }

    public void setExamId(Long examId) {
        this.examId = examId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.examId);
        hash = 59 * hash + Objects.hashCode(this.studentId);
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
        final ExamGrades other = (ExamGrades) obj;
        if (!Objects.equals(this.examId, other.examId)) {
            return false;
        }
        if (!Objects.equals(this.studentId, other.studentId)) {
            return false;
        }
        return true;
    }

}
