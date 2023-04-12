/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.supermercado_cine;

/**
 *
 * @author JOSE SANDOVAL
 */
public class CinEmpleado {
    private String nombre;
    private String tipoEmpleado;
    private String cedula;
    private double sueldo;

    public CinEmpleado() {
    }

    @Override
    public String toString() {
        return "CinEmpleado{" + "nombre=" + nombre + ", tipoEmpleado=" + tipoEmpleado + ", cedula=" + cedula + ", sueldo=" + sueldo + '}';
    }

    public CinEmpleado(String nombre, String tipoEmpleado, String cedula, double sueldo) {
        this.nombre = nombre;
        this.tipoEmpleado = tipoEmpleado;
        this.cedula = cedula;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
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
