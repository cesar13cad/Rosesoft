/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rosesoft.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Asus
 */
@Entity
@Table(name = "ofrecimientosemanal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ofrecimientosemanal.findAll", query = "SELECT o FROM Ofrecimientosemanal o")
    , @NamedQuery(name = "Ofrecimientosemanal.findByIdOfrecimientoSemanal", query = "SELECT o FROM Ofrecimientosemanal o WHERE o.idOfrecimientoSemanal = :idOfrecimientoSemanal")
    , @NamedQuery(name = "Ofrecimientosemanal.findByCantidad", query = "SELECT o FROM Ofrecimientosemanal o WHERE o.cantidad = :cantidad")})
public class Ofrecimientosemanal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idOfrecimientoSemanal")
    private Integer idOfrecimientoSemanal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private int cantidad;
    @JoinColumn(name = "idproducto", referencedColumnName = "idproducto")
    @ManyToOne(optional = false)
    private Producto idproducto;
    @JoinColumn(name = "idSemanas", referencedColumnName = "idSemanas")
    @ManyToOne(optional = false)
    private Semanas idSemanas;

    public Ofrecimientosemanal() {
    }

    public Ofrecimientosemanal(Integer idOfrecimientoSemanal) {
        this.idOfrecimientoSemanal = idOfrecimientoSemanal;
    }

    public Ofrecimientosemanal(Integer idOfrecimientoSemanal, int cantidad) {
        this.idOfrecimientoSemanal = idOfrecimientoSemanal;
        this.cantidad = cantidad;
    }

    public Integer getIdOfrecimientoSemanal() {
        return idOfrecimientoSemanal;
    }

    public void setIdOfrecimientoSemanal(Integer idOfrecimientoSemanal) {
        this.idOfrecimientoSemanal = idOfrecimientoSemanal;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Producto idproducto) {
        this.idproducto = idproducto;
    }

    public Semanas getIdSemanas() {
        return idSemanas;
    }

    public void setIdSemanas(Semanas idSemanas) {
        this.idSemanas = idSemanas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOfrecimientoSemanal != null ? idOfrecimientoSemanal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ofrecimientosemanal)) {
            return false;
        }
        Ofrecimientosemanal other = (Ofrecimientosemanal) object;
        if ((this.idOfrecimientoSemanal == null && other.idOfrecimientoSemanal != null) || (this.idOfrecimientoSemanal != null && !this.idOfrecimientoSemanal.equals(other.idOfrecimientoSemanal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rosesoft.model.Ofrecimientosemanal[ idOfrecimientoSemanal=" + idOfrecimientoSemanal + " ]";
    }
    
}
