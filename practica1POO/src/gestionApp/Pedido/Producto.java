package gestionApp.Pedido;

import java.io.Serializable;
import java.util.ArrayList;

import javax.sound.sampled.Port;

public class Producto implements Serializable {

    /*
        Escribir y explicar finalidad de la clase Producto, junto con sus estructuras de datos cuando sea necesario.
    */

    private static ArrayList<Producto> inventario = new ArrayList<>();

    private int codigo;
    private String nombre;
    private enum tiposProducto {sandwiches,pollo, postres, papas_y_complementos, bebidas, desayunos, mccafe, mccombo};                       // Implementacion caso de enumeración
    tiposProducto tipo;
    private double precio;
    private ArrayList<Compra> productosVendidos = new ArrayList<>();


    public Producto(int codigo, String nombre, tiposProducto tipo, double precio ) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        Producto.inventario.add(this);
    }

    public static ArrayList<Producto> getInventario() {
        return inventario;
    }

    public static void setInventario(ArrayList<Producto> inventario) {
        Producto.inventario = inventario;
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

    public ArrayList<Compra> getProductosVendidos() {
        return productosVendidos;
    }

    public void setProductosVendidos(ArrayList<Compra> productosVendidos) {
        this.productosVendidos = productosVendidos;
    }

    public static  ArrayList<Producto> agregarProducto(Producto producto){
        Producto.inventario.add(producto);
        return inventario;
    }
}