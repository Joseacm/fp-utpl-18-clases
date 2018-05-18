
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hp
 */
public class Ejercicio4 {
public static void main (String[] args){
    Scanner entrada = new Scanner(System.in);
        int cantidad = 0; 
        double precio = 0;
        
        double valor_a_pagar = cantidad*precio;
        if (cantidad == 1) {
            valor_a_pagar = valor_a_pagar - (valor_a_pagar * 50) / 100;
        }
        if (cantidad == 2) {
            valor_a_pagar = valor_a_pagar - (valor_a_pagar * 70) / 100;
        }
        if (cantidad >= 3) {
            valor_a_pagar = valor_a_pagar - (valor_a_pagar * 80) / 100;
        }
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.DOWN);
        System.out.println("Su valor final a cancelar es :" + df.format(valor_a_pagar));
    }
}