//Version Modular Estructurada (solo dunciones)
package problema4;
import java.util.Scanner;
/**
 * @author Magdalena
 */
public class EstadisticaModular {
    // Funcion para calcular promedio
    public static double promedio(double[] datos) {
        double suma = 0;
        for (double x : datos) {
            suma += x;
        }
        return suma / datos.length;
    }
    // Funcion para calcular desviacion estandar
    public static double desviacion(double[] datos) {
        double media = promedio(datos);
        double suma = 0;
        for (double x : datos) {
            suma += Math.pow(x - media, 2);
        }
        return Math.sqrt(suma / (datos.length - 1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[10];

        System.out.println("Ingrese 10 numeros:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = sc.nextDouble();
        }
        System.out.printf("El promedio es %.2f%n", promedio(numeros));
        System.out.printf("La desviacion estondar es %.5f%n", desviacion(numeros));
    }
}
