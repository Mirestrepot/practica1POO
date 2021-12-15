package gestionApp.personal;

import java.io.Serializable;
import java.util.ArrayList;

import gestionApp.Pedido.Compra;
import gestionApp.personal.Empleado;

public class Cajero extends Empleado implements Serializable {

    private double cantidadEnVentas;
    private static ArrayList<Cajero> cajeros = new ArrayList<Cajero>();
    private ArrayList<Compra> productosVendidos = new ArrayList<Compra>();

    public Cajero(String nombre, int cedula, double sueldo, int numeroContacto, String correo, double cantidadEnVentas) {
        super(nombre, cedula, sueldo, numeroContacto, correo);
        this.cantidadEnVentas = cantidadEnVentas;
        Cajero.cajeros.add(this);
    }

    public double getCantidadEnVentas() {
        return cantidadEnVentas;
    }

    public void setCantidadEnVentas(double cantidadEnVentas) {
        this.cantidadEnVentas = cantidadEnVentas;
    }

    public ArrayList<Compra> getProductosVendidos() {
        return productosVendidos;
    }

    public void setProductosVendidos(ArrayList<Compra> productosVendidos) {
        this.productosVendidos = productosVendidos;
    }

    public static ArrayList<Cajero> getCajeros() {
        return cajeros;
    }

    public static void setCajeros(ArrayList<Cajero> cajeros) {
        Cajero.cajeros = cajeros;
    }

    @Override
    public double calcularComision() {
        return 0;
    }
}