/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.gestion.libros.archivostexto;

/**
 *
 * @author ADMIN
 */
public class ArchivoTextoGestorMain {
    public static void main(String[] args) {
        ArchivoTextoGestor archivoTextoGestor = new ArchivoTextoGestor();

        // Escritura del Archivo de Texto para Editorial
        String contenidoEditorial = """
                                   Editorial{id=1, nombre='Editorial Planeta', pais='España', fechaCreacion='Sun Dec 22 17:33:28 PET 2024', fechaActualizacion='Sun Dec 22 17:33:28 PET 2024'}
                                   """;
        String rutaCarpetaEditorial = "E:\\DSWII_PROYECTOS\\EDITORIAL";
        String nombreArchivoEditorial = "editorial.txt";
        archivoTextoGestor.escribirArchivo(rutaCarpetaEditorial, nombreArchivoEditorial, contenidoEditorial);
        System.out.println("El archivo se escribió correctamente en... " + rutaCarpetaEditorial + " -> " + nombreArchivoEditorial);

        // Escritura del Archivo de Texto para Idioma
        String contenidoIdioma = """
                               Idioma{id=1, nombre='Español', codigo='ES', fechaCreacion='Sun Dec 22 17:33:28 PET 2024', fechaActualizacion='Sun Dec 22 17:33:28 PET 2024'}
                               """;
        String rutaCarpetaIdioma = "E:\\DSWII_PROYECTOS\\IDIOMA";
        String nombreArchivoIdioma = "idioma.txt";
        archivoTextoGestor.escribirArchivo(rutaCarpetaIdioma, nombreArchivoIdioma, contenidoIdioma);
        System.out.println("El archivo se escribió correctamente en... " + rutaCarpetaIdioma + " -> " + nombreArchivoIdioma);

        // Escritura del Archivo de Texto para Categoria
        String contenidoCategoria = """
                                   Categoria{id=1, nombre='Ficción', descripcion='Libros de ficción', fechaCreacion='Sun Dec 22 17:33:28 PET 2024', fechaActualizacion='Sun Dec 22 17:33:28 PET 2024'}
                                   """;
        String rutaCarpetaCategoria = "E:\\DSWII_PROYECTOS\\CATEGORIA";
        String nombreArchivoCategoria = "categoria.txt";
        archivoTextoGestor.escribirArchivo(rutaCarpetaCategoria, nombreArchivoCategoria, contenidoCategoria);
        System.out.println("El archivo se escribió correctamente en... " + rutaCarpetaCategoria + " -> " + nombreArchivoCategoria);

        // Escritura del Archivo de Texto para Libro
        String contenidoLibro = """
                               Libro{id=1, titulo='La sombra del viento', isbn='978-84-03-90126-3', anioPublicacion=2001, editorial='Editorial Planeta', idioma='Español', categoria='Ficción', fechaCreacion='Sun Dec 22 17:33:28 PET 2024', fechaActualizacion='Sun Dec 22 17:33:28 PET 2024'}
                               """;
        String rutaCarpetaLibro = "E:\\DSWII_PROYECTOS\\LIBRO";
        String nombreArchivoLibro = "libro.txt";
        archivoTextoGestor.escribirArchivo(rutaCarpetaLibro, nombreArchivoLibro, contenidoLibro);
        System.out.println("El archivo se escribió correctamente en... " + rutaCarpetaLibro + " -> " + nombreArchivoLibro);

        // Lectura de archivos de texto para cada clase
        String rutaArchivoEditorial = "E:\\DSWII_PROYECTOS\\EDITORIAL\\editorial.txt";
        String contenidoEditorialLeido = archivoTextoGestor.leerArchivoTexto(rutaArchivoEditorial);
        System.out.println("------ Contenido Editorial Leído ------ ");
        System.out.println(contenidoEditorialLeido);
        System.out.println("------ Fin del Contenido Editorial Leído ------ ");

        String rutaArchivoIdioma = "E:\\DSWII_PROYECTOS\\IDIOMA\\idioma.txt";
        String contenidoIdiomaLeido = archivoTextoGestor.leerArchivoTexto(rutaArchivoIdioma);
        System.out.println("------ Contenido Idioma Leído ------ ");
        System.out.println(contenidoIdiomaLeido);
        System.out.println("------ Fin del Contenido Idioma Leído ------ ");

        String rutaArchivoCategoria = "E:\\DSWII_PROYECTOS\\CATEGORIA\\categoria.txt";
        String contenidoCategoriaLeido = archivoTextoGestor.leerArchivoTexto(rutaArchivoCategoria);
        System.out.println("------ Contenido Categoria Leído ------ ");
        System.out.println(contenidoCategoriaLeido);
        System.out.println("------ Fin del Contenido Categoria Leído ------ ");

        String rutaArchivoLibro = "E:\\DSWII_PROYECTOS\\LIBRO\\libro.txt";
        String contenidoLibroLeido = archivoTextoGestor.leerArchivoTexto(rutaArchivoLibro);
        System.out.println("------ Contenido Libro Leído ------ ");
        System.out.println(contenidoLibroLeido);
        System.out.println("------ Fin del Contenido Libro Leído ------ ");
    }
}