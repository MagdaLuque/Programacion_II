package problema4;
import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[10];
        // Pedir 10 numeros al usuario
        System.out.println("Ingrese 10 numeros:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = sc.nextDouble();
        }
        // Crear objeto Estadistica
        Estadistica est = new Estadistica(numeros);

        System.out.printf("El promedio es %.2f%n" , est.promedio());
        System.out.printf("La desviacion estandar es %.5f%n" , est.desviacion());
    }  
}
