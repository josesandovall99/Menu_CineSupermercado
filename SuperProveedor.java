/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.supermercado_cine;

/**
 *
 * @author JOSE SANDOVAL
 */
public class SuperProveedor {
    private String nombrePro;
    private String telefono;
    private String producto;
    private String nit;

    public SuperProveedor(String nombrePro, String telefono, String producto, String nit) {
        this.nombrePro = nombrePro;
        this.telefono = telefono;
        this.producto = producto;
        this.nit = nit;
    }

    @Override
    public String toString() {
        return "SuperProveedor{" + "nombrePro=" + nombrePro + ", telefono=" + telefono + ", producto=" + producto + ", nit=" + nit + '}';
    }

    public SuperProveedor() {
    }

    public String getNombrePro() {
        return nombrePro;
    }

    public void setNombrePro(String nombrePro) {
        this.nombrePro = nombrePro;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    
    
}
