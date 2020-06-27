
package com.proyecto.eventos.controller;

import com.proyecto.eventos.entity.LocalidadEvento;
import com.proyecto.eventos.repository.LocalidadEventoRepository;
import com.proyecto.eventos.request.LocalidadEventoRequest;
import com.proyecto.eventos.response.LocalidadEventoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author crist
 */
@RequestMapping("/")
@RestController
public class LocalidadEventoController {
    @Autowired
    LocalidadEventoRepository localidadeventoRepository;
    @RequestMapping(
            value = "asignar",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public LocalidadEventoResponse asignarLocalidad(@RequestBody LocalidadEventoRequest request){
        LocalidadEvento nlocalidadevento = new LocalidadEvento();
        nlocalidadevento.setIdEvento(request.evento.idEvento);
        nlocalidadevento.setIdLocalidad(request.localidad.idLocalidad);
        localidadeventoRepository.save(nlocalidadevento);
        LocalidadEventoResponse response = new LocalidadEventoResponse ("ok");
        return response;
    }
}
