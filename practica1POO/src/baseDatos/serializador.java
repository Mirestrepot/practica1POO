package baseDatos;


import java.io.*;

import gestionApp.Pedido.Cliente;
import gestionApp.Pedido.Compra;
import gestionApp.personal.Empleado;

public class serializador {

    /*
        Este método es el encargado de serializar las listar que están en cada clase
    */

    public static void serializar() {

        FileOutputStream fileOut;
        try{
            fileOut = new FileOutputStream("src\\baseDatos\\temp\\clientes.txt");

            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(Cliente.getClientes());
            out.close();
            fileOut.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try{
            fileOut = new FileOutputStream("src\\baseDatos\\temp\\compras.txt");

            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(Compra.getComprasProducto());
            out.close();
            fileOut.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try{
            fileOut = new FileOutputStream("src\\baseDatos\\temp\\empleados.txt");

            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(Empleado.getEmpleados());
            out.close();
            fileOut.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try{
            fileOut = new FileOutputStream("src\\baseDatos\\temp\\empleados.txt");

            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(Empleado.getEmpleados());
            out.close();
            fileOut.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}