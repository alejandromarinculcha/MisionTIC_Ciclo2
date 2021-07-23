package ejemplojava;

import java.util.Scanner;

public class InvertirCadena {

    public static String invertir(String cadena) {
        String respuesta = "";
        for (char letra : cadena.toCharArray()) {
            respuesta = letra + respuesta;
        }
        return respuesta;
    }

    public static String Espalindrome(String cadena1) {
        if (cadena1.equals(invertir(cadena1))) {
            return "SI";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Entrada
        System.out.print("Ingrese la cadena: ");
        String texto = sc.nextLine();

        // Salidas
        System.out.println("Invertido: " + invertir(texto));
        System.out.println("¿Es palíndrome?: " + Espalindrome(texto));

    }
}
