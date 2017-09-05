
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gradeExam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gradeExam"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="examId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="studentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="grade" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gradeExam", propOrder = {
    "examId",
    "studentId",
    "grade"
})
public class GradeExam {

    protected Long examId;
    protected Long studentId;
    protected double grade;

    /**
     * Gets the value of the examId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExamId() {
        return examId;
    }

    /**
     * Sets the value of the examId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExamId(Long value) {
        this.examId = value;
    }

    /**
     * Gets the value of the studentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStudentId() {
        return studentId;
    }

    /**
     * Sets the value of the studentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStudentId(Long value) {
        this.studentId = value;
    }

    /**
     * Gets the value of the grade property.
     * 
     */
    public double getGrade() {
        return grade;
    }

    /**
     * Sets the value of the grade property.
     * 
     */
    public void setGrade(double value) {
        this.grade = value;
    }

}
