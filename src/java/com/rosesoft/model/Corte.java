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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Asus
 */
@Entity
@Table(name = "corte")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Corte.findAll", query = "SELECT c FROM Corte c")
    , @NamedQuery(name = "Corte.findByIdcorte", query = "SELECT c FROM Corte c WHERE c.idcorte = :idcorte")
    , @NamedQuery(name = "Corte.findByFecha", query = "SELECT c FROM Corte c WHERE c.fecha = :fecha")
    , @NamedQuery(name = "Corte.findByEstado", query = "SELECT c FROM Corte c WHERE c.estado = :estado")
    , @NamedQuery(name = "Corte.findByCantidad", query = "SELECT c FROM Corte c WHERE c.cantidad = :cantidad")})
public class Corte implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcorte")
    private Integer idcorte;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Size(max = 8)
    @Column(name = "estado")
    private String estado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private int cantidad;
    @ManyToMany(mappedBy = "corteCollection")
    private Collection<Clasificacion> clasificacionCollection;
    @JoinColumn(name = "idbloque", referencedColumnName = "idbloque")
    @ManyToOne(optional = false)
    private Bloque idbloque;
    @JoinColumn(name = "idproducto", referencedColumnName = "idproducto")
    @ManyToOne(optional = false)
    private Producto idproducto;
    @JoinColumn(name = "idtipocorte", referencedColumnName = "idtipocorte")
    @ManyToOne(optional = false)
    private Tipocorte idtipocorte;

    public Corte() {
    }

    public Corte(Integer idcorte) {
        this.idcorte = idcorte;
    }

    public Corte(Integer idcorte, Date fecha, int cantidad) {
        this.idcorte = idcorte;
        this.fecha = fecha;
        this.cantidad = cantidad;
    }

    public Integer getIdcorte() {
        return idcorte;
    }

    public void setIdcorte(Integer idcorte) {
        this.idcorte = idcorte;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @XmlTransient
    public Collection<Clasificacion> getClasificacionCollection() {
        return clasificacionCollection;
    }

    public void setClasificacionCollection(Collection<Clasificacion> clasificacionCollection) {
        this.clasificacionCollection = clasificacionCollection;
    }

    public Bloque getIdbloque() {
        return idbloque;
    }

    public void setIdbloque(Bloque idbloque) {
        this.idbloque = idbloque;
    }

    public Producto getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Producto idproducto) {
        this.idproducto = idproducto;
    }

    public Tipocorte getIdtipocorte() {
        return idtipocorte;
    }

    public void setIdtipocorte(Tipocorte idtipocorte) {
        this.idtipocorte = idtipocorte;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcorte != null ? idcorte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Corte)) {
            return false;
        }
        Corte other = (Corte) object;
        if ((this.idcorte == null && other.idcorte != null) || (this.idcorte != null && !this.idcorte.equals(other.idcorte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rosesoft.model.Corte[ idcorte=" + idcorte + " ]";
    }
    
}
