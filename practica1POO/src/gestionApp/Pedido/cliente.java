package gestionApp.Pedido;

import java.io.Serializable;
import java.util.ArrayList;


public class Cliente implements Serializable {

    private static ArrayList<Cliente> clientes = new ArrayList<>();

    private String cedula;
    private String nombre;
    private int cel;
    private double gastos;

    // Relacion que tiene el cliente con sus compras
    private ArrayList<Compra> compras = new ArrayList<>();

    //Constructor
    public Cliente(String cedula, String nombre, int cel) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.cel = cel;

    }

    // Se agrega el método toString() para mostrar todos los datos de los clientes
    @Override
    public String toString() {
        return "Cliente :"+"\nCedula: " + cedula + "\nNombre Completo: "+ nombre + "\nCelular: "+ cel;
            
                
    }

    // Se agregan lo métodos Getters & Setters
    public static ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public static void setClientes(ArrayList<Cliente> clientes) {
        Cliente.clientes = clientes;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  

    public int getCel() {
        return cel;
    }

    public void setCel(int cel) {
        this.cel = cel;
    }

    public double getGastos() {
        return gastos;
    }

    public void setGastos(double gastos) {
        this.gastos = gastos;
    }

    public ArrayList<Compra> getCompras() {
        return compras;
    }

    public void setCompras(ArrayList<Compra> compras) {
        this.compras = compras;
    }


    public static String verClientes() {
        String resultado = "";

        for (int i = 0; i < clientes.size(); i++) {
            resultado += (i+1) + ". " + clientes.get(i) + "\n";
        }

        return resultado;
    }



    public static void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }


    public static void eliminarCliente(Cliente cliente) {
        clientes.remove(cliente);
    }
    public static int getNumeroCliente () {
        return clientes.size();
    }
}