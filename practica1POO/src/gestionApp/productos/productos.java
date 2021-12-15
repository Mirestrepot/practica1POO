package gestionApp.productos;

import java.io.Serializable;
import java.util.ArrayList;

import javax.sound.sampled.Port;

import gestionApp.Pedido.compra;

public class productos implements Serializable {

    /*
        Escribir y explicar finalidad de la clase Producto, junto con sus estructuras de datos cuando sea necesario.
    */

    private static ArrayList<productos> inventario = new ArrayList<>();

    private int codigo;
    private String nombre;
    private enum tiposProducto {sandwiches,pollo, postres, papas_y_complementos, bebidas, desayunos, mccafe, mccombo};                       // Implementacion caso de enumeración
    tiposProducto tipo;
    private double precio;
    private ArrayList<compra> productosVendidos = new ArrayList<>();


    public productos(int codigo, String nombre, tiposProducto tipo, double precio ) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        productos.inventario.add(this);
    }

    public static ArrayList<productos> getInventario() {
        return inventario;
    }

    public static void setInventario(ArrayList<productos> inventario) {
        productos.inventario = inventario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public tiposProducto getTipo() {
        return tipo;
    }

    public void setTipo(tiposProducto tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<compra> getProductosVendidos() {
        return productosVendidos;
    }

    public void setProductosVendidos(ArrayList<compra> productosVendidos) {
        this.productosVendidos = productosVendidos;
    }

    public static  ArrayList<productos> agregarProducto(productos producto){
        productos.inventario.add(producto);
        return inventario;
    }
}