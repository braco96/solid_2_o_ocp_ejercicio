package org.formacion.ocp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GeneradorPrimos {

    // Método principal: genera una lista de números primos menores que 'limit'
    public List<Integer> primos (int limit) {
        
        List<Integer> primos = new ArrayList<>();
        for (int i = 2; i < limit; i++) {
            if (esPrimo(i)) {  // si el número es primo, lo añade a la lista
                primos.add(i);
            }
        }
        // Ordena la lista de primos usando el comparador definido en getOrdenacion()
        Collections.sort(primos, getOrdenacion());
        return primos;
    }
    
    // Comprueba si un número es primo (divisible solo por 1 y sí mismo)
    private boolean esPrimo (int candidato) {
        for (int i = 2; i < candidato; i++) {
            if (candidato % i == 0) {
                return false;  // si encuentra un divisor, no es primo
            }
        }
        return true;  // si no encuentra divisores, es primo
    }

    /**
     * getOrdenacion devuelve un objeto Comparator<Integer> 
     * 
     * Resultado: los números se ordenan de menor a mayor (orden ascendente).
     */
    protected Comparator<Integer> getOrdenacion () {
        return (a, b) -> a > b ? 1 : -1;
    }
}
