/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.gestion.libros.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author SUITE
 */
public class ArchivoJsonGestor {

    /**
     * Método que permite escribir un archivo JSON
     *
     * @param ruta Ruta del archivo donde se guardará el JSON
     * @param contenido Es el texto que será escrito dentro del archivo
     *
     */
    public void escribirArchivo(String ruta, Object contenido) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        // CONVERSIÓN DE OBJETO A JSON (String)
        String json = gson.toJson(contenido);
        FileWriter archivo = null;
        PrintWriter print = null;

        try {
            archivo = new FileWriter(ruta);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        print = new PrintWriter(archivo);
        print.print(json);
        print.close();
    }

    /**
     * Método que permite leer un archivo JSON
     *
     * @param ruta Ruta del archivo de donde se obtendrá el JSON
     * @param parametros parámetros de configuración para la lectura
     * @return objeto leído
     *
     */
    public Object leerArchivo(String ruta, Object... parametros) {
        Object objetoLeido = null;
        File refArchivo = new File(ruta);
        if (!refArchivo.exists()) {
            throw new RuntimeException("El archivo no existe en la ruta");
        }
        if (parametros == null || parametros.length == 0) {
            throw new RuntimeException("Se debe indicar los tipos de objeto soportados");
        }
        Object param = parametros[0];
        if (param == null) {
            throw new RuntimeException("El parámetro enviado es nulo");
        } else {
            Gson gson = new Gson();
            try {
                // CONVERSIÓN DE JSON A OBJETO
                objetoLeido = gson.fromJson(new FileReader(ruta), param.getClass());
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
        }
        return objetoLeido;
    }
}

