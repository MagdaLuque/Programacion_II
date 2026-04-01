package polimorfismo_problema1;
/**
 * @author Magdalena
 */
public class MiPunto {
    private double x;
    private double y;
    // Constructor sin argumentos (punto en el origen)
    public MiPunto() {
        this.x = 0;
        this.y = 0;
    }
    // Constructor con coordenadas especificadas
    public MiPunto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    // Metodos getter
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    // Metodo distancia hacia otro objeto MiPunto
    public double distancia(MiPunto p) {
        double dx = this.x - p.x;
        double dy = this.y - p.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    // Metodo distancia hacia coordenadas especificas
    public double distancia(double x, double y) {
        double dx = this.x - x;
        double dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    
    //****************************************************
    public static void main(String[] args) {
        MiPunto p1 = new MiPunto(); // (0,0)
        MiPunto p2 = new MiPunto(10, 30.5);
        
        double distancia = p1.distancia(p2);
        
        System.out.println("La distancia entre (0,0) y (10,30.5) es: " + distancia);
    }
}

