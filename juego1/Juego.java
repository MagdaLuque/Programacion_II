package juego1;
import java.util.Random;
import java.util.Scanner;

public class Juego {
    protected int numeroDeVidas;
    protected int record;

    public Juego(int numeroDeVidas) {
        this.numeroDeVidas = numeroDeVidas;
        this.record = 0;
    }

    public void reiniciaPartida() {
        System.out.println("Reiniciando partida...");
    }

    public void actualizaRecord() {
        record++;
        System.out.println("Nuevo record! Record actual: " + record);
    }

    public boolean quitaVida() {
        numeroDeVidas--;
        return numeroDeVidas > 0;
    }
}
//clase juego
class JuegoAdivinaNumero extends Juego {
    private int numeroAAdivinar;

    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas);
    }

    public void juega() {
        reiniciaPartida();
        Random rand = new Random();
        numeroAAdivinar = rand.nextInt(11); // numero entre 0 y 10

        Scanner sc = new Scanner(System.in);
        System.out.println("Adivina un numero entre 0 y 10:");

        while (true) {
            int intento = sc.nextInt();

            if (intento == numeroAAdivinar) {
                System.out.println("Acertaste!!");
                actualizaRecord();
                break;
            } else {
                if (quitaVida()) {
                    if (intento < numeroAAdivinar) {
                        System.out.println("El numero es mayor. Intenta de nuevo:");
                    } else {
                        System.out.println("El numero es menor. Intenta de nuevo:");
                    }
                } else {
                    System.out.println("No te quedan mas vidas. Fin del juego.");
                    break;
                }
            }
        }
    }
}
class Main{
    public static void main(String[] args) {
        JuegoAdivinaNumero juego = new JuegoAdivinaNumero(3); // 3 vidas
        juego.juega();
    }
}
