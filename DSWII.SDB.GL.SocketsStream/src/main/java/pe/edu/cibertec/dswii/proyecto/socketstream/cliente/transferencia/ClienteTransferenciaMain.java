/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.proyecto.socketstream.cliente.transferencia;

import java.io.IOException;
import java.util.Date;
import pe.edu.cibertec.dswii.proyecto.socketstream.model.Categoria;
import pe.edu.cibertec.dswii.proyecto.socketstream.model.Editorial;
import pe.edu.cibertec.dswii.proyecto.socketstream.model.Idioma;
import pe.edu.cibertec.dswii.proyecto.socketstream.model.Libro;

/**
 *
 * @author lione
 */
public class ClienteTransferenciaMain {
   public static void main(String[] args) {
        ClienteTransferencia clienteTransferencia = new ClienteTransferencia("localhost", 3000);

        // Crear un libro
        Libro libro = new Libro();
        libro.setId(1);
        libro.setTitulo("Don Quijote de la Mancha");
        libro.setIsbn("978-8491050245");
        libro.setAnioPublicacion(1605);
        libro.setFechaCreacion(new Date());
        libro.setFechaActualizacion(new Date());

        // Configurar Editorial
        Editorial editorial = new Editorial(1, "Editorial Alfaguara", "España", new Date(), new Date());
        libro.setEditorial(editorial);

        // Configurar Idioma
        Idioma idioma = new Idioma(1, "Español", "ES", new Date(), new Date());
        libro.setIdioma(idioma);

        // Configurar Categoría
        Categoria categoria = new Categoria(1, "Novela", "Clásicos de la literatura.", new Date(), new Date());
        libro.setCategoria(categoria);

        // Enviar el libro
        try {
            clienteTransferencia.enviarTransferencia(libro);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
