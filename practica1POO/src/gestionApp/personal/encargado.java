package gestionApp.personal;

import gestionApp.comprasClientes.compras;
import gestionApp.personal.empleados;
import gestionApp.personal.cajero;

import java.io.Serializable;
import java.util.ArrayList;

public class encargado extends empleados implements Serializable {

    private double cantidadEnVentas;
    private static ArrayList<encargado> ventasPersonal = new ArrayList<encargado>();
    private ArrayList<compras> productosVendidos = new ArrayList<compras>();

    public encargado(String nombre, int cedula, double sueldo, int numeroContacto, String correo, double cantidadEnVentas) {
        super(nombre, cedula, sueldo, numeroContacto, correo);
        this.cantidadEnVentas = cantidadEnVentas;
        encargado.ventasPersonal.add(this);
    }
    public double getCantidadEnVentas() {
        return cantidadEnVentas;
    }

    public void setCantidadEnVentas(double cantidadEnVentas) {
        this.cantidadEnVentas = cantidadEnVentas;
    }
   
    public void setProductosVendidos(ArrayList<compras> productosVendidos) {
        this.productosVendidos = productosVendidos;
    }
    @Override
    public double calcularComision() {
        return 0;
    }

}