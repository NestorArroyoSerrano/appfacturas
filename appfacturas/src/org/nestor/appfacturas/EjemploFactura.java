package org.nestor.appfacturas;

import org.nestor.appfacturas.modelo.*;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNif("5555-5");
        cliente.setNombre("Andrés");

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una descripción de la factura: ");
        Factura factura = new Factura(sc.nextLine(), cliente);

        Producto producto;

        /*
        String nombre;
        float precio;
        int cantidad;
        */


        System.out.println();

        for(int i = 0; i< 2 ; i++){
            producto = new Producto();
            System.out.println("Ingrese producto nº " + producto.getCodigo() + ": ");
            producto.setNombre(sc.nextLine());

            System.out.println("Ingrese el precio: ");
            producto.setPrecio(sc.nextFloat());

            System.out.println("Ingrese la cantidad: ");
            factura.addItemFactura(new ItemFactura(sc.nextInt(), producto));

            System.out.println();
            sc.nextLine();
        }

        System.out.println(factura);

    }
}
