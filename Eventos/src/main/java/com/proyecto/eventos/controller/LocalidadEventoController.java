
package com.proyecto.eventos.controller;

import com.proyecto.eventos.actions.ComprobarAsignacion;
import com.proyecto.eventos.entity.LocalidadEvento;
import com.proyecto.eventos.repository.EventoRepository;
import com.proyecto.eventos.repository.LocalidadEventoRepository;
import com.proyecto.eventos.repository.LocalidadRepository;
import com.proyecto.eventos.request.LocalidadEventoRequest;
import com.proyecto.eventos.response.LocalidadEventoResponse;
import java.util.List;
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
    @Autowired
    EventoRepository eventoRepository;
    @Autowired
    LocalidadRepository localidadRepository;
    @RequestMapping(
            value = "asignar",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public LocalidadEventoResponse asignarLocalidad(@RequestBody LocalidadEventoRequest request){
        List<LocalidadEvento> localidadesAsignadas= localidadeventoRepository.findAll();
        LocalidadEvento nlocalidadevento = new LocalidadEvento(request.getEvento().getIdEvento(), request.getLocalidad().getIdLocalidad() );
        ComprobarAsignacion comprobar = new ComprobarAsignacion(nlocalidadevento, localidadesAsignadas);
        if((nlocalidadevento.getIdEvento() <= eventoRepository.findAll().size()) && (nlocalidadevento.getIdLocalidad() <= localidadRepository.findAll().size()))
        {
            if (!comprobar.asignacionRepetida())
            {
                localidadeventoRepository.save(nlocalidadevento);
                LocalidadEventoResponse response = new LocalidadEventoResponse ("ok");
                return response;
            }
            else
            {
                LocalidadEventoResponse response = new LocalidadEventoResponse ("El evento ya tiene asignada la localidad que intenta asignarle");
                return response;
            }
        }
        else 
        {
            LocalidadEventoResponse response = new LocalidadEventoResponse ("Esta intentando asignar un evento/localidad inexistente");
            return response;
        }
        
         
    }
}
