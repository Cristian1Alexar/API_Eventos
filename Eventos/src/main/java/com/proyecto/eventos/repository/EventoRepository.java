/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.eventos.repository;

import com.proyecto.eventos.entity.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author crist
 */
@Repository
public interface EventoRepository extends JpaRepository<Evento, Integer> {
    
}
