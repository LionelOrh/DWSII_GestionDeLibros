/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.proyecto.dswii_sdgl_t05_serviciowebsoap.ws;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

/**
 *
 * @author lione
 */
@EnableWs
@Configuration
public class WebServiceConfig {
    private static final String NAMESPACE_URI_LIBRO = "http://t05.u02.dswii.cibertec.edu.pe/libro-service";
    private static final String NAMESPACE_URI_CATEGORIA = "http://t05.u02.dswii.cibertec.edu.pe/categoria-service";
    private static final String NAMESPACE_URI_EDITORIAL = "http://t05.u02.dswii.cibertec.edu.pe/editorial-service";
    private static final String NAMESPACE_URI_IDIOMA = "http://t05.u02.dswii.cibertec.edu.pe/idioma-service";

    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, "/ws/*");
    }

    // Configuración para Libro
    /*
     * Representa el endpoint: http://localhost:8080/ws/libros.wsdl
     */
    @Bean(name = "libros")
    public DefaultWsdl11Definition defaultWsdl11DefinitionLibros(@Qualifier("libroSchema") XsdSchema libroSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("LibroPort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace(NAMESPACE_URI_LIBRO);
        wsdl11Definition.setSchema(libroSchema);
        return wsdl11Definition;
    }

    @Bean(name = "libroSchema")
    public XsdSchema libroSchema() {
        return new SimpleXsdSchema(new ClassPathResource("/xsd/libro-schema.xsd"));
    }

    // Configuración para Categoria
    /*
     * Representa el endpoint: http://localhost:8080/ws/categorias.wsdl
     */
    @Bean(name = "categorias")
    public DefaultWsdl11Definition defaultWsdl11DefinitionCategorias(@Qualifier("categoriaSchema") XsdSchema categoriaSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("CategoriaPort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace(NAMESPACE_URI_CATEGORIA);
        wsdl11Definition.setSchema(categoriaSchema);
        return wsdl11Definition;
    }

    @Bean(name = "categoriaSchema")
    public XsdSchema categoriaSchema() {
        return new SimpleXsdSchema(new ClassPathResource("/xsd/categoria-schema.xsd"));
    }

    // Configuración para Editorial
    /*
     * Representa el endpoint: http://localhost:8080/ws/editoriales.wsdl
     */
    @Bean(name = "editoriales")
    public DefaultWsdl11Definition defaultWsdl11DefinitionEditoriales(@Qualifier("editorialSchema") XsdSchema editorialSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("EditorialPort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace(NAMESPACE_URI_EDITORIAL);
        wsdl11Definition.setSchema(editorialSchema);
        return wsdl11Definition;
    }

    @Bean(name = "editorialSchema")
    public XsdSchema editorialSchema() {
        return new SimpleXsdSchema(new ClassPathResource("/xsd/editorial-schema.xsd"));
    }

    // Configuración para Idioma
    /*
     * Representa el endpoint: http://localhost:8080/ws/idiomas.wsdl
     */
    @Bean(name = "idiomas")
    public DefaultWsdl11Definition defaultWsdl11DefinitionIdiomas(@Qualifier("idiomaSchema") XsdSchema idiomaSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("IdiomaPort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace(NAMESPACE_URI_IDIOMA);
        wsdl11Definition.setSchema(idiomaSchema);
        return wsdl11Definition;
    }

    @Bean(name = "idiomaSchema")
    public XsdSchema idiomaSchema() {
        return new SimpleXsdSchema(new ClassPathResource("/xsd/idioma-schema.xsd"));
    }
}
