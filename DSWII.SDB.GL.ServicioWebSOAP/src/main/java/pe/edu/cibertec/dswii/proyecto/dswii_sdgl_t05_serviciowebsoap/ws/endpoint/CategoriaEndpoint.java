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
import pe.edu.cibertec.dswii.proyecto.model.categoria.GetCategoriaRequest;
import pe.edu.cibertec.dswii.proyecto.model.categoria.GetCategoriaResponse;

/**
 *
 * @author lione
 */
@Endpoint
public class CategoriaEndpoint {
    private static final String NAMESPACE_URI = "http://t05.u02.dswii.cibertec.edu.pe/categoria-service";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetCategoriaRequest")
    @ResponsePayload
    public GetCategoriaResponse getCategoria(@RequestPayload GetCategoriaRequest request) {
        GetCategoriaResponse response = new GetCategoriaResponse();
        Categoria categoria = new Categoria();

        // Datos configurados manualmente
        categoria.setId(request.getId());
        categoria.setNombre("Novela");
        categoria.setDescripcion("Libros de ficción narrativa");

        response.setCategoria(categoria);
        return response;
    }
}
