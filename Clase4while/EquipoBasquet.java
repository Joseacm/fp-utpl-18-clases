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
public class EquipoBasquet {
      public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        //System.out.println("Reporte de estaturas");
        String cadena;
        int contador=1;
        double estatura;
        double suma = 0;
        double promedio = 0;
        double restric=1.20;
        boolean estatura1=true;
        cadena = String.format("%s\n", "Estatura");
        while (estatura1) {
            System.out.printf("Reporte de estatura %d:\n", contador);
            estatura = entrada.nextDouble();
            if(estatura<restric){
                estatura=restric;
            }
            System.out.printf("Estatura %f:\n", estatura);
            suma = suma + estatura;
            cadena = String.format("%s%.2f\n", cadena, estatura);
            contador = contador + 1;
            
            entrada.nextLine(); 
            System.out.println("¿Salir? (Si o No)");
            String temporal = entrada.nextLine();
            if (temporal.equals("Si")) {
                estatura1 = false;
            }
            
       }
            promedio = suma / contador;
            System.out.printf("%s", cadena);
            System.out.printf("El promedio: %.2f\n", promedio);
    }
   
}
        /*System.out.println("Desea ingresar mas estaturas (si o no)");
        
            String temporal = entrada.nextLine();
            if (temporal.equals("no")) {
                estatura1 = false;
            }
            else{
                System.out.println("Ingrese las demas estaturas");
                estatura= entrada.nextDouble();
                
            }
        suma = suma + estatura;
        cadena = String.format("%s%.2f\n", cadena, estatura);
        contador = contador + 1;
        
        entrada.nextLine();
        
    promedio = suma / contador;
            System.out.printf("%s", cadena);
            System.out.printf("El promedio: %.2f\n", promedio);*/
    



