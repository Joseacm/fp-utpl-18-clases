/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class Ejericicio2 {
    public static void main (String [] Args){
     Scanner entrada = new Scanner(System.in);
        
        int auto;
        double impuest;
        double cost;
        int Argentina=0;
        int Colombia=0;
        int Chile=0;
        int Otros=0;
        double pre_vent;
        double tot_imp=0;
        int tot_autos=0;
        double total = 0;
        int contador = 1;  
        String marca;
        String origen;    
        String cadena_final = String.format("%s\t\t%s\t\t%s\t\t%s\t%s\n", "Marca", 
                "Origen", "Costo", "Impuesto", "Precio Venta");
        System.out.println("Ingrese la cantidad total de autos");
        auto = entrada.nextInt();
        
        entrada.nextLine();
        while (contador <= auto){
            System.out.println("Ingrese la marca del auto");
            marca = entrada.nextLine();
            System.out.println("Ingrese el lugar de procedencia del auto");
            origen = entrada.nextLine();
            System.out.println("Ingrese el costo del auto ");
            cost = entrada.nextDouble();
            
            switch (origen) {
                case "Argentina":
                    impuest = cost * 0.2;
                    Argentina = Argentina + 1;
                    break;
                case "Colombia":
                    impuest = cost * 0.25;
                    Colombia = Colombia + 1;
                    break;
                case "Chile":
                    impuest = cost * 0.3;
                    Chile = Chile + 1;
                    break;
                default:
                    impuest= cost * 0.4;
                    Otros = Otros + 1;
                    break;
            }
            
            contador = contador + 1;
            pre_vent = cost + impuest;
            tot_autos = tot_autos + 1;
            tot_imp = tot_imp + impuest;
            total = total + pre_vent;
            cadena_final = String.format("%s%-10s\t%-10s\t%.0f\t\t%.0f\t\t%.0f\n",
                    cadena_final, marca, origen, cost, impuest, pre_vent);
            entrada.nextLine(); 
        }
        
        System.out.println("\t\tReporte de Autos Importados");

        System.out.printf("%s", cadena_final);  
        System.out.printf("Total Autos: %d\tTot.Imp.:%-10.0f\tTot.PV: %-10.0f\n", tot_autos, tot_imp, total);
 
        System.out.printf("Argentina:\t%d\n",Argentina);
        System.out.printf("Chile:\t%d\n",Chile);
        System.out.printf("Colombia:\t%d\n",Colombia);
        System.out.printf("Resto de paises:\t%d\n",Otros);
    }
}

