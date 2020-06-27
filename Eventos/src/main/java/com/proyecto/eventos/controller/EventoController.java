/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.eventos.controller;

import com.proyecto.eventos.actions.ListarEventos;
import com.proyecto.eventos.dto.ListaEventosDTO;
import com.proyecto.eventos.entity.Evento;
import com.proyecto.eventos.entity.Localidad;
import com.proyecto.eventos.entity.LocalidadEvento;
import com.proyecto.eventos.repository.EventoRepository;
import com.proyecto.eventos.request.EventoRequest;
import com.proyecto.eventos.exceptions.EventoNotFoundException;
import com.proyecto.eventos.repository.LocalidadEventoRepository;
import com.proyecto.eventos.repository.LocalidadRepository;
import com.proyecto.eventos.response.EventoResponse;
import com.proyecto.eventos.response.ListaEventosResponse;
import java.net.http.HttpResponse;
import java.util.List;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
public class EventoController {
    @Autowired
    EventoRepository eventoRepository;
    @Autowired
    LocalidadRepository localidadRepository;
    @Autowired 
    LocalidadEventoRepository localidadeventoRepository;
    
    @RequestMapping(
            value = "evento/crear",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public EventoResponse registrarEvento(@RequestBody EventoRequest request) throws Error{
        System.out.println("Registrar");
        System.out.println("Request " + request);
        
        Evento nevento = new Evento();
        nevento.setNombre(request.evento.nombre);
        nevento.setLugar(request.evento.lugar);
        nevento.setFecha(request.evento.fecha);
        eventoRepository.save(nevento);
        EventoResponse response = new EventoResponse("ok", request.evento);
        return response;
    }
    
    @RequestMapping(
            value = "evento/lista",
            method = RequestMethod.GET)
    public ListaEventosResponse getAllEventos() throws Error {
        List<Localidad> localidades = localidadRepository.findAll(); 
        List<LocalidadEvento> asignacion = localidadeventoRepository.findAll(); 
        List<Evento> eventos = eventoRepository.findAll();
        ListarEventos l = new ListarEventos(localidades, asignacion, eventos);      
        return l.listar();
    }
    @GetMapping("evento/{id}")
    public Evento getEventoById(@PathVariable(value = "id") Integer eventoId) throws EventoNotFoundException {
        return eventoRepository.findById(eventoId)
                .orElseThrow(() -> new EventoNotFoundException(eventoId));
    }
}
