package uiMain.interfazClientes;

import java.util.Scanner;

import gestionApp.Pedido.cliente;

public class GestionCliente {

    public static void GestionarCliente() {

        Scanner input = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("\tMENU PRINCIPAL"+"\n1. Ingrese sus datos para hacer su pedido"+"\n2. Para realizar pedido"+"\n3. Mostrar info del Cliente");
            opcion = input.nextInt();
            switch (opcion) {
                case 1: 
                    RegistroCliente.registrarCliente();
                    break;
                case 2:  
                    break;
                case 3: 
                    MostrarCliente.mostrarClientes();
                    break;
                case 4: break;
                case 5: break;
                case 6: break;
            }

        }while (opcion != 6);
    }
}