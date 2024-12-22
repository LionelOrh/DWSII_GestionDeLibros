/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.proyecto.socketstream.cliente.mensaje;

import java.io.IOException;

/**
 *
 * @author lione
 */
public class ClienteMensajeMain {
    public static void main(String[] args) {
        //localhost = 127.0.0.1
        ClienteMensaje cliente = new ClienteMensaje("localhost", 2999);
        try {
            cliente.enviarMensaje("Hola");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
