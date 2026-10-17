package main;

import model.*;

public class Main {
    public static void main(String[] args) {

        Pedido vacio = new Pedido();
        System.out.println("Pedido vacio");
        mostrar(vacio);


        Pedido pedido = new Pedido();
        pedido.agregar(new Tablet(), 2);
        pedido.agregar(new Portatil(), 1);
        pedido.agregar(new ComputadoraTorre(), 1);
        pedido.agregar(new Television(), 1);

        System.out.println("\nPedido Wtech");
        System.out.println("2 Tablets, 1 Portatil, 1 Torre, 1 Television");
        mostrar(pedido);


        System.out.println("\nCantidad invalida");
        try {
            pedido.agregar(new Tablet(), 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void mostrar(Pedido p) {
        System.out.println("Subtotal: $" + p.calcularSubtotal());
        System.out.println("Envio:    $" + p.calcularEnvio());
        System.out.println("Total:    $" + p.calcularTotal());
    }
}
