/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.eventos.exceptions;

/**
 *
 * @author crist
 */
public class EventoNotFoundException extends Exception {
    private Integer evento_id;
    public EventoNotFoundException(Integer evento_id) {
        super(String.format("No se encontró el evento con id : '%s'", evento_id));
        }
}
