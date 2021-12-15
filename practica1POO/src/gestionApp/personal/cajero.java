package gestionApp.personal;

import java.io.Serializable;
import java.util.ArrayList;

import gestionApp.comprasClientes.compras;
import gestionApp.personal.empleados;

public class cajero extends empleados implements Serializable {

    private double cantidadEnVentas;
    private static ArrayList<cajero> cajeros = new ArrayList<cajero>();
    private ArrayList<compras> productosVendidos = new ArrayList<compras>();

    public cajero(String nombre, int cedula, double sueldo, int numeroContacto, String correo, double cantidadEnVentas) {
        super(nombre, cedula, sueldo, numeroContacto, correo);
        this.cantidadEnVentas = cantidadEnVentas;
        cajero.cajeros.add(this);
    }

    public double getCantidadEnVentas() {
        return cantidadEnVentas;
    }

    public void setCantidadEnVentas(double cantidadEnVentas) {
        this.cantidadEnVentas = cantidadEnVentas;
    }

    public ArrayList<compras> getProductosVendidos() {
        return productosVendidos;
    }

    public void setProductosVendidos(ArrayList<compras> productosVendidos) {
        this.productosVendidos = productosVendidos;
    }

    public static ArrayList<cajero> getCajeros() {
        return cajeros;
    }

    public static void setCajeros(ArrayList<cajero> cajeros) {
        cajero.cajeros = cajeros;
    }

    @Override
    public double calcularComision() {
        return 0;
    }
}