/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pe.edu.cibertec.dswii.proyecto.socketstream.servidor.transferencia;

import java.io.IOException;

/**
 *
 * @author lione
 */
public class ServidorTransferenciaMain {

     public static void main(String[] args) {
        
        try {
            ServidorTransferencia servidorTransferencia = new ServidorTransferencia(3000);
            servidorTransferencia.iniciarServidor();
            
        
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        
    }
}
