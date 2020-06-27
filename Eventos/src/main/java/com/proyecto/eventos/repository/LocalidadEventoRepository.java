/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.eventos.repository;

import com.proyecto.eventos.entity.LocalidadEvento;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author crist
 */
public interface LocalidadEventoRepository extends JpaRepository<LocalidadEvento, Integer> {
    
}
