package baseDatos;


import gestionApp.Pedido.cliente;
import gestionApp.Pedido.compra;
import gestionApp.personal.Empleado;

import java.io.*;
import java.util.ArrayList;

public class deserializador {

    /*
        Este método es el encargado de deserializar las listas que están en cada clase
    */

    public static void deserializar() {

        FileInputStream fileIn;
        try {
            fileIn = new FileInputStream("src\\baseDatos\\temp\\clientes.txt");

            ObjectInputStream in = new ObjectInputStream(fileIn);

            ArrayList<cliente> clientes;

            clientes = (ArrayList<cliente>) in.readObject();

            cliente.setClientes(clientes);

            in.close();
            fileIn.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            fileIn = new FileInputStream("src\\baseDatos\\temp\\compras.txt");

            ObjectInputStream in = new ObjectInputStream(fileIn);

            ArrayList<compra> compras;

            compras = (ArrayList<compra>) in.readObject();

            compra.setComprasProducto(compras);

            in.close();
            fileIn.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            fileIn = new FileInputStream("src\\baseDatos\\temp\\empleados.txt");

            ObjectInputStream in = new ObjectInputStream(fileIn);

            ArrayList<gestionApp.personal.Empleado> empleado;

            empleado = (ArrayList<Empleado>) in.readObject();

            Empleado.setEmpleados(empleado);

            in.close();
            fileIn.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}
