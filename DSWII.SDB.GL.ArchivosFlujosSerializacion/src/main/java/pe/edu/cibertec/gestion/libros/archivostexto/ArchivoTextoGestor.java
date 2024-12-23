/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.gestion.libros.archivostexto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author SUITE
 */
public class ArchivoTextoGestor {

    /**
     * Método que permite escribir un archivo de texto plano
     * @param rutaCarpeta Carpeta en la cual se guarda el archivo
     * @param nombreArchivo Nombre que tendrá el archivo generado
     * @param contenido Es el texto que será escrito dentro del archivo
     * 
    */
    public void escribirArchivo(String rutaCarpeta, 
            String nombreArchivo, String contenido) {
        File archivoTexto = new File(rutaCarpeta, nombreArchivo);
        try (FileWriter escritorArchivo = new FileWriter(archivoTexto);
             BufferedWriter bufferEscritorioArchivo =  new BufferedWriter(escritorArchivo);) {
            bufferEscritorioArchivo.write(contenido);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Método que permite escribir un archivo de texto plano con objetos
     * @param rutaCarpeta Carpeta donde se guardará el archivo
     * @param nombreArchivo Nombre que tendrá el archivo generado
     * @param objeto El objeto a escribir en formato de texto
     */
    public void escribirArchivo(String rutaCarpeta, String nombreArchivo, Object objeto) {
        try {
            File archivoTexto = new File(rutaCarpeta, nombreArchivo);
            try (FileWriter escritorArchivo = new FileWriter(archivoTexto, true);
                 BufferedWriter bufferEscritorioArchivo = new BufferedWriter(escritorArchivo)) {
                bufferEscritorioArchivo.write(objeto.toString() + System.lineSeparator());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Método que permite leer un archivo de texto plano
     * @param rutaCompleta Ruta del sistema operativo donde se encuentra el archivo
     * @return el contenido leído desde el archivo
    */
    public String leerArchivoTexto(String rutaCompleta) {
        StringBuilder contenidoLeido = new StringBuilder();
        File archivoTexto = new File(rutaCompleta);
        if (archivoTexto.exists() && !archivoTexto.isDirectory()) {
            try (FileReader lectorArchivo = new FileReader(archivoTexto);
                 BufferedReader bufferLectorArchivo = new BufferedReader(lectorArchivo)) {
                String linea = "";
                while ((linea = bufferLectorArchivo.readLine()) != null) {
                    contenidoLeido.append(linea).append(System.lineSeparator());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            contenidoLeido.append("Archivo inexistente o inválido para lectura.");
        }
        return contenidoLeido.toString();
    }
}
