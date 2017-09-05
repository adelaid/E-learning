
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getLecturerCourses complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getLecturerCourses"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lecturerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLecturerCourses", propOrder = {
    "lecturerId"
})
public class GetLecturerCourses {

    protected Long lecturerId;

    /**
     * Gets the value of the lecturerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLecturerId() {
        return lecturerId;
    }

    /**
     * Sets the value of the lecturerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLecturerId(Long value) {
        this.lecturerId = value;
    }

}
