package problema3;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Pedir coeficientes
        System.out.print("Ingrese a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        // Crear objeto
        EcuacionCuadratica eq = new EcuacionCuadratica(a, b, c);

        double discriminante = eq.getDiscriminante();

        // Evaluar casos según el discriminante
        if (discriminante > 0) {
            System.out.println("La ecuacion tiene dos raices: " +
                               eq.getRaiz1() + " y " + eq.getRaiz2());
        } else if (discriminante == 0) {
            System.out.println("La ecuacion tiene una raiz: " + eq.getRaiz1());
        } else {
            System.out.println("La ecuacion no tiene raices reales");
        }
    }
}
