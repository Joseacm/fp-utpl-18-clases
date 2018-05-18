/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4while;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class EdadesEjercicio {
    public static void main (String[] args ){
        String cadena_final = "";
        Scanner entrada = new Scanner(System.in);
        int suma= 0;
        int edad= 0;
        int contador= 1;
        cadena_final = String.format("%s\t%s\n","Edad","Suma");
        while(contador <= 5){
            System.out.println("Ingrese el valor de edad");
            edad =entrada.nextInt();
            suma = suma + edad;
            System.out.printf("%d\t%d\n", edad, suma);
            contador = contador + 1;
            //System.out.printf("%s\t%s\n", "edad","suma");
            cadena_final= String.format("%s%d\t%d\n", cadena_final,edad,suma);
        } 
        //System.out.printf("%d\t%d\n", edad, suma);
        System.out.printf("%s", cadena_final);
    }

    
}
