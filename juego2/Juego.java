package juego2;
import java.util.Random;
import java.util.Scanner;

public class Juego {
    protected int numeroDeVidas;
    //protected int record;
    protected static int record = 0;

    public Juego(int numeroDeVidas) {
        this.numeroDeVidas = numeroDeVidas;
        //this.record = 0;
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
//clase
class JuegoAdivinaNumero extends Juego {
    protected int numeroAAdivinar;

    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas);
    }
    public boolean validaNumero(int num){
        return num >= 0 && num <= 10;
    }
    public void juega() {
        reiniciaPartida();
        Random rand = new Random();
        numeroAAdivinar = rand.nextInt(11); // numero entre 0 y 10

        Scanner sc = new Scanner(System.in);
        System.out.println("------ Adivina un numero entre 0 y 10 ------");

        while (true) {
            int intento = sc.nextInt();
            
            if (!validaNumero(intento)) {
                System.out.println("Numero invalido. Debe estar entre 0 y 10.");
                continue;
            }
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
class JuegoAdivinaPar extends JuegoAdivinaNumero {
    public JuegoAdivinaPar(int numeroDeVidas) {
        super(numeroDeVidas);
    }
    
    @Override
    public boolean validaNumero(int num) {
        if (num >= 0 && num <= 10 && num % 2 == 0) {
            return true;
        } else {
            System.out.println("Error: Debes ingresar un número PAR entre 0 y 10.");
            return false;
        }
    }
}

class JuegoAdivinaImpar extends JuegoAdivinaNumero {
    public JuegoAdivinaImpar(int numeroDeVidas) {
        super(numeroDeVidas);
    }
    @Override
    public boolean validaNumero(int num) {
        if (num >= 0 && num <= 10 && num % 2 != 0) {
            return true;
        } else {
            System.out.println("Error: Debes ingresar un número IMPAR entre 0 y 10.");
            return false;
        }
    }
}
class Main{
    public static void main(String[] args) {
        JuegoAdivinaNumero juego1 = new JuegoAdivinaNumero(3); // 3 vidas
        JuegoAdivinaPar juego2 = new JuegoAdivinaPar(3);
        JuegoAdivinaImpar juego3 = new JuegoAdivinaImpar(3);

        juego1.juega();
        juego2.juega();
        juego3.juega();
    }
}
