/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Pais;
import Servicio.PaisServicio;
import java.util.List;

/**
 *
 * @author PC-1
 */
public class PaisControl {
    
    private final PaisServicio paisServicio = new PaisServicio();
    
    public Pais crear(String [] params){
        var pais = new Pais(Integer.valueOf(params[0]),params[1]);
        this.paisServicio.crear(pais);
        return pais;
    }
    
    public List<Pais> listar()
    {
        return this.paisServicio.listar();
    }
    
}
