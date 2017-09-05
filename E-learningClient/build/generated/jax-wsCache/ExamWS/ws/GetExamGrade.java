
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getExamGrade complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getExamGrade"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="examId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getExamGrade", propOrder = {
    "examId"
})
public class GetExamGrade {

    protected Long examId;

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

}
