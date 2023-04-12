/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.supermercado_cine;

/**
 *
 * @author JOSE SANDOVAL
 */
public class SuperSeccion {
    
    private String numeroDeSeccion;
    private String nombreDeSeccion;
    private String id;

    public SuperSeccion() {
    }

    @Override
    public String toString() {
        return "SuperSeccion{" + "numeroDeSeccion=" + numeroDeSeccion + ", nombreDeSeccion=" + nombreDeSeccion + ", id=" + id + '}';
    }

    public SuperSeccion(String numeroDeSeccion, String nombreDeSeccion, String id) {
        this.numeroDeSeccion = numeroDeSeccion;
        this.nombreDeSeccion = nombreDeSeccion;
        this.id = id;
    }

    public String getNumeroDeSeccion() {
        return numeroDeSeccion;
    }

    public void setNumeroDeSeccion(String numeroDeSeccion) {
        this.numeroDeSeccion = numeroDeSeccion;
    }

    public String getNombreDeSeccion() {
        return nombreDeSeccion;
    }

    public void setNombreDeSeccion(String nombreDeSeccion) {
        this.nombreDeSeccion = nombreDeSeccion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
}
