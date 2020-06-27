
package com.proyecto.eventos.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 *
 * @author crist
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class LocalidadEventoResponse {
     private String response;

    public LocalidadEventoResponse(String response) {
        this.response = response;
    }
     
    
}
