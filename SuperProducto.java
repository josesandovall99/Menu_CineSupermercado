/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.supermercado_cine;

/**
 *
 * @author JOSE SANDOVAL
 */
public class SuperProducto {
    private String nombre;
    private String pasillo;
    private String tipoProducto;
    private String zona;
    private double precio;

    @Override
    public String toString() {
        return "SuperProducto{" + "nombre=" + nombre + ", pasillo=" + pasillo + ", tipoProducto=" + tipoProducto + ", zona=" + zona + ", precio=" + precio + '}';
    }

    public SuperProducto(String nombre, String pasillo, String tipoProducto, String zona, double precio) {
        this.nombre = nombre;
        this.pasillo = pasillo;
        this.tipoProducto = tipoProducto;
        this.zona = zona;
        this.precio = precio;
    }

    public SuperProducto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPasillo() {
        return pasillo;
    }

    public void setPasillo(String pasillo) {
        this.pasillo = pasillo;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
