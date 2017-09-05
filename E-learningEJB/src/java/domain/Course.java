/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import util.LocDateAdapter;
import util.LocDateConverter;


/**
 *
 * @author Ada
 */
@Entity
public class Course implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private int noOfStudents;

    private int duration;

    private String description;

    private String finalExaminationType;
    
//    @Temporal(TemporalType.DATE)
//    @Convert(converter = LocDateConverter.class)
//    private LocalDate s;
//    
//@XmlJavaTypeAdapter(LocDateAdapter.class)
//    public LocalDate getTest() {
//        return test;
//    }
//
//    public void setTest(LocalDate test) {
//        this.test = test;
//    }
    @Temporal(TemporalType.DATE)
    @Convert(converter = LocDateConverter.class)
    private LocalDate startDate;
    
    @Temporal(TemporalType.DATE)
    @Convert(converter = LocDateConverter.class)
    private LocalDate endDate;

    @XmlJavaTypeAdapter(LocDateAdapter.class)
    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    @XmlJavaTypeAdapter(LocDateAdapter.class)
    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
    
   

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFinalExaminationType() {
        return finalExaminationType;
    }

    public void setFinalExaminationType(String finalExaminationType) {
        this.finalExaminationType = finalExaminationType;
    }

    @OneToOne
    private Lecturer lecturer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Course)) {
            return false;
        }
        Course other = (Course) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.Course[ id=" + id + " ]";
    }

}
