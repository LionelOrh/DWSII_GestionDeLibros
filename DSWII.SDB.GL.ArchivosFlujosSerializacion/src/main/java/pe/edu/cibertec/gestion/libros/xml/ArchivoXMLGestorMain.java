/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.gestion.libros.xml;

import java.util.Date;
import pe.edu.cibertec.gestion.libros.model.Categoria;
import pe.edu.cibertec.gestion.libros.model.Editorial;
import pe.edu.cibertec.gestion.libros.model.Idioma;
import pe.edu.cibertec.gestion.libros.model.Libro;

/**
 *
 * @author SUITE
 */
public class ArchivoXMLGestorMain {

    public static void main(String[] args) {

        ArchivoXMLGestor archivoXMLGestor = new ArchivoXMLGestor();

        //------------------ ESCRITURA DE XML
        // 1. CATEGORIA
        Categoria categoria = new Categoria(1, "Ficción", "Libros de ficción", new Date(), new Date());

        String rutaCategoria = "E:\\DSWII_PROYECTOS\\CATEGORIA\\categoria.xml";
        archivoXMLGestor.escribirArchivo(rutaCategoria, categoria);
        System.out.println("El archivo XML de Categoria se escribió correctamente en... " + rutaCategoria);

        // 2. EDITORIAL
        Editorial editorial = new Editorial(1, "Editorial Planeta", "España", new Date(), new Date());

        String rutaEditorial = "E:\\DSWII_PROYECTOS\\EDITORIAL\\editorial.xml";
        archivoXMLGestor.escribirArchivo(rutaEditorial, editorial);
        System.out.println("El archivo XML de Editorial se escribió correctamente en... " + rutaEditorial);

        // 3. IDIOMA
        Idioma idioma = new Idioma(1, "Español", new Date(), new Date());


        String rutaIdioma = "E:\\DSWII_PROYECTOS\\IDIOMA\\idioma.xml";
        archivoXMLGestor.escribirArchivo(rutaIdioma, idioma);
        System.out.println("El archivo XML de Idioma se escribió correctamente en... " + rutaIdioma);

        // 4. LIBRO
        Libro libro = new Libro(1, "La sombra del viento", "978-84-03-90126-3", 2001, editorial, idioma, categoria, new Date(), new Date());

        String rutaLibro = "E:\\DSWII_PROYECTOS\\LIBRO\\libro.xml";
        archivoXMLGestor.escribirArchivo(rutaLibro, libro);
        System.out.println("El archivo XML de Libro se escribió correctamente en... " + rutaLibro);

        //------------------ LECTURA DE XML
        System.out.println("\n\n Inicio de Lectura de XML ..... ");

        // Leer Categoria
        Object categoriaObj = archivoXMLGestor.leerArchivo(rutaCategoria, Categoria.class);
        Categoria categoriaLeida = (Categoria) categoriaObj;
        System.out.println("Datos de la Categoria Leída: ");
        System.out.println("ID: " + categoriaLeida.getId());
        System.out.println("Nombre: " + categoriaLeida.getNombre());

        // Leer Editorial
        Object editorialObj = archivoXMLGestor.leerArchivo(rutaEditorial, Editorial.class);
        Editorial editorialLeida = (Editorial) editorialObj;
        System.out.println("\nDatos de la Editorial Leída: ");
        System.out.println("Datos de la Editorial Leída: " + editorial.getId());
        System.out.println("Nombre: " + editorialLeida.getNombre());

        // Leer Idioma
        Object idiomaObj = archivoXMLGestor.leerArchivo(rutaIdioma, Idioma.class);
        Idioma idiomaLeido = (Idioma) idiomaObj;
        System.out.println("\nDatos del Idioma Leído: ");
        System.out.println("ID: " + idiomaLeido.getId());
        System.out.println("Nombre: " + idiomaLeido.getNombre());

        // Leer Libro
        Object libroObj = archivoXMLGestor.leerArchivo(rutaLibro, Libro.class);
        Libro libroLeido = (Libro) libroObj;
        System.out.println("\nDatos del Libro Leído: ");
        System.out.println("ID: " + libroLeido.getId());
        System.out.println("Título: " + libroLeido.getTitulo());
        System.out.println("ISBN: " + libroLeido.getIsbn());

    }
}