package uiMain.interfazClientes;

import registroFacturacion.pago;
import java.util.Scanner;

import gestionApp.Pedido.cliente;


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
            cliente.agregarCliente(new cliente(cedula, nombre, cel));
            System.out.println("Sus datos de han guardado satisfactoriamente");
            System.out.print("1. Regresar : ");
            opcion = Integer.parseInt(scan.nextLine());
        } while (opcion != 1);

    }

}