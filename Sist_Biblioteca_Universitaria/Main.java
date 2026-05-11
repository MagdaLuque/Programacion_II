package Sist_Biblioteca_Universitaria;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Horario horario = new Horario("Lunes a Viernes", "08:00", "18:00");
        Biblioteca biblioteca = new Biblioteca("Biblioteca UMSA", horario);

        Autor autor1 = new Autor("Ronald E. Walpole", "Mexico");
        biblioteca.agregarAutor(autor1);

        // Crear libro con paginas (Composición)
        List<Pagina> paginas = Arrays.asList(
            new Pagina(1, "Distribucion Normal..."),
            new Pagina(2, "Distribucion Beta...")
        );
        Libro libro1 = new Libro("Estadistica", "23-816", paginas);
        biblioteca.agregarLibro(libro1);

        // Crear estudiante
        Estudiante estudiante1 = new Estudiante("123456", "Alan Brito");

        // Crear préstamo (Asociacion)
        biblioteca.prestarLibro(estudiante1, libro1);

        // Mostrar estado
        biblioteca.mostrarEstado();

        // Cerrar biblioteca
        biblioteca.cerrarBiblioteca();
    }
}
