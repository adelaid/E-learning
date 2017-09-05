
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateNoOfStudents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateNoOfStudents"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="courseId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="noS" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateNoOfStudents", propOrder = {
    "courseId",
    "noS"
})
public class UpdateNoOfStudents {

    protected Long courseId;
    protected int noS;

    /**
     * Gets the value of the courseId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCourseId() {
        return courseId;
    }

    /**
     * Sets the value of the courseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCourseId(Long value) {
        this.courseId = value;
    }

    /**
     * Gets the value of the noS property.
     * 
     */
    public int getNoS() {
        return noS;
    }

    /**
     * Sets the value of the noS property.
     * 
     */
    public void setNoS(int value) {
        this.noS = value;
    }

}
