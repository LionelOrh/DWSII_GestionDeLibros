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
import pe.edu.cibertec.gestion.libros.model.Editorial;
import pe.edu.cibertec.gestion.libros.model.Idioma;
import pe.edu.cibertec.gestion.libros.model.Libro;

@RestController
@RequestMapping("/api/libros")
public class LibroRestController {

    @GetMapping(value = "/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public Libro getLibroJson() {
        Editorial editorial = new Editorial(1, "Editorial ABC", "Perú", new Date(), new Date());
        Idioma idioma = new Idioma(1, "Español", new Date(), new Date());
        Categoria categoria = new Categoria(1, "Ficción", "Novelas y cuentos", new Date(), new Date());

        return new Libro(1, "El Gran Libro", "978-3-16-148410-0", 2024, editorial, idioma, categoria, new Date(), new Date());
    }

    @GetMapping(value = "/xml", produces = MediaType.APPLICATION_XML_VALUE)
    public Libro getLibroXml() {
        Editorial editorial = new Editorial(1, "Editorial ABC", "Perú", new Date(), new Date());
        Idioma idioma = new Idioma(1, "Español", new Date(), new Date());
        Categoria categoria = new Categoria(1, "Ficción", "Novelas y cuentos", new Date(), new Date());

        return new Libro(1, "El Gran Libro", "978-3-16-148410-0", 2024, editorial, idioma, categoria, new Date(), new Date());
    }

    @GetMapping(value = "/html", produces = MediaType.TEXT_HTML_VALUE)
    public String getLibroHtml() {
        Editorial editorial = new Editorial(1, "Editorial ABC", "Perú", new Date(), new Date());
        Idioma idioma = new Idioma(1, "Español", new Date(), new Date());
        Categoria categoria = new Categoria(1, "Ficción", "Novelas y cuentos", new Date(), new Date());

        Libro libro = new Libro(1, "El Gran Libro", "978-3-16-148410-0", 2024, editorial, idioma, categoria, new Date(), new Date());

        String html = """
                <html>
                    <body>
                        <h1> Detalles del Libro </h1>
                        <p> <strong> Título: </strong>  #Titulo </p>
                        <p> <strong> ISBN: </strong>  #Isbn </p>
                        <p> <strong> Año de Publicación: </strong>  #AnioPublicacion </p>
                        <p> <strong> Editorial: </strong>  #Editorial </p>
                        <p> <strong> Idioma: </strong>  #Idioma </p>
                        <p> <strong> Categoría: </strong>  #Categoria </p>
                        <p> <strong> Fecha de Creación: </strong>  #FechaCreacion </p>
                    </body>
                </html>
                """;
        return html
                .replace("#Titulo", libro.getTitulo())
                .replace("#Isbn", libro.getIsbn())
                .replace("#AnioPublicacion", String.valueOf(libro.getAnioPublicacion()))
                .replace("#Editorial", libro.getEditorial().getNombre())
                .replace("#Idioma", libro.getIdioma().getNombre())
                .replace("#Categoria", libro.getCategoria().getNombre())
                .replace("#FechaCreacion", libro.getFechaCreacion().toString());
    }
}