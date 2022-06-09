/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Pais;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC-1
 */
public class PaisServicio implements IPaisServicio {
    
    private final List<Pais> capitanList = new ArrayList<>();
    
    public Pais crear(Pais pais) {
        this.capitanList.add(pais);
        return pais;
    }

    public List<Pais> listar() {
        return this.capitanList;
    }
    
}
