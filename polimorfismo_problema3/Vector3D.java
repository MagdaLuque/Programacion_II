package polimorfismo_problema3;
/**
 * @author Magdalena
 */
public class Vector3D {
    private double x;
    private double y;
    private double z;
    // Constructor vacío
    public Vector3D() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
    // Constructor con parámetros
    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    // Suma de vectores
    public Vector3D suma(Vector3D v) {
        return new Vector3D(this.x + v.x, this.y + v.y, this.z + v.z);
    }

    // Multiplicación por escalar
    public Vector3D escalar(double r) {
        return new Vector3D(r * this.x, r * this.y, r * this.z);
    }
    // Magnitud del vector
    public double magnitud() {
        return Math.sqrt(x*x + y*y + z*z);
    }
    // Normalización del vector
    public Vector3D normal() {
        double mag = magnitud();
        if (mag == 0) return new Vector3D(0,0,0);
        return new Vector3D(x/mag, y/mag, z/mag);
    }
    // Producto punto
    public double productoPunto(Vector3D v) {
        return this.x*v.x + this.y*v.y + this.z*v.z;
    }
    // Producto cruz
    public Vector3D productoCruz(Vector3D v) {
        return new Vector3D(
            this.y*v.z - this.z*v.y,
            this.z*v.x - this.x*v.z,
            this.x*v.y - this.y*v.x
        );
    }
    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
    //main
    public static void main(String[] args) {
        Vector3D a = new Vector3D(1, 2, 3);
        Vector3D b = new Vector3D(4, 5, 6);

        // a) Suma
        System.out.println("a) a + b = " + a.suma(b));

        // b) Escalar
        System.out.println("b) 2a = " + a.escalar(2));

        // c) Magnitud
        System.out.println("c) |a| = " + a.magnitud());

        // d) Normalizacion
        System.out.println("d) Normal de a = " + a.normal());

        // e) Producto punto
        System.out.println("e) a . b = " + a.productoPunto(b));

        // f) Producto cruz
        System.out.println("f) a x b = " + a.productoCruz(b));
    }
}
