
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for isExamTaken complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="isExamTaken"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="examId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="studentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "isExamTaken", propOrder = {
    "examId",
    "studentId"
})
public class IsExamTaken {

    protected Long examId;
    protected Long studentId;

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

}
