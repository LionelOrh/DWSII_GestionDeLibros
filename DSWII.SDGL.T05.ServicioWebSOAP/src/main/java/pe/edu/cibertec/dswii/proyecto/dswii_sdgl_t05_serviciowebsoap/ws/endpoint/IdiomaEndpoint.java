/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.proyecto.dswii_sdgl_t05_serviciowebsoap.ws.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.dswii.proyecto.model.idioma.GetIdiomaRequest;
import pe.edu.cibertec.dswii.proyecto.model.idioma.GetIdiomaResponse;
import pe.edu.cibertec.dswii.proyecto.model.idioma.Idioma;

/**
 *
 * @author lione
 */
@Endpoint
public class IdiomaEndpoint {
    private static final String NAMESPACE_URI = "http://t05.u02.dswii.cibertec.edu.pe/idioma-service";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetIdiomaRequest")
    @ResponsePayload
    public GetIdiomaResponse getIdioma(@RequestPayload GetIdiomaRequest request) {
        GetIdiomaResponse response = new GetIdiomaResponse();
        Idioma idioma = new Idioma();

        // Datos configurados manualmente
        idioma.setId(request.getId());
        idioma.setNombre("Español");
        idioma.setCodigo("ES");

        response.setIdioma(idioma);
        return response;
    }
}
