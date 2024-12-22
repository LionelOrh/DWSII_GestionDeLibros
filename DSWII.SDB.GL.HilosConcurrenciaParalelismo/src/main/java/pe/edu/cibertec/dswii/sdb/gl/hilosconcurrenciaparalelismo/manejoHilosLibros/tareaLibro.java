package pe.edu.cibertec.dswii.sdb.gl.hilosconcurrenciaparalelismo.manejoHilosLibros;

import pe.edu.cibertec.dswii.sdb.gl.hilosconcurrenciaparalelismo.entity.libro;

public class tareaLibro implements Runnable {
    private libro libro; // Atributo que almacena el objeto libro a procesar

    // Constructor que recibe un libro y lo asigna al atributo
    public tareaLibro(libro libro) {
        this.libro = libro;
    }

    @Override
    public void run() {
        // Mostrar detalles del libro al iniciar la tarea
        System.out.println("Iniciando el registro de libro: ");
        System.out.println("Título: " + libro.getTitulo()); // Muestra el título del libro
        System.out.println("ISBN: " + libro.getIsbn()); // Muestra el ISBN del libro
        System.out.println("Año de publicación: " + libro.getAnioPublicacion()); // Muestra el año de publicación
        System.out.println("Editorial: " + libro.getEditorial().getNombre()); // Muestra el nombre de la editorial
        System.out.println("Idioma: " + libro.getIdioma().getNombre()); // Muestra el nombre del idioma
        System.out.println("Categoría: " + libro.getCategoria().getNombre()); // Muestra el nombre de la categoría
        
        // Simular un proceso largo (por ejemplo, registrar el libro en una base de datos)
        try {
            Thread.sleep(2000);  // Simula un proceso largo de 2 segundos (ej. registro en base de datos)
        } catch (InterruptedException ex) {
            // Si la tarea es interrumpida, se muestra un mensaje
            System.out.println("El registro de " + libro.getTitulo() + " fue interrumpido.");
        }
        
        // Finalizar la tarea mostrando un mensaje
        System.out.println("Finalizando el registro de libro: " + libro.getTitulo()); // Muestra el mensaje de finalización
        System.out.println(""); // Línea en blanco para separar las salidas de cada libro
    }
}
