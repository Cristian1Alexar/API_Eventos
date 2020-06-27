/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.eventos.controller;

import com.proyecto.eventos.entity.Localidad;
import com.proyecto.eventos.repository.LocalidadRepository;
import com.proyecto.eventos.request.LocalidadRequest;
import com.proyecto.eventos.response.LocalidadResponse;
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
public class LocalidadController {
    @Autowired
    LocalidadRepository localidadRepository;
    @RequestMapping(
            value = "localidad/crear",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public LocalidadResponse registrarLocalidad (@RequestBody LocalidadRequest request){
        System.out.println("Registrar");
        System.out.println("Request " + request);
        Localidad nlocalidad = new Localidad();
        nlocalidad.setNombre(request.localidad.nombre);
        localidadRepository.save(nlocalidad);
        LocalidadResponse response = new LocalidadResponse("ok", request.localidad);
        return response;
    }
    
}
