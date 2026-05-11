package Sist_Biblioteca_Universitaria;

public class Prestamo {
    private String fechaPrestamo;
    private String fechaDevolucion;
    private Estudiante estudiante;
    private Libro libro;

    public Prestamo(Estudiante estudiante, Libro libro, String fechaPrestamo, String fechaDevolucion) {
        this.estudiante = estudiante;
        this.libro = libro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }
    public void mostrarInfo() {
        System.out.println("Prestamo: Libro " + libro.getTitulo() + " a estudiante " + estudiante);
        System.out.println("Fecha prestamo: " + fechaPrestamo + " | Fecha devolucion: " + fechaDevolucion);
    }
}
