/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.eventos.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author crist
 */
@Entity
@Table(name = "localidad_evento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LocalidadEvento.findAll", query = "SELECT l FROM LocalidadEvento l"),
    @NamedQuery(name = "LocalidadEvento.findById", query = "SELECT l FROM LocalidadEvento l WHERE l.id = :id"),
    @NamedQuery(name = "LocalidadEvento.findByIdEvento", query = "SELECT l FROM LocalidadEvento l WHERE l.idEvento = :idEvento"),
    @NamedQuery(name = "LocalidadEvento.findByIdLocalidad", query = "SELECT l FROM LocalidadEvento l WHERE l.idLocalidad = :idLocalidad")})
public class LocalidadEvento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "idEvento")
    private Integer idEvento;
    @Column(name = "idLocalidad")
    private Integer idLocalidad;

    public LocalidadEvento() {
    }

    public LocalidadEvento(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(Integer idEvento) {
        this.idEvento = idEvento;
    }

    public Integer getIdLocalidad() {
        return idLocalidad;
    }

    public void setIdLocalidad(Integer idLocalidad) {
        this.idLocalidad = idLocalidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LocalidadEvento)) {
            return false;
        }
        LocalidadEvento other = (LocalidadEvento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.proyecto.eventos.entity.LocalidadEvento[ id=" + id + " ]";
    }
    
}
