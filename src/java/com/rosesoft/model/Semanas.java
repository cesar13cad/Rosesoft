/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rosesoft.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Asus
 */
@Entity
@Table(name = "semanas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Semanas.findAll", query = "SELECT s FROM Semanas s")
    , @NamedQuery(name = "Semanas.findByIdSemanas", query = "SELECT s FROM Semanas s WHERE s.idSemanas = :idSemanas")
    , @NamedQuery(name = "Semanas.findBySemana", query = "SELECT s FROM Semanas s WHERE s.semana = :semana")})
public class Semanas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idSemanas")
    private Integer idSemanas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "semana")
    private String semana;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSemanas")
    private Collection<Ofrecimientosemanal> ofrecimientosemanalCollection;

    public Semanas() {
    }

    public Semanas(Integer idSemanas) {
        this.idSemanas = idSemanas;
    }

    public Semanas(Integer idSemanas, String semana) {
        this.idSemanas = idSemanas;
        this.semana = semana;
    }

    public Integer getIdSemanas() {
        return idSemanas;
    }

    public void setIdSemanas(Integer idSemanas) {
        this.idSemanas = idSemanas;
    }

    public String getSemana() {
        return semana;
    }

    public void setSemana(String semana) {
        this.semana = semana;
    }

    @XmlTransient
    public Collection<Ofrecimientosemanal> getOfrecimientosemanalCollection() {
        return ofrecimientosemanalCollection;
    }

    public void setOfrecimientosemanalCollection(Collection<Ofrecimientosemanal> ofrecimientosemanalCollection) {
        this.ofrecimientosemanalCollection = ofrecimientosemanalCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSemanas != null ? idSemanas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Semanas)) {
            return false;
        }
        Semanas other = (Semanas) object;
        if ((this.idSemanas == null && other.idSemanas != null) || (this.idSemanas != null && !this.idSemanas.equals(other.idSemanas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rosesoft.model.Semanas[ idSemanas=" + idSemanas + " ]";
    }
    
}
