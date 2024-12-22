/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.proyecto.socketstream.cliente.transferencia;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import pe.edu.cibertec.dswii.proyecto.socketstream.model.Libro;

/**
 *
 * @author lione
 */
public class ClienteTransferencia {
     private String host;
    private int puerto;

    public ClienteTransferencia(String host, int puerto) {
        this.host = host;
        this.puerto = puerto;
    }
    
    
    public void enviarTransferencia(Libro libro) throws IOException {
try (Socket socket = new Socket(this.host, this.puerto);
             ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream())) {

            // Enviar el objeto Libro
            outputStream.writeObject(libro);
            outputStream.flush();
            System.out.println("Libro enviado al servidor: " + libro.getTitulo());
            System.out.println("ISBM: " + libro.getIsbn());
            System.out.println("Año: " + libro.getAnioPublicacion());
            System.out.println("Editorial: " + libro.getEditorial().getNombre());
            System.out.println("Idioma: " + libro.getIdioma().getNombre());
            System.out.println("Categoria: " + libro.getCategoria().getNombre());
            
        } catch (IOException e) {
            System.err.println("Error al enviar el libro al servidor: " + e.getMessage());
            throw e;
        }
    
    }
}
