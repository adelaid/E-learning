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
public class ExamQuestionsId implements Serializable {
    private Long examId;
    private Long quesId;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.examId);
        hash = 71 * hash + Objects.hashCode(this.quesId);
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
        final ExamQuestionsId other = (ExamQuestionsId) obj;
        if (!Objects.equals(this.examId, other.examId)) {
            return false;
        }
        if (!Objects.equals(this.quesId, other.quesId)) {
            return false;
        }
        return true;
    }

    public Long getExamId() {
        return examId;
    }

    public void setExamId(Long examId) {
        this.examId = examId;
    }

    public Long getQuesId() {
        return quesId;
    }

    public void setQuesId(Long quesId) {
        this.quesId = quesId;
    }
    
    
}
