/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.eventos.actions;

import com.proyecto.eventos.entity.LocalidadEvento;
import java.util.List;

/**
 *
 * @author crist
 */
public class ComprobarAsignacion {
    private LocalidadEvento nAsignacion; 
    private List<LocalidadEvento> asignaciones;
    private boolean repetida = false; 

    public ComprobarAsignacion(LocalidadEvento nAsignacion, List<LocalidadEvento> asignaciones) {
        this.nAsignacion = nAsignacion;
        this.asignaciones = asignaciones;
    }
    
    public boolean asignacionRepetida(){
        for (int i = 0; i < asignaciones.size(); i++) {
            if(nAsignacion.getIdEvento().equals(asignaciones.get(i).getIdEvento()) && nAsignacion.getIdLocalidad().equals(asignaciones.get(i).getIdLocalidad()))
            {
                repetida = true;
            }
            
        }
        
        return this.repetida;
    }
    
}
