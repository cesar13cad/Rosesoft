/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rosesoft.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Asus
 */
@Entity
@Table(name = "clasificacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clasificacion.findAll", query = "SELECT c FROM Clasificacion c")
    , @NamedQuery(name = "Clasificacion.findByIdclasificacion", query = "SELECT c FROM Clasificacion c WHERE c.idclasificacion = :idclasificacion")
    , @NamedQuery(name = "Clasificacion.findByFechaclasificacion", query = "SELECT c FROM Clasificacion c WHERE c.fechaclasificacion = :fechaclasificacion")
    , @NamedQuery(name = "Clasificacion.findByDegrado", query = "SELECT c FROM Clasificacion c WHERE c.degrado = :degrado")})
public class Clasificacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idclasificacion")
    private Integer idclasificacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaclasificacion")
    @Temporal(TemporalType.DATE)
    private Date fechaclasificacion;
    @Column(name = "degrado")
    private Integer degrado;
    @JoinTable(name = "corteclasificacion", joinColumns = {
        @JoinColumn(name = "fkClasificacionCorte", referencedColumnName = "idclasificacion")}, inverseJoinColumns = {
        @JoinColumn(name = "fkCorteClasificacion", referencedColumnName = "idcorte")})
    @ManyToMany
    private Collection<Corte> corteCollection;
    @JoinColumn(name = "idalerta", referencedColumnName = "idalerta")
    @ManyToOne(optional = false)
    private Alerta idalerta;
    @JoinColumn(name = "idfincas", referencedColumnName = "idfincas")
    @ManyToOne(optional = false)
    private Fincas idfincas;
    @JoinColumn(name = "idvariedades", referencedColumnName = "idvariedades")
    @ManyToOne(optional = false)
    private Variedades idvariedades;

    public Clasificacion() {
    }

    public Clasificacion(Integer idclasificacion) {
        this.idclasificacion = idclasificacion;
    }

    public Clasificacion(Integer idclasificacion, Date fechaclasificacion) {
        this.idclasificacion = idclasificacion;
        this.fechaclasificacion = fechaclasificacion;
    }

    public Integer getIdclasificacion() {
        return idclasificacion;
    }

    public void setIdclasificacion(Integer idclasificacion) {
        this.idclasificacion = idclasificacion;
    }

    public Date getFechaclasificacion() {
        return fechaclasificacion;
    }

    public void setFechaclasificacion(Date fechaclasificacion) {
        this.fechaclasificacion = fechaclasificacion;
    }

    public Integer getDegrado() {
        return degrado;
    }

    public void setDegrado(Integer degrado) {
        this.degrado = degrado;
    }

    @XmlTransient
    public Collection<Corte> getCorteCollection() {
        return corteCollection;
    }

    public void setCorteCollection(Collection<Corte> corteCollection) {
        this.corteCollection = corteCollection;
    }

    public Alerta getIdalerta() {
        return idalerta;
    }

    public void setIdalerta(Alerta idalerta) {
        this.idalerta = idalerta;
    }

    public Fincas getIdfincas() {
        return idfincas;
    }

    public void setIdfincas(Fincas idfincas) {
        this.idfincas = idfincas;
    }

    public Variedades getIdvariedades() {
        return idvariedades;
    }

    public void setIdvariedades(Variedades idvariedades) {
        this.idvariedades = idvariedades;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idclasificacion != null ? idclasificacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clasificacion)) {
            return false;
        }
        Clasificacion other = (Clasificacion) object;
        if ((this.idclasificacion == null && other.idclasificacion != null) || (this.idclasificacion != null && !this.idclasificacion.equals(other.idclasificacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rosesoft.model.Clasificacion[ idclasificacion=" + idclasificacion + " ]";
    }
    
}
