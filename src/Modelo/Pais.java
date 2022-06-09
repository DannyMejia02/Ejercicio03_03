/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author PC-1
 */
public class Pais {
    
    private String lugaresTuristicos;
    private String lugaresMasVisitados;

    public Pais(Integer valueOf, String param) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getLugaresTuristicos() {
        return lugaresTuristicos;
    }

    public void setLugaresTuristicos(String lugaresTuristicos) {
        this.lugaresTuristicos = lugaresTuristicos;
    }

    public String getLugaresMasVisitados() {
        return lugaresMasVisitados;
    }

    public void setLugaresMasVisitados(String lugaresMasVisitados) {
        this.lugaresMasVisitados = lugaresMasVisitados;
    }

    @Override
    public String toString() {
        return "Pais{" + "lugaresTuristicos=" + lugaresTuristicos + ", lugaresMasVisitados=" + lugaresMasVisitados + '}';
    }
    
    
    
}
