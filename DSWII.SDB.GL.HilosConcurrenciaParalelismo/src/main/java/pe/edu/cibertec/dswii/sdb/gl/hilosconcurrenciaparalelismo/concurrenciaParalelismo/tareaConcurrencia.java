package pe.edu.cibertec.dswii.sdb.gl.hilosconcurrenciaparalelismo.concurrenciaParalelismo;

import pe.edu.cibertec.dswii.sdb.gl.hilosconcurrenciaparalelismo.entity.libro;

public class tareaConcurrencia implements Runnable {

    private libro libro; // Atributo que almacena el objeto libro

    // Constructor que inicializa el libro
    public tareaConcurrencia(libro libro) {
        this.libro = libro; // Asigna el libro recibido al atributo
    }

    @Override
    public void run() {
        // Mostrar detalles del libro al ejecutarse la tarea
        System.out.println("Iniciando tarea para el libro: " + libro.getTitulo()); // Muestra mensaje de inicio
        System.out.println("Detalles del libro:");
        System.out.println("Título: " + libro.getTitulo()); // Muestra el título del libro
        System.out.println("ISBN: " + libro.getIsbn()); // Muestra el ISBN del libro
        System.out.println("Año de Publicación: " + libro.getAnioPublicacion()); // Muestra el año de publicación
        System.out.println("Editorial: " + libro.getEditorial().getNombre()); // Muestra la editorial
        System.out.println("Idioma: " + libro.getIdioma().getNombre()); // Muestra el idioma
        System.out.println("Categoría: " + libro.getCategoria().getNombre()); // Muestra la categoría

        try {
            // Simulación de tiempo de tarea (espera de 1 segundo)
            Thread.sleep(1000); // Pausa la ejecución del hilo durante 1 segundo
        } catch (InterruptedException e) {
            System.out.println("La tarea fue interrumpida"); // En caso de que la tarea sea interrumpida
        }

        // Mostrar mensaje de finalización de la tarea
        System.out.println("Finalizando tarea para el libro: " + libro.getTitulo()); // Muestra mensaje de fin
        System.out.println(""); // Imprime una línea en blanco para separar tareas
    }
}
