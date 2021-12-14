package gestionApp.comprasClientes;

import java.io.Serializable;
import java.util.ArrayList;

public class cliente implements Serializable {

    private static ArrayList<cliente> clientes = new ArrayList<>();
    private String cedula;
    private String nombreCompleto;
    private String celular;
    private double gasto;

    private ArrayList<compras> compras = new ArrayList<>();


    public cliente(String cedula, String nombreCompleto, String celular, double gasto) {
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        cliente.clientes.add(this);
    }

    public static ArrayList<cliente> getclientes() {
        return clientes;
    }

    public static void setClientes(ArrayList<cliente> Clientes) {
        cliente.clientes = Clientes;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombreCompleto;
    }

    public void setNombre(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular  = celular;
    }

    public double getGasto() {
        return gasto;
    }

    public void setGasto(double gasto) {
        this.gasto = gasto;
    }

    public ArrayList<compras> getCompras() {
        return compras;
    }

    public void setCompras(ArrayList<compras> compras) {
        this.compras = compras;
    }


    /*
        En los siguentes métodos se evidencia sobrecarga de métodos, teneindo en cuenta que en el arreglo de compras
        del cliente, estas pueden ser de tipo ConpraServicios y CompraProductos
    */

    public ArrayList<compras> addCompra(compras compra){
         this.compras.add(compra);
         return  this.compras;
    }
}
