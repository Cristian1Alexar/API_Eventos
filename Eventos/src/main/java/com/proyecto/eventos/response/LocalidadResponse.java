
package com.proyecto.eventos.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.proyecto.eventos.dto.LocalidadDTO;
import lombok.Data;

/**
 *
 * @author crist
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class LocalidadResponse {
    private String response;
    @JsonProperty("localidad")
    private LocalidadDTO localidad;

    public LocalidadResponse(String response, LocalidadDTO localidad) {
        this.response = response;
        this.localidad = localidad;
    }
    
}
