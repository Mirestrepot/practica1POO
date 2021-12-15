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
            System.out.println("\t¿Que dato desea Modificar?"+"\n1. Cedula"+"\n2. Nombre Completo"+"\n3. Celular \n4. Regresar");
            
            opcion = scan.nextInt();

            try {
                switch (opcion) {
                    case 1: 
                        editarCedula(Cliente.getClientes().get(nCliente-1)); break;
                    case 2:
                        editarNombre(Cliente.getClientes().get(nCliente-1)); break;
                    case 3: 
                        editarCel(Cliente.getClientes().get(nCliente-1)); break;
                    case 4: break;

                }
            } catch (Exception e) {
                System.out.print("Ingrese una opcion nuevamente: ");
                opcion = scan.nextInt();
            }
        } while (opcion != 4);
    }

    public static void  editarCedula (Cliente cliente){
        Scanner scan = new Scanner(System.in);
        System.out.println ("Ingrese la Cedula nuevamente");
        String nuevo = scan.nextLine();
        cliente.setCedula(nuevo);
    
    }
    public static void  editarNombre (Cliente cliente){
        Scanner scan = new Scanner(System.in);
        System.out.println ("Ingrese la Cedula nuevamente");
        String nuevo = scan.nextLine();
        cliente.setCedula(nuevo);

    }
    public static void  editarCel (Cliente cliente){
        Scanner scan = new Scanner(System.in);
        System.out.println ("Ingrese la Cedula nuevamente");
        String nuevo = scan.nextLine();
        cliente.setCedula(nuevo);
      
    }
    

}
    