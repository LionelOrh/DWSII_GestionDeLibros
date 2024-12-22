//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v4.0.5 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
//


package pe.edu.cibertec.dswii.proyecto.model.libro;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.edu.cibertec.dswii.proyecto.model.libro package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.edu.cibertec.dswii.proyecto.model.libro
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetLibroRequest }
     * 
     * @return
     *     the new instance of {@link GetLibroRequest }
     */
    public GetLibroRequest createGetLibroRequest() {
        return new GetLibroRequest();
    }

    /**
     * Create an instance of {@link GetLibroResponse }
     * 
     * @return
     *     the new instance of {@link GetLibroResponse }
     */
    public GetLibroResponse createGetLibroResponse() {
        return new GetLibroResponse();
    }

    /**
     * Create an instance of {@link Libro }
     * 
     * @return
     *     the new instance of {@link Libro }
     */
    public Libro createLibro() {
        return new Libro();
    }

    /**
     * Create an instance of {@link RegistrarLibroRequest }
     * 
     * @return
     *     the new instance of {@link RegistrarLibroRequest }
     */
    public RegistrarLibroRequest createRegistrarLibroRequest() {
        return new RegistrarLibroRequest();
    }

    /**
     * Create an instance of {@link RegistrarLibroResponse }
     * 
     * @return
     *     the new instance of {@link RegistrarLibroResponse }
     */
    public RegistrarLibroResponse createRegistrarLibroResponse() {
        return new RegistrarLibroResponse();
    }

    /**
     * Create an instance of {@link EliminarLibroRequest }
     * 
     * @return
     *     the new instance of {@link EliminarLibroRequest }
     */
    public EliminarLibroRequest createEliminarLibroRequest() {
        return new EliminarLibroRequest();
    }

    /**
     * Create an instance of {@link EliminarLibroResponse }
     * 
     * @return
     *     the new instance of {@link EliminarLibroResponse }
     */
    public EliminarLibroResponse createEliminarLibroResponse() {
        return new EliminarLibroResponse();
    }

}
