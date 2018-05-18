/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana7;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int suma = 0;
        for (int contador = 0; contador <= 10; contador++) {
            if (contador % 2 == 0) {
                suma = suma + contador;
            }

        }
        System.out.printf("La suma es %d", suma);
    }

}
