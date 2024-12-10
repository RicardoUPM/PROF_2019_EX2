package com.control2.control_2_2019;

import java.util.ArrayList;
import java.util.List;

public class ClaseExamen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static List<Integer> primos(int n) {
        List<Integer> factoresPrimos = new ArrayList<>();
        
        if (n <= 1) {
            throw new EntradaInvalida("El número debe ser mayor que 1.");
        }

        // Dividir por 2 hasta que ya no sea divisible
        while (n % 2 == 0) {
            factoresPrimos.add(2);
            n /= 2;
        }

        // Dividir por números impares desde 3 en adelante
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                factoresPrimos.add(i);
                n /= i;
            }
        }

        // Si queda un número primo mayor que 2, se añade
        if (n > 2) {
            factoresPrimos.add(n);
        }

        return factoresPrimos;
    }
	
	
}
