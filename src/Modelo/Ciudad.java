/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author PC-1
 */
public class Ciudad {
    
    private String luagresReconcoidos;
    private String lugaresMasVisitados;
    private Pais unpais;

    public String getLuagresReconcoidos() {
        return luagresReconcoidos;
    }

    public void setLuagresReconcoidos(String luagresReconcoidos) {
        this.luagresReconcoidos = luagresReconcoidos;
    }

    public String getLugaresMasVisitados() {
        return lugaresMasVisitados;
    }

    public void setLugaresMasVisitados(String lugaresMasVisitados) {
        this.lugaresMasVisitados = lugaresMasVisitados;
    }

    public Pais getUnpais() {
        return unpais;
    }

    public void setUnpais(Pais unpais) {
        this.unpais = unpais;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "luagresReconcoidos=" + luagresReconcoidos + ", lugaresMasVisitados=" + lugaresMasVisitados + ", unpais=" + unpais + '}';
    }

 
    
}
