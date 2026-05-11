package Sist_Biblioteca_Universitaria;
import java.util.List;

public class Libro {
     private String titulo;
    private String ISBN;
    private List<Pagina> paginas;

    public Libro(String titulo, String ISBN, List<Pagina> paginas) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.paginas = paginas;
    }
    public void leer() {
        System.out.println("Leyendo libro: " + titulo);
        for (Pagina p : paginas) {
            p.mostrarPagina();
        }
    }
    public String getTitulo() {
        return titulo;
    }
}
