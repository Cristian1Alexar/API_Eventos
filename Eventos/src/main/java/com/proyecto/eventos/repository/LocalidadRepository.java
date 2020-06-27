/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.eventos.repository;

import com.proyecto.eventos.entity.Localidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author crist
 */
@Repository
public interface LocalidadRepository extends JpaRepository<Localidad, Integer> {
    
}
