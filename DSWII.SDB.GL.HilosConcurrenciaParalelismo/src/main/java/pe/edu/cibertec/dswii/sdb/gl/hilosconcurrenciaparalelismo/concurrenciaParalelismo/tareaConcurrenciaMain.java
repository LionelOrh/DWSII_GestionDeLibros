package pe.edu.cibertec.dswii.sdb.gl.hilosconcurrenciaparalelismo.concurrenciaParalelismo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import pe.edu.cibertec.dswii.sdb.gl.hilosconcurrenciaparalelismo.entity.categoria;
import pe.edu.cibertec.dswii.sdb.gl.hilosconcurrenciaparalelismo.entity.editorial;
import pe.edu.cibertec.dswii.sdb.gl.hilosconcurrenciaparalelismo.entity.idioma;
import pe.edu.cibertec.dswii.sdb.gl.hilosconcurrenciaparalelismo.entity.libro;

public class tareaConcurrenciaMain {
    public static void main(String[] args) {
        // Crear instancias de Idioma y Categoria
        idioma idioma = new idioma("Español", "es"); // Idioma español
        categoria categoria = new categoria("Ficción", "Libros de ficción"); // Categoria 'Ficción'

        // Crear objetos Editorial
        editorial editorial1 = new editorial("Editorial A", "País A"); // Editorial A en País A
        editorial editorial2 = new editorial("Editorial B", "País B"); // Editorial B en País B

        // Crear objetos Libro (solo 2 libros)
        libro libro1 = new libro("Cien años de soledad", "978-0307474728", 1967, editorial1, idioma, categoria); // Libro 1: 'Cien años de soledad'
        libro libro2 = new libro("Don Quijote de la Mancha", "978-0451531324", 1605, editorial2, idioma, categoria); // Libro 2: 'Don Quijote de la Mancha'

        // Crear un ExecutorService con pool de 1 hilo para simular concurrencia (uno por uno)
        ExecutorService executorServiceConcurrencia = Executors.newFixedThreadPool(1); // Crea un pool con un solo hilo

        // Crear tareas concurrentes para el registro de libros
        Runnable tarea1 = new tareaConcurrencia(libro1); // Tarea para registrar el libro1
        Runnable tarea2 = new tareaConcurrencia(libro2); // Tarea para registrar el libro2

        // Ejecutar las tareas concurrentemente
        executorServiceConcurrencia.execute(tarea1); // Ejecuta la tarea1
        executorServiceConcurrencia.execute(tarea2); // Ejecuta la tarea2

        // Cerrar el executor
        executorServiceConcurrencia.shutdown(); // Apaga el executor después de completar las tareas
        System.out.println("Las tareas de los libros han sido enviadas de manera secuencial"); // Mensaje de confirmación
    
    
    }
}
