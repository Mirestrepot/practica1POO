package uiMain.gestionCliente;

import java.util.Scanner;
import gestionApp.Pedido.Cliente;

public class GestionCliente {

    public static void GestionarCliente() {
        Scanner scan = new Scanner(System.in);
        int opcion;

        do {
            try {
                System.out.print("\t MENU CLIENTE");
                System.out.print("\t Para realizar un pedido... 1. Para continuar o 2. Para salir ");
                
                try {
                    opcion = scan.nextInt();
                    if (opcion == 1);
                        RegistroCliente.registrarCliente();
                    
                } catch (Exception e) {
                    System.out.print("Ingrese una opcion nuevamente: ");
                    opcion = scan.nextInt();
                }

            System.out.println("\tMENU PARA CLIENTE"+"\n1. Ingrese sus datos para hacer su pedido"+"\n2. Para realizar pedido"+"\n3. Mostrar info del Cliente");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1: 
                    RegistroCliente.registrarCliente();
                    break;
                case 2:  
                    EditarCliente.editarCliente();
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
