package pe.edu.cibertec.dswii.sdb.gl.hilosconcurrenciaparalelismo.crecionHilosLibros;

import pe.edu.cibertec.dswii.sdb.gl.hilosconcurrenciaparalelismo.entity.libro;
import pe.edu.cibertec.dswii.sdb.gl.hilosconcurrenciaparalelismo.entity.editorial;
import pe.edu.cibertec.dswii.sdb.gl.hilosconcurrenciaparalelismo.entity.idioma;
import pe.edu.cibertec.dswii.sdb.gl.hilosconcurrenciaparalelismo.entity.categoria;

public class HiloVariadoMain {
    public static void main(String[] args) {
        // Crear instancias de Idioma y Categoria con datos reales
        idioma idioma = new idioma("Español", "es"); // Crea un objeto de tipo idioma con nombre y código
        categoria categoria = new categoria("Ficción", "Libros de ficción que narran historias imaginarias o fantásticas"); // Crea un objeto de tipo categoría

        // Crear objetos Editorial con datos reales
        editorial editorial1 = new editorial("Penguin Random House", "Estados Unidos"); // Crea una editorial con nombre y país
        editorial editorial2 = new editorial("HarperCollins", "Reino Unido"); // Crea otra editorial con nombre y país

        // Crear objetos Libro con datos reales
        libro libro1 = new libro("Cien Años de Soledad", "978-0307474728", 1967, editorial1, idioma, categoria); // Crea el primer libro con título, ISBN, año de publicación, editorial, idioma y categoría
        libro libro2 = new libro("Harry Potter y la Piedra Filosofal", "978-0747532743", 1997, editorial2, idioma, categoria); // Crea el segundo libro con los mismos parámetros

        // Crear hilos para procesar el registro de cada libro
        Thread hilo1 = new Thread(new HiloLibroRunnable(libro1)); // Crea un hilo para procesar el primer libro
        Thread hilo2 = new Thread(new HiloLibroRunnable(libro2)); // Crea un hilo para procesar el segundo libro

        // Iniciar el primer hilo
        hilo1.start(); // Inicia la ejecución del primer hilo
        try {
            hilo1.join();  // Espera a que el hilo1 termine antes de iniciar el siguiente
        } catch (InterruptedException e) {
            System.out.println("El hilo 1 fue interrumpido."); // En caso de que el hilo1 sea interrumpido
        }

        // Iniciar el segundo hilo después de que el primero haya terminado
        hilo2.start(); // Inicia la ejecución del segundo hilo
        try {
            hilo2.join();  // Espera a que el hilo2 termine
        } catch (InterruptedException e) {
            System.out.println("El hilo 2 fue interrumpido."); // En caso de que el hilo2 sea interrumpido
        }

        // Mostrar que el registro se completó
        System.out.println("Hilos de registro de libros completados."); // Mensaje de finalización de la ejecución de los hilos
    }
}
