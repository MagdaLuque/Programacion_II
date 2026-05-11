package Sist_Biblioteca_Universitaria;
public class Pagina {
    private int numero;
    private String contenido;

    public Pagina(int numero, String contenido) {
        this.numero = numero;
        this.contenido = contenido;
    }
    public void mostrarPagina() {
        System.out.println("Pagina " + numero + ": " + contenido);
    }
}
