package pe.edu.cibertec.dswii.sdb.gl.hilosconcurrenciaparalelismo.manejoHilosLibros;

import pe.edu.cibertec.dswii.sdb.gl.hilosconcurrenciaparalelismo.entity.categoria;
import pe.edu.cibertec.dswii.sdb.gl.hilosconcurrenciaparalelismo.entity.editorial;
import pe.edu.cibertec.dswii.sdb.gl.hilosconcurrenciaparalelismo.entity.idioma;
import pe.edu.cibertec.dswii.sdb.gl.hilosconcurrenciaparalelismo.entity.libro;

public class tareaLibroMain {
    public static void main(String[] args) {
        // Crear objetos de idioma, categoría y editoriales con datos reales
        idioma idioma = new idioma("Español", "es"); // Idioma del libro
        categoria categoria = new categoria("Ficción", "Libros de ficción"); // Categoría del libro
        editorial editorial1 = new editorial("Penguin Random House", "Estados Unidos"); // Editorial del libro1
        editorial editorial2 = new editorial("HarperCollins", "Reino Unido"); // Editorial del libro2

        // Crear los libros con datos específicos
        libro libro1 = new libro("Cien Años de Soledad", "978-0307474728", 1967, editorial1, idioma, categoria); // Primer libro
        libro libro2 = new libro("Harry Potter y la Piedra Filosofal", "978-0747532743", 1997, editorial2, idioma, categoria); // Segundo libro

        // Crear y ejecutar el primer hilo para el libro1
        Thread hilo1 = new Thread(new tareaLibro(libro1)); // Asocia el libro1 a una tarea
        hilo1.start(); // Inicia la ejecución del hilo para el libro1
        
        try {
            hilo1.join();  // Espera a que el hilo1 termine antes de continuar con el siguiente
        } catch (InterruptedException e) {
            // Si el hilo1 es interrumpido, se muestra un mensaje de error
            System.out.println("Error al esperar el hilo1.");
        }

        // Crear y ejecutar el segundo hilo para el libro2
        Thread hilo2 = new Thread(new tareaLibro(libro2)); // Asocia el libro2 a una tarea
        hilo2.start(); // Inicia la ejecución del hilo para el libro2
        
        try {
            hilo2.join();  // Espera a que el hilo2 termine antes de continuar
        } catch (InterruptedException e) {
            // Si el hilo2 es interrumpido, se muestra un mensaje de error
            System.out.println("Error al esperar el hilo2.");
        }

        // Mensaje final indicando que todos los hilos han terminado
        System.out.println("Hilos de registro de libros terminados.");
    }
}
