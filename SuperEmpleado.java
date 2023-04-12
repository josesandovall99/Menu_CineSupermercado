/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.supermercado_cine;

/**
 *
 * @author JOSE SANDOVAL
 */
public class SuperEmpleado {
    private String tipoEmpleado;
    private String nombre;
    private String cedula;
    private double sueldo;

    public SuperEmpleado() {
    }

    @Override
    public String toString() {
        return "SuperEmpleado{" + "tipoEmpleado=" + tipoEmpleado + ", nombre=" + nombre + ", cedula=" + cedula + ", sueldo=" + sueldo + '}';
    }

    public SuperEmpleado(String tipoEmpleado, String nombre, String cedula, double sueldo) {
        this.tipoEmpleado = tipoEmpleado;
        this.nombre = nombre;
        this.cedula = cedula;
        this.sueldo = sueldo;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
    
}
