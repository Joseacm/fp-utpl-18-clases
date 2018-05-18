
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
public class Ejercicio1 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String Día[]={"Domingo", "Lunes", "Martes", "Miercoles", "Juves", "Viernes", "Sabado"};
        System.out.println("Ingrese un numero del DÍa de la semana");
        int d= entrada.nextInt();
        if(d >=1 && d <= 7){
           System.out.println("El Día "+d+" es "+Día[d-1]);
        }else{
            System.out.println("No es un Día de la semana");
   }     
      }
}
        




