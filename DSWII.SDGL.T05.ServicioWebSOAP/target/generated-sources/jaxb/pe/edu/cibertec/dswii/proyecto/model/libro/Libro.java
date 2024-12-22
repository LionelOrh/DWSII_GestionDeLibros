//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v4.0.5 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
//


package pe.edu.cibertec.dswii.proyecto.model.libro;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Libro complex type.</p>
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
 * 
 * <pre>{@code
 * <complexType name="Libro">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="isbn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="anioPublicacion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="editorialId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="idiomaId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="categoriaId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Libro", propOrder = {
    "id",
    "titulo",
    "isbn",
    "anioPublicacion",
    "editorialId",
    "idiomaId",
    "categoriaId"
})
public class Libro {

    protected int id;
    @XmlElement(required = true)
    protected String titulo;
    @XmlElement(required = true)
    protected String isbn;
    protected int anioPublicacion;
    protected int editorialId;
    protected int idiomaId;
    protected int categoriaId;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad titulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Define el valor de la propiedad titulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitulo(String value) {
        this.titulo = value;
    }

    /**
     * Obtiene el valor de la propiedad isbn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Define el valor de la propiedad isbn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsbn(String value) {
        this.isbn = value;
    }

    /**
     * Obtiene el valor de la propiedad anioPublicacion.
     * 
     */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    /**
     * Define el valor de la propiedad anioPublicacion.
     * 
     */
    public void setAnioPublicacion(int value) {
        this.anioPublicacion = value;
    }

    /**
     * Obtiene el valor de la propiedad editorialId.
     * 
     */
    public int getEditorialId() {
        return editorialId;
    }

    /**
     * Define el valor de la propiedad editorialId.
     * 
     */
    public void setEditorialId(int value) {
        this.editorialId = value;
    }

    /**
     * Obtiene el valor de la propiedad idiomaId.
     * 
     */
    public int getIdiomaId() {
        return idiomaId;
    }

    /**
     * Define el valor de la propiedad idiomaId.
     * 
     */
    public void setIdiomaId(int value) {
        this.idiomaId = value;
    }

    /**
     * Obtiene el valor de la propiedad categoriaId.
     * 
     */
    public int getCategoriaId() {
        return categoriaId;
    }

    /**
     * Define el valor de la propiedad categoriaId.
     * 
     */
    public void setCategoriaId(int value) {
        this.categoriaId = value;
    }

}
