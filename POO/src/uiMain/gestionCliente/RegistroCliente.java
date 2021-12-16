package uiMain.gestionCliente;

import java.util.Scanner;

import gestionApp.Pedido.Cliente;



public class RegistroCliente {
    public static void registrarCliente() {
        int opcion;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("\tIngrese porfavor los siguiente campos ");
            System.out.print("\nCedula: ");
            String cedula = scan.nextLine();
            System.out.print("Nombre Completo: ");
            String nombre = scan.nextLine();
            System.out.print("Celular: ");
            int cel = scan.nextInt();
            Cliente.agregarCliente(new Cliente(cedula, nombre, cel));
            System.out.println("Sus datos de han guardado satisfactoriamente");
            System.out.println("Eres el numero de cliente: "+Cliente.getNumeroCliente());
            System.out.print("1. Regresar : ");
            opcion = scan.nextInt();
        } while (opcion != 1);

    }

}