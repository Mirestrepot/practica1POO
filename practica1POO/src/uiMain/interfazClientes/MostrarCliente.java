package uiMain.interfazClientes;

import java.util.Scanner;

import gestionApp.Pedido.cliente;

public class MostrarCliente {
    public static void mostrarClientes() {
        int opcion;
        Scanner scan = new Scanner(System.in);
        System.out.print(cliente.verClientes());
        do {
            System.out.print("1. Regresar : ");
            opcion = Integer.parseInt(scan.nextLine());
        } while (opcion != 1);
    }   
}