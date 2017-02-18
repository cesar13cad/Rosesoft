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
@Table(name = "producto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Producto.findAll", query = "SELECT p FROM Producto p")
    , @NamedQuery(name = "Producto.findByIdproducto", query = "SELECT p FROM Producto p WHERE p.idproducto = :idproducto")
    , @NamedQuery(name = "Producto.findByNombre", query = "SELECT p FROM Producto p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Producto.findByColor", query = "SELECT p FROM Producto p WHERE p.color = :color")})
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idproducto")
    private Integer idproducto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "color")
    private String color;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idproducto")
    private Collection<Ofrecimientosemanal> ofrecimientosemanalCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "producto")
    private Collection<Ofrecimientodiario> ofrecimientodiarioCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idproducto")
    private Collection<Corte> corteCollection;

    public Producto() {
    }

    public Producto(Integer idproducto) {
        this.idproducto = idproducto;
    }

    public Producto(Integer idproducto, String nombre, String color) {
        this.idproducto = idproducto;
        this.nombre = nombre;
        this.color = color;
    }

    public Integer getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Integer idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @XmlTransient
    public Collection<Ofrecimientosemanal> getOfrecimientosemanalCollection() {
        return ofrecimientosemanalCollection;
    }

    public void setOfrecimientosemanalCollection(Collection<Ofrecimientosemanal> ofrecimientosemanalCollection) {
        this.ofrecimientosemanalCollection = ofrecimientosemanalCollection;
    }

    @XmlTransient
    public Collection<Ofrecimientodiario> getOfrecimientodiarioCollection() {
        return ofrecimientodiarioCollection;
    }

    public void setOfrecimientodiarioCollection(Collection<Ofrecimientodiario> ofrecimientodiarioCollection) {
        this.ofrecimientodiarioCollection = ofrecimientodiarioCollection;
    }

    @XmlTransient
    public Collection<Corte> getCorteCollection() {
        return corteCollection;
    }

    public void setCorteCollection(Collection<Corte> corteCollection) {
        this.corteCollection = corteCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idproducto != null ? idproducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.idproducto == null && other.idproducto != null) || (this.idproducto != null && !this.idproducto.equals(other.idproducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rosesoft.model.Producto[ idproducto=" + idproducto + " ]";
    }
    
}
