/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.sdb.gl.hilosconcurrenciaparalelismo.crecionHilosLibros;

import pe.edu.cibertec.dswii.sdb.gl.hilosconcurrenciaparalelismo.entity.libro;

/**
 * Clase que implementa Runnable para procesar libros en un hilo
 * @author Pocoyo
 */
public class HiloLibroRunnable implements Runnable {
    private libro libro; // Atributo que almacena el objeto libro
    
    // Constructor que inicializa el libro
    public HiloLibroRunnable(libro libro) {
        this.libro = libro; // Asigna el libro recibido al atributo
    }
    
    @Override
    public void run() {
        // Simula el procesamiento de cada libro (validaciones, cálculos, etc.)
        try {
            // Validaciones de ISBN y año de publicación
            validarISBN(libro.getIsbn()); // Llama al método para validar el ISBN
            validarAnioPublicacion(libro.getAnioPublicacion()); // Llama al método para validar el año de publicación

            // Imprimir los componentes del libro, la categoría, el idioma y la editorial
            System.out.println("Libro procesado: " + libro.getTitulo()); // Muestra el título del libro
            System.out.println("ISBN: " + libro.getIsbn()); // Muestra el ISBN del libro
            System.out.println("Año de publicación: " + libro.getAnioPublicacion()); // Muestra el año de publicación
            System.out.println("Editorial: " + libro.getEditorial().getNombre() + ", País: " + libro.getEditorial().getPais()); // Muestra editorial y país
            System.out.println("Idioma: " + libro.getIdioma().getNombre() + " (" + libro.getIdioma().getCodigo() + ")"); // Muestra idioma
            System.out.println("Categoría: " + libro.getCategoria().getNombre() + " - " + libro.getCategoria().getDescripcion()); // Muestra categoría
            System.out.println(""); // Línea en blanco para separar los resultados
            
            // Simula tiempo de procesamiento (espera de 1 segundo)
            Thread.sleep(1000); // Pausa la ejecución del hilo durante 1 segundo
        } catch (InterruptedException e) {
            // En caso de que la tarea sea interrumpida
            System.out.println("El procesamiento del libro fue interrumpido.");
        }
    }

    // Método para validar el ISBN
    private void validarISBN(String isbn) {
        if (isbn == null || isbn.isEmpty()) { // Si el ISBN es nulo o vacío
            System.out.println("ISBN no válido"); // Muestra mensaje de error
        }
    }

    // Método para validar el año de publicación
    private void validarAnioPublicacion(int anio) {
        // Si el año de publicación está fuera del rango válido
        if (anio < 1500 || anio > 2024) {
            System.out.println("Año de publicación no válido"); // Muestra mensaje de error
        }
    }
}
