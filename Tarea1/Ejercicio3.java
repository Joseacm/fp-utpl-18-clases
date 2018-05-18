
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
public class Ejercicio3 {
    public static void main(String[] args) {
        /*- Solución que permita calcular y presentar los valores de X y Y, 
        teniendo como dato de entrada el valor de X y obtener el de Y en base a 
        las siguientes restricciones:
            Si X<0 entonces Y=3*X+10
            Si X>0 entonces Y=X**2+6
            Si X==0 entonces Y=1*/
        Scanner entrada = new Scanner(System.in);
        System.out.println("X: ");
        int x = entrada.nextInt();
        int y = 0;
        if (x < 0) {
            y = 3 * x + 10;
        }
        if (x > 0) {
            y = x * 2 + 6;
        }
        if (x == 0) {
            y = 1;
        }
        System.out.println("Y vale: " + y);
    }
}
