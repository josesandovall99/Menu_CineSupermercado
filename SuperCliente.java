/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.supermercado_cine;

import java.util.Date;

/**
 *
 * @author JOSE SANDOVAL
 */
public class SuperCliente {
    private String nombre;
    private String cedula;
    private String email;
    private String fechadeNacimiento;
    private String telefono;

    public SuperCliente() {
    }

    @Override
    public String toString() {
        return "SuperCliente{" + "nombre=" + nombre + ", cedula=" + cedula + ", email=" + email + ", fechadeNacimiento=" + fechadeNacimiento + ", telefono=" + telefono + '}';
    }

    public SuperCliente(String nombre, String cedula, String email, String fechadeNacimiento, String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.email = email;
        this.fechadeNacimiento = fechadeNacimiento;
        this.telefono = telefono;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechadeNacimiento() {
        return fechadeNacimiento;
    }

    public void setFechadeNacimiento(String fechadeNacimiento) {
        this.fechadeNacimiento = fechadeNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
