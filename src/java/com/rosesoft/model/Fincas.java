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
@Table(name = "fincas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fincas.findAll", query = "SELECT f FROM Fincas f")
    , @NamedQuery(name = "Fincas.findByIdfincas", query = "SELECT f FROM Fincas f WHERE f.idfincas = :idfincas")
    , @NamedQuery(name = "Fincas.findByNombre", query = "SELECT f FROM Fincas f WHERE f.nombre = :nombre")
    , @NamedQuery(name = "Fincas.findByTelefono", query = "SELECT f FROM Fincas f WHERE f.telefono = :telefono")
    , @NamedQuery(name = "Fincas.findByDireccion", query = "SELECT f FROM Fincas f WHERE f.direccion = :direccion")
    , @NamedQuery(name = "Fincas.findByContacto", query = "SELECT f FROM Fincas f WHERE f.contacto = :contacto")})
public class Fincas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idfincas")
    private Integer idfincas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "telefono")
    private int telefono;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "direccion")
    private String direccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "contacto")
    private String contacto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idfincas")
    private Collection<Clasificacion> clasificacionCollection;

    public Fincas() {
    }

    public Fincas(Integer idfincas) {
        this.idfincas = idfincas;
    }

    public Fincas(Integer idfincas, String nombre, int telefono, String direccion, String contacto) {
        this.idfincas = idfincas;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.contacto = contacto;
    }

    public Integer getIdfincas() {
        return idfincas;
    }

    public void setIdfincas(Integer idfincas) {
        this.idfincas = idfincas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
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
        hash += (idfincas != null ? idfincas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fincas)) {
            return false;
        }
        Fincas other = (Fincas) object;
        if ((this.idfincas == null && other.idfincas != null) || (this.idfincas != null && !this.idfincas.equals(other.idfincas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rosesoft.model.Fincas[ idfincas=" + idfincas + " ]";
    }
    
}
