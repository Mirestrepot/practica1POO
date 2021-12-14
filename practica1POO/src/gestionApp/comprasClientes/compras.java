package gestionApp.comprasClientes;

import java.io.Serializable;
import java.util.ArrayList;

public class compras implements Serializable {
    protected String ID;
    protected  String descripcion;
    protected int precio;
    private static ArrayList<compras> comprasProducto = new ArrayList<>();
    private String fechaCompra;
    private float descuento;
    private ArrayList<compras> productosVendidos = new ArrayList<>();


    public compras(String ID, String descripcion, int precio, String fechaCompra, float descuento) {
        this.ID = ID;
        this.descripcion = descripcion;
        this.precio = precio;
        this.fechaCompra = fechaCompra;
        this.descuento = descuento;
        compras.comprasProducto.add(this);
        
    }
    public compras() {
    }

    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String desprcicion) {
        this.descripcion = desprcicion;
    }

    public static ArrayList<compras> getComprasProducto() {
        return comprasProducto;
    }

    public static void setComprasProducto(ArrayList<compras> comprasProducto) {
        compras.comprasProducto = comprasProducto;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }
    public  ArrayList<compras> getProductosVendidos() {
        return productosVendidos;
    }

    public void setProductos(ArrayList<compras> productosVendidos) {
        this.productosVendidos = productosVendidos;
    }

}