package uiMain;

import java.util.Scanner;
import uiMain.gestionCliente.GestionCliente;
import uiMain.gestionCliente.RegistroCliente;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        

        do {
            
                switch (opcion) {
                    case 1: 
                        GestionCliente.GestionarCliente(); break;
                    case 2: break;
                    case 3: break;
                    case 4: break;

                }
            } catch (Exception e) {
                System.out.print("Ingrese una opcion nuevamente: ");
                opcion = scan.nextInt();
            }
        } while (opcion != 4);
    }
    public static void salirDelSistema() {

    }

}
     
		
    


