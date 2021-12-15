package uiMain.gestionCliente;

import gestionApp.Pedido.Cliente;

import java.util.Scanner;

public class EditarCliente {

    public static void editarCliente() {
        int opcion;   
        Scanner scan = new Scanner(System.in);
        Cliente.getClientes();

        System.out.println("Ingrese su numero de Cliente: ");
        int nCliente = scan.nextInt();
        scan.nextLine();


        do {
            System.out.println("\tLos datos ingresados son: ");
            Cliente.getClientes();
            System.out.println("\t¿Que dato desea Modificar?"+"\n1. Cedula"+"\n2. Nombre Completo"+"\n4. Celular");
            
            opcion = scan.nextInt();

            try {
                switch (opcion) {
                    case 1: editarCedula(Cliente.getClientes().get(nCliente)); break;
                    case 2: break;
                    case 3: break;
                    case 4: break;
                    case 5: break;
                    case 6: break;
                    case 7: break;
                }
            } catch (Exception e) {
                System.out.print("Indique su eleccion : ");
                opcion = scan.nextInt();
            }
                


            

        } while (opcion != 7);
        System.out.print("¡Cliente editado con éxito!, ¿desea editar otro cliente? [si/no] : ");

    public static void  editarCedula (Cliente cliente){
        Scanner input = new Scanner(System.in);
        System.out.println (" 6. Fecha de Nacimiento");
        String nuevaCedula = input.nextLine();
        Cliente.setCedula(nuevaCedula);

    }

}
    