/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.gestion.libros.archivosserializados;

/**
 *
 * @author ADMIN
 */
import java.util.Date;
import pe.edu.cibertec.gestion.libros.model.Categoria;
import pe.edu.cibertec.gestion.libros.model.Editorial;
import pe.edu.cibertec.gestion.libros.model.Idioma;
import pe.edu.cibertec.gestion.libros.model.Libro;

public class ArchivoSerializadoGestorMain {
    public static void main(String[] args) {
        // Crear los objetos para probar la serialización

        // Crear objeto Editorial
        Editorial editorial = new Editorial(1, "Editorial Planeta", "España", new Date(), new Date());
        
        // Crear objeto Idioma
        Idioma idioma = new Idioma(1, "Español", new Date(), new Date());

        // Crear objeto Categoria
        Categoria categoria = new Categoria(1, "Ficción", "Libros de ficción", new Date(), new Date());

        // Crear objeto Libro
        Libro libro = new Libro(1, "La sombra del viento", "978-84-03-90126-3", 2001, editorial, idioma, categoria, new Date(), new Date());

        // Instancia del gestor
        ArchivoSerializadoGestor archivoSerializadoGestor = new ArchivoSerializadoGestor();

        // Serializar los objetos
        archivoSerializadoGestor.serializarArchivo("E:\\DSWII_PROYECTOS\\EDITORIAL", "editorial.dat", editorial);
        archivoSerializadoGestor.serializarArchivo("E:\\DSWII_PROYECTOS\\IDIOMA", "idioma.dat", idioma);
        archivoSerializadoGestor.serializarArchivo("E:\\DSWII_PROYECTOS\\CATEGORIA", "categoria.dat", categoria);
        archivoSerializadoGestor.serializarArchivo("E:\\DSWII_PROYECTOS\\LIBRO", "libro.dat", libro);

        System.out.println("Los archivos de datos se escribieron correctamente.");

        // Deserializar los objetos
        Editorial editorialLeida = (Editorial) archivoSerializadoGestor.deserializarArchivo("E:\\DSWII_PROYECTOS\\EDITORIAL\\editorial.dat");
        Idioma idiomaLeido = (Idioma) archivoSerializadoGestor.deserializarArchivo("E:\\DSWII_PROYECTOS\\IDIOMA\\idioma.dat");
        Categoria categoriaLeida = (Categoria) archivoSerializadoGestor.deserializarArchivo("E:\\DSWII_PROYECTOS\\CATEGORIA\\categoria.dat");
        Libro libroLeido = (Libro) archivoSerializadoGestor.deserializarArchivo("E:\\DSWII_PROYECTOS\\LIBRO\\libro.dat");

        // Mostrar los objetos deserializados
        System.out.println("------ Objeto Editorial Leído ------ ");
        System.out.println(editorialLeida);
        System.out.println("------ Objeto Idioma Leído ------ ");
        System.out.println(idiomaLeido);
        System.out.println("------ Objeto Categoria Leído ------ ");
        System.out.println(categoriaLeida);
        System.out.println("------ Objeto Libro Leído ------ ");
        System.out.println(libroLeido);
    }
}
