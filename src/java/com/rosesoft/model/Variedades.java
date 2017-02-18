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
@Table(name = "variedades")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Variedades.findAll", query = "SELECT v FROM Variedades v")
    , @NamedQuery(name = "Variedades.findByIdvariedades", query = "SELECT v FROM Variedades v WHERE v.idvariedades = :idvariedades")
    , @NamedQuery(name = "Variedades.findByNombre", query = "SELECT v FROM Variedades v WHERE v.nombre = :nombre")
    , @NamedQuery(name = "Variedades.findByGrado", query = "SELECT v FROM Variedades v WHERE v.grado = :grado")
    , @NamedQuery(name = "Variedades.findByCantidadXramo", query = "SELECT v FROM Variedades v WHERE v.cantidadXramo = :cantidadXramo")})
public class Variedades implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idvariedades")
    private Integer idvariedades;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "grado")
    private int grado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidadXramo")
    private int cantidadXramo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idvariedades")
    private Collection<Clasificacion> clasificacionCollection;

    public Variedades() {
    }

    public Variedades(Integer idvariedades) {
        this.idvariedades = idvariedades;
    }

    public Variedades(Integer idvariedades, String nombre, int grado, int cantidadXramo) {
        this.idvariedades = idvariedades;
        this.nombre = nombre;
        this.grado = grado;
        this.cantidadXramo = cantidadXramo;
    }

    public Integer getIdvariedades() {
        return idvariedades;
    }

    public void setIdvariedades(Integer idvariedades) {
        this.idvariedades = idvariedades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public int getCantidadXramo() {
        return cantidadXramo;
    }

    public void setCantidadXramo(int cantidadXramo) {
        this.cantidadXramo = cantidadXramo;
    }

    @XmlTransient
    public Collection<Clasificacion> getClasificacionCollection() {
        return clasificacionCollection;
    }

    public void setClasificacionCollection(Collection<Clasificacion> clasificacionCollection) {
        this.clasificacionCollection = clasificacionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idvariedades != null ? idvariedades.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Variedades)) {
            return false;
        }
        Variedades other = (Variedades) object;
        if ((this.idvariedades == null && other.idvariedades != null) || (this.idvariedades != null && !this.idvariedades.equals(other.idvariedades))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rosesoft.model.Variedades[ idvariedades=" + idvariedades + " ]";
    }
    
}
