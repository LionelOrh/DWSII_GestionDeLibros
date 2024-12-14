/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.proyecto.socketstream.servidor.mensaje;

import java.io.IOException;

/**
 *
 * @author lione
 */
public class ServidorMensajeMain {
    public static void main(String[] args) {
        ServidorMensaje miPrimerServidor;
        try {
            miPrimerServidor = new ServidorMensaje(2999);
            miPrimerServidor.iniciarServidor();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
