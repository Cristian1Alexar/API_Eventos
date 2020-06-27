
package com.proyecto.eventos.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.proyecto.eventos.dto.EventoDTO;
import com.proyecto.eventos.dto.ListaEventosDTO;
import com.proyecto.eventos.entity.Evento;
import java.util.List;
import lombok.Data;

/**
 *
 * @author crist
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListaEventosResponse {
    private String response;
    @JsonProperty("eventos")
    private List<ListaEventosDTO> eventos;

    public ListaEventosResponse(String response, List<ListaEventosDTO> eventos) {
        this.response = response;
        this.eventos = eventos;
    }
    
    
}
