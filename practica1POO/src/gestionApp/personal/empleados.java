package gestionApp.personal;

import java.io.Serializable;

public abstract class empleados implements Serializable {

    private String nombre;
    private int cedula;
    private double sueldo;
    private double comision;
    private int numeroContacto;
    private String correo;
    

    public empleados(String nombre, int cedula, double sueldo, int numeroContacto, String correo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.sueldo = sueldo;
        this.numeroContacto = numeroContacto;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public int getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(int numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public abstract double calcularComision();

}