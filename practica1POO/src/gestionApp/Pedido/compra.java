package gestionApp.Pedido;

import java.io.Serializable;
import java.util.ArrayList;

public class compra implements Serializable {
    protected String ID;
    protected  String descripcion;
    protected int precio;
    private static ArrayList<compra> comprasProducto = new ArrayList<>();
    private String fechaCompra;
    private float descuento;
    private ArrayList<compra> productosVendidos = new ArrayList<>();


    public compra(String ID, String descripcion, int precio, String fechaCompra, float descuento) {
        this.ID = ID;
        this.descripcion = descripcion;
        this.precio = precio;
        this.fechaCompra = fechaCompra;
        this.descuento = descuento;
        compra.comprasProducto.add(this);
        
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

    public static ArrayList<compra> getComprasProducto() {
        return comprasProducto;
    }

    public static void setComprasProducto(ArrayList<compra> comprasProducto) {
        compra.comprasProducto = comprasProducto;
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
    public  ArrayList<compra> getProductosVendidos() {
        return productosVendidos;
    }

    public void setProductos(ArrayList<compra> productosVendidos) {
        this.productosVendidos = productosVendidos;
    }

}