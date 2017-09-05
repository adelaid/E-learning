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
public class ExamQuestions implements Serializable {

    private static final long serialVersionUID = 1L;
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
    @Id
    private Long examId;
    
    @Id
    private Long quesId;

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.examId);
        hash = 47 * hash + Objects.hashCode(this.quesId);
        return hash;
    }

    @Override
    public String toString() {
        return "ExamQuestions{" + "examId=" + examId + ", quesId=" + quesId + '}';
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
        final ExamQuestions other = (ExamQuestions) obj;
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
