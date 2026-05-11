package Sist_Biblioteca_Universitaria;

public class Estudiante {
    private String codigo;
    private String nombre;

    public Estudiante(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " | Codigo: " + codigo);
    }
}
