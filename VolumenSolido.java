package ejemplojava;

public class VolumenSolido {
    
    public static double VolumenEfera(double radio) {
        return 4 * Math.PI * Math.pow(radio, 3) / 3;
    }
    
    public static void main(String[] args) {
        double radio = 3.3;
        double v = VolumenEfera(radio);
        System.out.println("El volumen de la esfera es; " + v);
    
  }
}
