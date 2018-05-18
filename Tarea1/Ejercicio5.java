
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
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double cantidad;
        System.out.println("Cantidad de grados");
        cantidad = entrada.nextDouble();
        System.out.println("1. Convertir en grados celcius (c) a fahrenheit (f)");
        System.out.println("2. Convertir en grados fahrenheit (f) a grados celcius (c)");
        int opción;
        System.out.println("Escoja la opción");
        entrada.nextLine(); //Limpiandp scanner
        opción = entrada.nextInt();
        
        double f=0,c=0;
        switch(opción){
            case 1:
                f = (9/5)*cantidad+32;
                System.out.println("Su conversiion resultante es: "+cantidad+"° celcius son iguales a "+f+"° fahrenheit");
                break;
            case 2:
                c = (cantidad-32)*5/9;
                System.out.println("Su conversion resultante es: "+cantidad+"° fahrenheit son iguales a "+c+"° celcius");
                break;
        }
                
    }
}
