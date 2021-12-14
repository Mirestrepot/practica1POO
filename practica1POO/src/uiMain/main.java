package uiMain;
import java.util.InputMismatchException;
import java.util.Scanner;

import gestionApp.comprasClientes.cliente;
import interfazMenu.menu;
public class main {
    public  main(String[] args) throws Exception {

        public void  menu () {
            boolean salir;
            int opcion;
            Scanner scan = new Scanner(System.in);
            while (!salir) {
                System.out.println("\t MENU PRINCIPAL"+"\n1. Realizar un pedido"+"\n2. Opcion 2"+"\n3. Opcion 3"+"\n4. Salir");
    
                try {
                    
                    System.out.println("Escribe una de las opciones");
                    opcion = scan.nextInt();
     
                    switch (opcion) {
                        case 1:
    
                            
    
                            break;
                        case 2:
                            System.out.println("Has seleccionado la opcion 2");
                            break;
                        case 3:
                            System.out.println("Has seleccionado la opcion 3");
                            break;
                        case 4:
                            salir = true;
                            break;
                        default:
                            System.out.println("Solo números entre 1 y 4");
                    }
                }catch (InputMismatchException e) {
                    System.out.println("Debes insertar un número");
                    scan.next();
                }
            }
        
        }
     
		
    }
}

