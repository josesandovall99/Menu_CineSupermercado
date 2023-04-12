/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.supermercado_cine;

/**
 *
 * @author JOSE SANDOVAL
 */
public class CinTicket {
    private String tipoPelicula;
    private String NombrePelicula;
    private String codigo;
    private String horaDeFuncion;

    public CinTicket(String tipoPelicula, String NombrePelicula, String codigo, String horaDeFuncion) {
        this.tipoPelicula = tipoPelicula;
        this.NombrePelicula = NombrePelicula;
        this.codigo = codigo;
        this.horaDeFuncion = horaDeFuncion;
    }

    @Override
    public String toString() {
        return "CinTicket{" + "tipoPelicula=" + tipoPelicula + ", NombrePelicula=" + NombrePelicula + ", codigo=" + codigo + ", horaDeFuncion=" + horaDeFuncion + '}';
    }

    public CinTicket() {
    }

    public String getTipoPelicula() {
        return tipoPelicula;
    }

    public void setTipoPelicula(String tipoPelicula) {
        this.tipoPelicula = tipoPelicula;
    }

    public String getNombrePelicula() {
        return NombrePelicula;
    }

    public void setNombrePelicula(String NombrePelicula) {
        this.NombrePelicula = NombrePelicula;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getHoraDeFuncion() {
        return horaDeFuncion;
    }

    public void setHoraDeFuncion(String horaDeFuncion) {
        this.horaDeFuncion = horaDeFuncion;
    }
    
    
}
