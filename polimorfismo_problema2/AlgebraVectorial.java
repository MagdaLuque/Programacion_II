package polimorfismo_problema2;
/**
 * @author Magdalena
 */
public class AlgebraVectorial {

    private double[] a;
    private double[] b;
    // Constructor vacío
    public AlgebraVectorial() {
        this.a = new double[]{0, 0};
        this.b = new double[]{0, 0};
    }
    // Constructor con vectores
    public AlgebraVectorial(double[] a, double[] b) {
        this.a = a;
        this.b = b;
    }
    private double productoPunto(double[] v1, double[] v2) {
        return v1[0] * v2[0] + v1[1] * v2[1];
    }
    private double magnitud(double[] v) {
        return Math.sqrt(v[0] * v[0] + v[1] * v[1]);
    }
    private double productoCruz(double[] v1, double[] v2) {
        return v1[0] * v2[1] - v1[1] * v2[0];
    }
    public boolean esPerpendicular() {
        return productoPunto(a, b) == 0;
    }
    public boolean esPerpendicular(int tipo) {
        switch (tipo) {
            case 1:
                return magnitud(new double[]{a[0] + b[0], a[1] + b[1]})
                        == magnitud(new double[]{a[0] - b[0], a[1] - b[1]});
            case 2:
                return magnitud(new double[]{a[0] - b[0], a[1] - b[1]})
                        == magnitud(new double[]{b[0] - a[0], b[1] - a[1]});
            case 3:
                return productoPunto(a, b) == 0;
            case 4:
                return Math.pow(magnitud(new double[]{a[0] + b[0], a[1] + b[1]}), 2)
                        == Math.pow(magnitud(a), 2) + Math.pow(magnitud(b), 2);
            default:
                return false;
        }
    }
    // Metodos sobrecargados para paralelismo
    public boolean esParalelo() {
        return productoCruz(a, b) == 0;
    }
    public boolean esParalelo(int tipo) {
        if (tipo == 1) {
            // a = r b → comprobamos proporcion
            if (b[0] != 0 && b[1] != 0) {
                double r1 = a[0] / b[0];
                double r2 = a[1] / b[1];
                return r1 == r2;
            }
            return false;
        } else if (tipo == 2) {
            return productoCruz(a, b) == 0;
        }
        return false;
    }
    // Proyeccion de a sobre b
    public double[] proyeccion() {
        return proyeccion(this.a, this.b);
    }
    public double[] proyeccion(double[] a, double[] b) {
        double numerador = productoPunto(a, b);
        double denominador = Math.pow(magnitud(b), 2);
        double factor = numerador / denominador;
        return new double[]{factor * b[0], factor * b[1]};
    }
    // Componente de a en direccion de b
    public double componente() {
        return componente(this.a, this.b);
    }
    public double componente(double[] a, double[] b) {
        return productoPunto(a, b) / magnitud(b);
    }

    //************************************************
    public static void main(String[] args) {
        double[] v1 = {3, 4};
        double[] v2 = {6, 8};

        AlgebraVectorial av = new AlgebraVectorial(v1, v2);

        // a) Perpendicular: |a+b| = |a-b|
        System.out.println("Inciso a) Perpendicular (|a+b| = |a-b|): " + av.esPerpendicular(1));

        // b) Perpendicular: |a-b| = |b-a|
        System.out.println("Inciso b) Perpendicular (|a-b| = |b-a|): " + av.esPerpendicular(2));

        // c) Perpendicular: a · b = 0
        System.out.println("Inciso c) Perpendicular (a . b = 0): " + av.esPerpendicular(3));

        // d) Perpendicular: |a+b|² = |a|² + |b|²
        System.out.println("Inciso d) Perpendicular (|a+b|^2 = |a|^2 + |b|^2): " + av.esPerpendicular(4));

        // e) Paralela: a = r b
        System.out.println("Inciso e) Paralela (a = r b): " + av.esParalelo(1));

        // f) Paralela: a × b = 0
        System.out.println("Inciso f) Paralela (a * b = 0): " + av.esParalelo(2));

        // g) Proyeccion de a sobre b
        double[] proy = av.proyeccion();
        System.out.println("Inciso g) Proyeccion de a sobre b: (" + proy[0] + ", " + proy[1] + ")");

        // h) Componente de a en direccion de b
        System.out.println("Inciso h) Componente de a en direccion de b: " + av.componente());
    }
}
