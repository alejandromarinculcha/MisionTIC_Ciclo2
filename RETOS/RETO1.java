package retos;
import java.util.Scanner;
public class RETO1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        
        int H, L;
        H = (2*P)+4;
        L = (int)((P+H)/5);
        
        System.out.println(P + " " + H + " " + L);
        
        // Categorias
        
        if (L>0 && L<=20){
            System.out.println("uno");
        }else if (L>=21 && L<=30){
            System.out.println("dos");
        }else if (L>31 && L<=50){
            System.out.println("tres");
        }else{
            System.out.println("cuatro");
        }
    }
    
}
