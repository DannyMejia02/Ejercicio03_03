/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author PC-1
 */
public class Canton {
    
    private String lugaresPorVisitar;
    private String lugaresDeVenta;
    private Pais unPais;
    private Ciudad unaCiudad;

    public String getLugaresPorVisitar() {
        return lugaresPorVisitar;
    }

    public void setLugaresPorVisitar(String lugaresPorVisitar) {
        this.lugaresPorVisitar = lugaresPorVisitar;
    }

    public String getLugaresDeVenta() {
        return lugaresDeVenta;
    }

    public void setLugaresDeVenta(String lugaresDeVenta) {
        this.lugaresDeVenta = lugaresDeVenta;
    }

    public Pais getUnPais() {
        return unPais;
    }

    public void setUnPais(Pais unPais) {
        this.unPais = unPais;
    }

    public Ciudad getUnaCiudad() {
        return unaCiudad;
    }

    public void setUnaCiudad(Ciudad unaCiudad) {
        this.unaCiudad = unaCiudad;
    }

    @Override
    public String toString() {
        return "Canton{" + "lugaresPorVisitar=" + lugaresPorVisitar + ", lugaresDeVenta=" + lugaresDeVenta + ", unPais=" + unPais + ", unaCiudad=" + unaCiudad + '}';
    }
    
    
    
}
