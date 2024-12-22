//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v4.0.5 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
//


package pe.edu.cibertec.dswii.proyecto.model.categoria;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.edu.cibertec.dswii.proyecto.model.categoria package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.edu.cibertec.dswii.proyecto.model.categoria
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCategoriaRequest }
     * 
     * @return
     *     the new instance of {@link GetCategoriaRequest }
     */
    public GetCategoriaRequest createGetCategoriaRequest() {
        return new GetCategoriaRequest();
    }

    /**
     * Create an instance of {@link GetCategoriaResponse }
     * 
     * @return
     *     the new instance of {@link GetCategoriaResponse }
     */
    public GetCategoriaResponse createGetCategoriaResponse() {
        return new GetCategoriaResponse();
    }

    /**
     * Create an instance of {@link Categoria }
     * 
     * @return
     *     the new instance of {@link Categoria }
     */
    public Categoria createCategoria() {
        return new Categoria();
    }

    /**
     * Create an instance of {@link RegistrarCategoriaRequest }
     * 
     * @return
     *     the new instance of {@link RegistrarCategoriaRequest }
     */
    public RegistrarCategoriaRequest createRegistrarCategoriaRequest() {
        return new RegistrarCategoriaRequest();
    }

    /**
     * Create an instance of {@link RegistrarCategoriaResponse }
     * 
     * @return
     *     the new instance of {@link RegistrarCategoriaResponse }
     */
    public RegistrarCategoriaResponse createRegistrarCategoriaResponse() {
        return new RegistrarCategoriaResponse();
    }

}
