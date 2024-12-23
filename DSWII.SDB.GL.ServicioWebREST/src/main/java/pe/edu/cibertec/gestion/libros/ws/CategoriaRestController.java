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
import pe.edu.cibertec.gestion.libros.model.Categoria;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaRestController {

    @GetMapping(value = "/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public Categoria getCategoriaJson() {
        return new Categoria(1, "Ficción", "Novelas y cuentos", new Date(), new Date());
    }

    @GetMapping(value = "/xml", produces = MediaType.APPLICATION_XML_VALUE)
    public Categoria getCategoriaXml() {
        return new Categoria(1, "Ficción", "Novelas y cuentos", new Date(), new Date());
    }

    @GetMapping(value = "/html", produces = MediaType.TEXT_HTML_VALUE)
    public String getCategoriaHtml() {
        Categoria categoria = new Categoria(1, "Ficción", "Novelas y cuentos", new Date(), new Date());
        String html = """
                <html>
                    <body>
                        <h1> Detalles de la Categoría </h1>
                        <p> <strong> Nombre: </strong>  #Nombre </p>
                        <p> <strong> Descripción: </strong>  #Descripcion </p>
                        <p> <strong> Fecha de Creación: </strong>  #FechaCreacion </p>
                    </body>
                </html>
                """;
        return html
                .replace("#Nombre", categoria.getNombre())
                .replace("#Descripcion", categoria.getDescripcion())
                .replace("#FechaCreacion", categoria.getFechaCreacion().toString());
    }
}