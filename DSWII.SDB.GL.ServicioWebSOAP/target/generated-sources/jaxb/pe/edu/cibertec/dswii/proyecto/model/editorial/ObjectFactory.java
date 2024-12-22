//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v4.0.5 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
//


package pe.edu.cibertec.dswii.proyecto.model.editorial;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.edu.cibertec.dswii.proyecto.model.editorial package. 
 * <p>An ObjectFactory allows you to programmatically 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.edu.cibertec.dswii.proyecto.model.editorial
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetEditorialRequest }
     * 
     * @return
     *     the new instance of {@link GetEditorialRequest }
     */
    public GetEditorialRequest createGetEditorialRequest() {
        return new GetEditorialRequest();
    }

    /**
     * Create an instance of {@link GetEditorialResponse }
     * 
     * @return
     *     the new instance of {@link GetEditorialResponse }
     */
    public GetEditorialResponse createGetEditorialResponse() {
        return new GetEditorialResponse();
    }

    /**
     * Create an instance of {@link Editorial }
     * 
     * @return
     *     the new instance of {@link Editorial }
     */
    public Editorial createEditorial() {
        return new Editorial();
    }

    /**
     * Create an instance of {@link RegistrarEditorialRequest }
     * 
     * @return
     *     the new instance of {@link RegistrarEditorialRequest }
     */
    public RegistrarEditorialRequest createRegistrarEditorialRequest() {
        return new RegistrarEditorialRequest();
    }

    /**
     * Create an instance of {@link RegistrarEditorialResponse }
     * 
     * @return
     *     the new instance of {@link RegistrarEditorialResponse }
     */
    public RegistrarEditorialResponse createRegistrarEditorialResponse() {
        return new RegistrarEditorialResponse();
    }

}
