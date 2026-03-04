package problema3;
public class EcuacionCuadratica {
    // Atributos privados
    private double a, b, c;
    // Constructor
    public EcuacionCuadratica(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    // Metodo para calcular el discriminante
    public double getDiscriminante() {
        return b * b - 4 * a * c;
    }
    // Metodo para obtener la primera raiz
    public double getRaiz1() {
        double discriminante = getDiscriminante();
        if (discriminante < 0) {
            return 0; // No hay raíces reales
        }
        return (-b + Math.sqrt(discriminante)) / (2 * a);
    }
    // Método para obtener la segunda raiz
    public double getRaiz2() {
        double discriminante = getDiscriminante();
        if (discriminante < 0) {
            return 0; // No hay raices reales
        }
        return (-b - Math.sqrt(discriminante)) / (2 * a);
    }
}
