
package com.proyecto.eventos.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.proyecto.eventos.entity.LocalidadEvento;
import java.util.List;
import lombok.Data;

/**
 *
 * @author crist
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true) 
public class EventoResponseDTO {
    @JsonProperty("nombre")
    public String nombre;
    @JsonProperty("lugar")
    public String lugar;
    @JsonProperty("fecha")
    public String fecha;
    @JsonProperty("localidades")
    public List<LocalidadEvento> localidades;
    
}
