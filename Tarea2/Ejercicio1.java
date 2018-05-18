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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String NomCliente;
        String ClienteApellido;
        int cantidad;
        double pre_art;
        double sum = 0;
        double iva;
        double pretotal;
        double total;
        boolean option = true;
        String Articulo;
        String cadena_final;
        cadena_final = String.format("%s\t%s\t%s\t\t%s\n", "Articulo", "Cantidad", "Precio unitario", "Precio total");
        System.out.printf("Factura\n");
        System.out.printf("Supermercado Todo a menor precio\n");
        System.out.println("Ingrese por favor el nombre del cliente");
        NomCliente = entrada.nextLine();
        System.out.println("Ingrese por favor el apellido del cliente");
        ClienteApellido = entrada.nextLine();
        while (option) {
            System.out.println("Ingrese el nombre del artículo a comprar");
            Articulo = entrada.nextLine();
            System.out.println("Ingrese la cantidad a comprar");
            cantidad = entrada.nextInt();
            System.out.println("Ingrese el precio Unitario");
            pre_art = entrada.nextDouble();

            pretotal = pre_art * cantidad;
            sum = sum + pretotal;
            cadena_final = String.format("%s%-10s\t%d\t\t%.1f\t\t\t%.1f\n", cadena_final, Articulo, cantidad, pre_art, pretotal);
            entrada.nextLine();
            System.out.println("¿Desea comprar otro articulo? (Escriba 0 para salir)");
            String bandera = entrada.nextLine();
            if ("0".equals(bandera)) {
                option = false;
            }
        }
        iva = sum * 0.12;
        total = sum + iva;
        System.out.println("Factura");
        System.out.println("Supermercado: Todo a menor precio");
        System.out.printf("Nombre del Cliente: %s %s\n", NomCliente, ClienteApellido);
        System.out.println(cadena_final);
        System.out.printf("\t\t\t\tSubtotal \t\t%.1f\n", sum);
        System.out.printf("\t\t\t\tIVA 12%% \t\t%.2f\n", iva);
        System.out.printf("\t\t\t\tTotal \t\t\t%.2f\n", total);
    }

}
