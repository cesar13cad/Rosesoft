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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "bloque")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bloque.findAll", query = "SELECT b FROM Bloque b")
    , @NamedQuery(name = "Bloque.findByIdbloque", query = "SELECT b FROM Bloque b WHERE b.idbloque = :idbloque")
    , @NamedQuery(name = "Bloque.findByNombre", query = "SELECT b FROM Bloque b WHERE b.nombre = :nombre")})
public class Bloque implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idbloque")
    private Integer idbloque;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idbloque")
    private Collection<Corte> corteCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bloque")
    private Collection<Produccion> produccionCollection;

    public Bloque() {
    }

    public Bloque(Integer idbloque) {
        this.idbloque = idbloque;
    }

    public Bloque(Integer idbloque, String nombre) {
        this.idbloque = idbloque;
        this.nombre = nombre;
    }

    public Integer getIdbloque() {
        return idbloque;
    }

    public void setIdbloque(Integer idbloque) {
        this.idbloque = idbloque;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public Collection<Corte> getCorteCollection() {
        return corteCollection;
    }

    public void setCorteCollection(Collection<Corte> corteCollection) {
        this.corteCollection = corteCollection;
    }

    @XmlTransient
    public Collection<Produccion> getProduccionCollection() {
        return produccionCollection;
    }

    public void setProduccionCollection(Collection<Produccion> produccionCollection) {
        this.produccionCollection = produccionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idbloque != null ? idbloque.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bloque)) {
            return false;
        }
        Bloque other = (Bloque) object;
        if ((this.idbloque == null && other.idbloque != null) || (this.idbloque != null && !this.idbloque.equals(other.idbloque))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rosesoft.model.Bloque[ idbloque=" + idbloque + " ]";
    }
    
}
