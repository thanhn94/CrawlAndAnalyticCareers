//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.24 at 10:32:03 AM ICT 
//


package hieplh.jaxb.jobdetail;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the hieplh.jaxb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Jobs_QNAME = new QName("", "jobs");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: hieplh.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Jobs }
     * 
     */
    public Jobs createJobs() {
        return new Jobs();
    }

    /**
     * Create an instance of {@link Provinces }
     * 
     */
    public Provinces createProvinces() {
        return new Provinces();
    }

    /**
     * Create an instance of {@link Details }
     * 
     */
    public Details createDetails() {
        return new Details();
    }

    /**
     * Create an instance of {@link Careers }
     * 
     */
    public Careers createCareers() {
        return new Careers();
    }

    /**
     * Create an instance of {@link Job }
     * 
     */
    public Job createJob() {
        return new Job();
    }

    /**
     * Create an instance of {@link Province }
     * 
     */
    public Province createProvince() {
        return new Province();
    }

    /**
     * Create an instance of {@link Career }
     * 
     */
    public Career createCareer() {
        return new Career();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Jobs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "jobs")
    public JAXBElement<Jobs> createJobs(Jobs value) {
        return new JAXBElement<Jobs>(_Jobs_QNAME, Jobs.class, null, value);
    }

}