package problema1;
public class Cronometro {
    private long inicia;    // Atributos privados
    private long finaliza;
    // Constructor sin argumentos: inicia con la hora actual
    public Cronometro() {
        this.inicia = System.currentTimeMillis();
    }
    // Getter de inicia
    public long getInicia() {
        return inicia;
    }
    // Getter de finaliza
    public long getFinaliza() {
        return finaliza;
    }
    // Método inicia(): reinicia el cronómetro
    public void inicia() {
        this.inicia = System.currentTimeMillis();
    }
    // Método detener(): guarda el tiempo final
    public void detener() {
        this.finaliza = System.currentTimeMillis();
    }
    // Método lapsoDeTiempo(): retorna el tiempo transcurrido
    public long lapsoDeTiempo() {
        return finaliza - inicia;
    }
}
