/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.proyecto.dswii_sdgl_t05_serviciowebsoap.ws.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.dswii.proyecto.model.editorial.Editorial;
import pe.edu.cibertec.dswii.proyecto.model.editorial.GetEditorialRequest;
import pe.edu.cibertec.dswii.proyecto.model.editorial.GetEditorialResponse;

/**
 *
 * @author lione
 */
@Endpoint
public class EditorialEndpoint {
    private static final String NAMESPACE_URI = "http://t05.u02.dswii.cibertec.edu.pe/editorial-service";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetEditorialRequest")
    @ResponsePayload
    public GetEditorialResponse getEditorial(@RequestPayload GetEditorialRequest request) {
        GetEditorialResponse response = new GetEditorialResponse();
        Editorial editorial = new Editorial();

        // Datos configurados manualmente
        editorial.setId(request.getId());
        editorial.setNombre("Alfaguara");
        editorial.setPais("España");

        response.setEditorial(editorial);
        return response;
    }
}
