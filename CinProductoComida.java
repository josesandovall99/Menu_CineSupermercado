/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.supermercado_cine;

/**
 *
 * @author JOSE SANDOVAL
 */
public class CinProductoComida {
    private String nombre;
    private String tamaño;
    private double precio;

    @Override
    public String toString() {
        return "CinProductoComida{" + "nombre=" + nombre + ", tama\u00f1o=" + tamaño + ", precio=" + precio + '}';
    }

    public CinProductoComida() {
    }

    public CinProductoComida(String nombre, String tamaño, double precio) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
