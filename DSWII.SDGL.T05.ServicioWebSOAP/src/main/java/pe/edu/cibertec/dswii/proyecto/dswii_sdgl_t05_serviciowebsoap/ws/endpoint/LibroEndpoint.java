/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.proyecto.dswii_sdgl_t05_serviciowebsoap.ws.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.dswii.proyecto.model.categoria.Categoria;
import pe.edu.cibertec.dswii.proyecto.model.editorial.Editorial;
import pe.edu.cibertec.dswii.proyecto.model.idioma.Idioma;
import pe.edu.cibertec.dswii.proyecto.model.libro.GetLibroRequest;
import pe.edu.cibertec.dswii.proyecto.model.libro.GetLibroResponse;
import pe.edu.cibertec.dswii.proyecto.model.libro.Libro;

/**
 *
 * @author lione
 */
@Endpoint
public class LibroEndpoint {

    private static final String NAMESPACE_URI = "http://t05.u02.dswii.cibertec.edu.pe/libro-service";

    // Método para manejar la solicitud GetLibroRequest
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetLibroRequest")
    @ResponsePayload
    public GetLibroResponse getLibro(@RequestPayload GetLibroRequest request) {
        GetLibroResponse response = new GetLibroResponse();
        Libro libro = new Libro();

        // Ejemplo de datos; aquí se podría hacer una consulta a la base de datos
        libro.setId(request.getId());
        libro.setTitulo("Cien Años de Soledad");
        libro.setIsbn("978-3-16-148410-0");
        libro.setAnioPublicacion(1967);
        libro.setEditorialId(1);
        libro.setIdiomaId(1);
        libro.setCategoriaId(1);

        response.setLibro(libro);
        return response;
    }

}
