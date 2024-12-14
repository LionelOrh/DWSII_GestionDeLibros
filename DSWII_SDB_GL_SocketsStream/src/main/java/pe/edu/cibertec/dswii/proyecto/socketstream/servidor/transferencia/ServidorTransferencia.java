/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.proyecto.socketstream.servidor.transferencia;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import pe.edu.cibertec.dswii.proyecto.socketstream.model.Libro;

/**
 *
 * @author lione
 */
public class ServidorTransferencia {
   private int puerto;
    private boolean prendido;
    private ServerSocket socketServidor;

    public ServidorTransferencia(int puerto) throws IOException {
        this.puerto = puerto;
        this.socketServidor = new ServerSocket(this.puerto);
        System.out.printf("El servidor ha sido configurado en el puerto %d%n", this.puerto);
    }

    public void iniciarServidor() {
        this.prendido = true;
        System.out.println("El servidor ha sido iniciado...");

        while (this.prendido) {
            try (Socket conexionEntrante = this.socketServidor.accept();
                 ObjectInputStream entrada = new ObjectInputStream(conexionEntrante.getInputStream())) {

                // Leer el objeto enviado por el cliente
                Libro libro = (Libro) entrada.readObject();

                // Mostrar detalles del libro recibido
                System.out.println("Libro recibido:");
                System.out.println("    ID: " + libro.getId());
                System.out.println("    Título: " + libro.getTitulo());
                System.out.println("    ISBN: " + libro.getIsbn());
                System.out.println("    Año de Publicación: " + libro.getAnioPublicacion());
                if (libro.getEditorial() != null) {
                    System.out.println("    Editorial: " + libro.getEditorial().getNombre() +
                                       " (" + libro.getEditorial().getPais() + ")");
                }
                if (libro.getIdioma() != null) {
                    System.out.println("    Idioma: " + libro.getIdioma().getNombre() +
                                       " (" + libro.getIdioma().getCodigo() + ")");
                }
                if (libro.getCategoria() != null) {
                    System.out.println("    Categoría: " + libro.getCategoria().getNombre() +
                                       " - " + libro.getCategoria().getDescripcion());
                }
            } catch (IOException | ClassNotFoundException e) {
                System.err.println("Error al procesar el objeto recibido: " + e.getMessage());
                this.prendido = false;
            }
        }
    }
}
