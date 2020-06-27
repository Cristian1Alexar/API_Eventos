/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.eventos.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.proyecto.eventos.dto.EventoIdDTO;
import com.proyecto.eventos.dto.LocalidadIdDTO;
import lombok.Data;

/**
 *
 * @author crist
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class LocalidadEventoRequest {
    @JsonProperty("localidad")
    public LocalidadIdDTO localidad;
    @JsonProperty("evento")
    public EventoIdDTO evento;
    
}
