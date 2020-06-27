/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.eventos.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.proyecto.eventos.entity.Evento;
import com.proyecto.eventos.entity.Localidad;
import com.proyecto.eventos.repository.LocalidadEventoRepository;
import java.util.List;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author crist
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true) 
 
public class ListaEventosDTO {
    @JsonProperty("nombre")
    public String nombre;
    @JsonProperty("lugar")
    public String lugar;
    @JsonProperty("fecha")
    public String fecha;
    @JsonProperty("localidades")
    public List <String> localidades;

    public ListaEventosDTO(String nombre, String lugar, String fecha, List<String> localidades) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.fecha = fecha;
        this.localidades = localidades;
    }
    
}
