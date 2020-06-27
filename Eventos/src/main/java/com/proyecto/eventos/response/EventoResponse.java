
package com.proyecto.eventos.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.proyecto.eventos.dto.EventoDTO;
import com.proyecto.eventos.entity.Localidad;
import java.util.List;
import lombok.Data;

/**
 *
 * @author crist
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class EventoResponse {
    private String response;
    @JsonProperty("evento")
    private EventoDTO evento;

    public EventoResponse(String response, EventoDTO evento) {
        this.response = response;
        this.evento = evento;
    }
    
    
}

