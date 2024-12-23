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
import pe.edu.cibertec.gestion.libros.model.Editorial;

@RestController
@RequestMapping("/api/editoriales")
public class EditorialRestController {

    @GetMapping(value = "/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public Editorial getEditorialJson() {
        return new Editorial(1, "Editorial ABC", "Perú", new Date(), new Date());
    }

    @GetMapping(value = "/xml", produces = MediaType.APPLICATION_XML_VALUE)
    public Editorial getEditorialXml() {
        return new Editorial(1, "Editorial ABC", "Perú", new Date(), new Date());
    }

    @GetMapping(value = "/html", produces = MediaType.TEXT_HTML_VALUE)
    public String getEditorialHtml() {
        Editorial editorial = new Editorial(1, "Editorial ABC", "Perú", new Date(), new Date());
        String html = """
                <html>
                    <body>
                        <h1> Detalles de la Editorial </h1>
                        <p> <strong> Nombre: </strong>  #Nombre </p>
                        <p> <strong> País: </strong>  #Pais </p>
                        <p> <strong> Fecha de Creación: </strong>  #FechaCreacion </p>
                    </body>
                </html>
                """;
        return html
                .replace("#Nombre", editorial.getNombre())
                .replace("#Pais", editorial.getPais())
                .replace("#FechaCreacion", editorial.getFechaCreacion().toString());
    }
}