package problema1;
import java.util.Random;
public class Principal {

    public static void main(String[] args) {
        int n = 100000;
        int[] numeros = new int[n];
        Random rand = new Random();
        // Generar números aleatorios
        for (int i = 0; i < n; i++) {
            numeros[i] = rand.nextInt(1000000);
        }
        // Crear cronómetro y medir tiempo
        Cronometro cronometro = new Cronometro();
        cronometro.inicia();

        // Ordenar con selección
        selectionSort(numeros);

        cronometro.detener();

        // Mostrar tiempos usando getters y lapso
        System.out.println("Tiempo inicial: " + cronometro.getInicia() + " ms");
        System.out.println("Tiempo final: " + cronometro.getFinaliza() + " ms");
        System.out.println("Lapso total: " + cronometro.lapsoDeTiempo() + " ms");
    }
    // Algoritmo de selección
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Intercambiar
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
