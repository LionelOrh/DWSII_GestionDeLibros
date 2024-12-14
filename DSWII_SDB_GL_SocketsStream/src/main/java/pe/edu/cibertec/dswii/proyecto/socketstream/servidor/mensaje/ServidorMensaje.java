/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.proyecto.socketstream.servidor.mensaje;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author lione
 */
public class ServidorMensaje {
    private int puerto;
    private boolean prendido;
    private ServerSocket socketServidor;

    public ServidorMensaje(int puerto) throws IOException {
        this.puerto = puerto;
        this.socketServidor = new ServerSocket(this.puerto);
        String mensaje = String.format("El servidor ha sido configurado en el puerto %d", this.puerto);
        System.out.println(mensaje);
    }

    public void iniciarServidor() {
        this.prendido = true;
        System.out.println("El servidor ha sido iniciado...");

        while (this.prendido) {
            try {
                //Aceptar la conexión
                Socket conexionEntrante = this.socketServidor.accept();

                //Procesar la conexión
                String hostCliente = conexionEntrante.getInetAddress().getHostName();
                System.out.println(String.format("Conexión desde: %s", hostCliente));

                InputStream flujoEntrada = conexionEntrante.getInputStream();
                InputStreamReader isr = new InputStreamReader(flujoEntrada);
                BufferedReader br = new BufferedReader(isr);

                String mensaje = br.readLine();
                System.out.println(String.format("Mensaje recibido: %s", mensaje));

                br.close();
                isr.close();
                flujoEntrada.close();
                conexionEntrante.close();

            } catch (IOException e) {
                e.printStackTrace();
                this.prendido = false;
            }
        }

    }
}
