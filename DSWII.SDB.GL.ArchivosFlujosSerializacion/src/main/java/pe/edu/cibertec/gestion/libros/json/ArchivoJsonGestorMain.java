/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.gestion.libros.json;

import java.util.Date;
import pe.edu.cibertec.gestion.libros.model.Categoria;
import pe.edu.cibertec.gestion.libros.model.Editorial;
import pe.edu.cibertec.gestion.libros.model.Idioma;
import pe.edu.cibertec.gestion.libros.model.Libro;

public class ArchivoJsonGestorMain {

    public static void main(String[] args) {
        
        // Crear instancias de las clases
        Categoria categoria = new Categoria(1, "Ficción", "Libros de ficción", new Date(), new Date());
        Editorial editorial = new Editorial(1, "Editorial Planeta", "España", new Date(), new Date());
        Idioma idioma = new Idioma(1, "Español", new Date(), new Date());
        Libro libro = new Libro(1, "La sombra del viento", "978-84-03-90126-3", 2001, editorial, idioma, categoria, new Date(), new Date());

        // Rutas de los archivos JSON
        String rutaCategoria = "E:\\DSWII_PROYECTOS\\CATEGORIA\\categoria.json";
        String rutaEditorial = "E:\\DSWII_PROYECTOS\\EDITORIAL\\editorial.json";
        String rutaIdioma = "E:\\DSWII_PROYECTOS\\IDIOMA\\idioma.json";
        String rutaLibro = "E:\\DSWII_PROYECTOS\\LIBRO\\libro.json";

        // Crear el objeto para gestionar el archivo JSON
        ArchivoJsonGestor archivoJsonGestor = new ArchivoJsonGestor();

        // Escritura de los objetos en formato JSON
        archivoJsonGestor.escribirArchivo(rutaCategoria, categoria);
        archivoJsonGestor.escribirArchivo(rutaEditorial, editorial);
        archivoJsonGestor.escribirArchivo(rutaIdioma, idioma);
        archivoJsonGestor.escribirArchivo(rutaLibro, libro);

        // Lectura de los objetos desde los archivos JSON
        Categoria categoriaLeida = (Categoria) archivoJsonGestor.leerArchivo(rutaCategoria, categoria);
        Editorial editorialLeida = (Editorial) archivoJsonGestor.leerArchivo(rutaEditorial, editorial);
        Idioma idiomaLeido = (Idioma) archivoJsonGestor.leerArchivo(rutaIdioma, idioma);
        Libro libroLeido = (Libro) archivoJsonGestor.leerArchivo(rutaLibro, libro);

        // Mostrar los objetos leídos
        System.out.println("Contenido leído de categoria.json: " + categoriaLeida);
        System.out.println("Contenido leído de editorial.json: " + editorialLeida);
        System.out.println("Contenido leído de idioma.json: " + idiomaLeido);
        System.out.println("Contenido leído de libro.json: " + libroLeido);
    }
}