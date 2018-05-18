
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
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre; // Nombre del cliente
        int tipo; // Tipo de cliente
        int cantidad; //Cntidad de celulares que adquirio
        int precio = 300; // Precio por cada celular adquirido
        int subtotal; // Precio de cada celular multiplicado por la cantidad adquirida
        double descuento = 0; // Descuento al cliente
        double pFinal; // Subtotal menos el descuento

        System.out.printf("Ingresar el nombre del cliente:\n");
        nombre = entrada.nextLine(); 
        System.out.println("Ingresar el tipo de cliente: ");
        tipo = entrada.nextInt(); 
        System.out.println("Ingresar la cantidad de celulares a adquirir: ");
        cantidad = entrada.nextInt(); 

        subtotal = precio * cantidad; // se calciula el sub total a pagar
        if (tipo == 1) {
            descuento = (subtotal * 10) / 100;
        } else {
            if (tipo == 2) {
                descuento = (subtotal * 20) / 100;
        } else {
            if (tipo ==3){
                descuento = (subtotal * 30) / 100;
 }
        }
    }
        pFinal = subtotal - descuento;

        System.out.printf("Nombre: %s\n", nombre);
        System.out.printf("Tipo de cliente: %d\n", tipo);
        System.out.printf("Cantidad de dispositivos celulares: %d\n", cantidad);
        System.out.printf("Subtotal a cancelar: %d\n", subtotal);
        System.out.printf("Descuento: %f\n", descuento);
        System.out.printf("Valor fianl a cancelar: %f\n", pFinal);

    }
}
