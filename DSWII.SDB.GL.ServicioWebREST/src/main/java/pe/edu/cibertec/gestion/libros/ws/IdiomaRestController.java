/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.gestion.libros.ws;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;
import pe.edu.cibertec.gestion.libros.model.Idioma;

@RestController
@RequestMapping("/api/idiomas")
public class IdiomaRestController {

    @GetMapping(value = "/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public Idioma getIdiomaJson() {
        return new Idioma(1, "Español", new Date(), new Date());
    }

    @GetMapping(value = "/xml", produces = MediaType.APPLICATION_XML_VALUE)
    public Idioma getIdiomaXml() {
        return new Idioma(1, "Español", new Date(), new Date());
    }

    @GetMapping(value = "/html", produces = MediaType.TEXT_HTML_VALUE)
    public String getIdiomaHtml() {
        Idioma idioma = new Idioma(1, "Español", new Date(), new Date());
        String html = """
                <html>
                    <body>
                        <h1> Detalles del Idioma </h1>
                        <p> <strong> Nombre: </strong>  #Nombre </p>
                        <p> <strong> Fecha de Creación: </strong>  #FechaCreacion </p>
                    </body>
                </html>
                """;
        return html
                .replace("#Nombre", idioma.getNombre())
                .replace("#FechaCreacion", idioma.getFechaCreacion().toString());
    }
}