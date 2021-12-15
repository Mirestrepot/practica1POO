package uiMain;
import java.util.InputMismatchException;
import java.util.Scanner;

import baseDatos.deserializador;
import baseDatos.serializador;
import uiMain.interfazClientes.GestionCliente;
public class main {
    public static void main(String[] args) {
        deserializador.deserializar();
        Scanner input = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\t MENU PRINCIPAL"+"\n1. Realizar un pedido"+"\n2. Opcion 2"+"\n3. Opcion 3"+"\n4. Salir");
            opcion = input.nextInt();
            switch (opcion) {
                case 1: GestionCliente.GestionarCliente();
                case 2: break;
                case 3: break;
                case 4: break;
                case 5: break;
                case 6: break;
                case 7: salirDelSistema(); break;
            }

        } while (opcion != 7);
    }
    public static void salirDelSistema() {
        serializador.serializar();
    }

}
     
		
    


