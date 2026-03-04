//Version Orientada a Objetos (POO)
package problema4;
public class Estadistica {
    // Atributo privado: arreglo de datos
    private double[] datos;
    // Constructor
    public Estadistica(double[] datos) {
        this.datos = datos;
    }
    // Método para calcular el promedio
    public double promedio() {
        double suma = 0;
        for (double x : datos) {
            suma = suma + x;
        }
        return suma / datos.length;
    }
    // Motodo para calcular la desviacion estondar
    public double desviacion() {
        double media = promedio();
        double suma = 0;
        for (double x : datos) {
            suma = suma + Math.pow(x - media, 2);
        }
        return Math.sqrt(suma / (datos.length - 1));
    }
}
