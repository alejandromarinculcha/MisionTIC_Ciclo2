
import java.util.ArrayList;

public class Producto {

    // Función 1
    public ArrayList<String> obtenerProductos(ArrayList<String> P) {
        ArrayList<String> lista = new ArrayList<>();
        for (String n : P) {
            if (lista.contains(n)) {
            } else {
                lista.add(n);
            }
        }
        return lista;
    }

    // Función 2
    public ArrayList<Integer> obtenerProductosFaltantes(ArrayList<Integer> lpos, ArrayList<String> faltantes, String cat) {
        ArrayList<Integer> ProductosFaltantes = new ArrayList<Integer>();
        for (Integer indice : lpos) {
            if (faltantes.get(indice) == cat) {
                ProductosFaltantes.add(indice);
            }
        }
        return ProductosFaltantes;
    }

    // Función 3
    public ArrayList<String> obtenerFaltantes(ArrayList<String> lotro, ArrayList<String> INPI) {
        ArrayList<String> lista = new ArrayList<>();
        for (String m : lotro) {
            if (INPI.contains(m)) {
            } else {
                lista.add(m);
            }
        }
        return lista;
    }

    // Función 4
    public Integer obtenerSobrantesIntercambiables(ArrayList<String> lotro, ArrayList<String> INPI) {
        ArrayList<String> lista = new ArrayList<>();
        for (String m : lotro) {
            if (INPI.contains(m)) {
            } else {
                lista.add(m);
            }
        }
        ArrayList<String> lista2 = new ArrayList<>();
        for (String m : INPI) {
            if (lotro.contains(m)) {
            } else {
                lista2.add(m);
            }
        }
        if (lista.size() > lista2.size()) {
            return lista2.size();
        } else {
            return lista.size();
        }
    }
}
