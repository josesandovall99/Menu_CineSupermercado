/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.supermercado_cine;

/**
 *
 * @author JOSE SANDOVAL
 */
public class CinSala {
    private String nombre;
    private int cantPuestos;
    private int areaDeSala;

    public CinSala(String nombre, int cantPuestos, int areaDeSala) {
        this.nombre = nombre;
        this.cantPuestos = cantPuestos;
        this.areaDeSala = areaDeSala;
    }

    @Override
    public String toString() {
        return "CinSala{" + "nombre=" + nombre + ", cantPuestos=" + cantPuestos + ", areaDeSala=" + areaDeSala + '}';
    }

    public CinSala() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantPuestos() {
        return cantPuestos;
    }

    public void setCantPuestos(int cantPuestos) {
        this.cantPuestos = cantPuestos;
    }

    public int getAreaDeSala() {
        return areaDeSala;
    }

    public void setAreaDeSala(int areaDeSala) {
        this.areaDeSala = areaDeSala;
    }
    
    
}
