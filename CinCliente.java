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
public class CinCliente {
    private String nombre;
    private String cedula;
    private String FechaNacimiento;
    private int ticketsComprados;
    private String arl;

    @Override
    public String toString() {
        return "CinCliente{" + "nombre=" + nombre + ", cedula=" + cedula + ", FechaNacimiento=" + FechaNacimiento + ", ticketsComprados=" + ticketsComprados + ", arl=" + arl + '}';
    }

    public CinCliente(String nombre, String cedula, String FechaNacimiento, int ticketsComprados, String arl) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.FechaNacimiento = FechaNacimiento;
        this.ticketsComprados = ticketsComprados;
        this.arl = arl;
    }

    public CinCliente() {
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

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public int getTicketsComprados() {
        return ticketsComprados;
    }

    public void setTicketsComprados(int ticketsComprados) {
        this.ticketsComprados = ticketsComprados;
    }

    public String getArl() {
        return arl;
    }

    public void setArl(String arl) {
        this.arl = arl;
    }
    
    
}
