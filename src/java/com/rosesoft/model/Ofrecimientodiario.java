/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rosesoft.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Asus
 */
@Entity
@Table(name = "ofrecimientodiario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ofrecimientodiario.findAll", query = "SELECT o FROM Ofrecimientodiario o")
    , @NamedQuery(name = "Ofrecimientodiario.findByIdofrecimiento", query = "SELECT o FROM Ofrecimientodiario o WHERE o.ofrecimientodiarioPK.idofrecimiento = :idofrecimiento")
    , @NamedQuery(name = "Ofrecimientodiario.findByFechaofrecimiento", query = "SELECT o FROM Ofrecimientodiario o WHERE o.fechaofrecimiento = :fechaofrecimiento")
    , @NamedQuery(name = "Ofrecimientodiario.findByIdproducto", query = "SELECT o FROM Ofrecimientodiario o WHERE o.ofrecimientodiarioPK.idproducto = :idproducto")
    , @NamedQuery(name = "Ofrecimientodiario.findByCantidad", query = "SELECT o FROM Ofrecimientodiario o WHERE o.cantidad = :cantidad")})
public class Ofrecimientodiario implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OfrecimientodiarioPK ofrecimientodiarioPK;
    @Column(name = "fechaofrecimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaofrecimiento;
    @Column(name = "cantidad")
    private Integer cantidad;
    @JoinColumn(name = "idproducto", referencedColumnName = "idproducto", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Producto producto;

    public Ofrecimientodiario() {
    }

    public Ofrecimientodiario(OfrecimientodiarioPK ofrecimientodiarioPK) {
        this.ofrecimientodiarioPK = ofrecimientodiarioPK;
    }

    public Ofrecimientodiario(int idofrecimiento, int idproducto) {
        this.ofrecimientodiarioPK = new OfrecimientodiarioPK(idofrecimiento, idproducto);
    }

    public OfrecimientodiarioPK getOfrecimientodiarioPK() {
        return ofrecimientodiarioPK;
    }

    public void setOfrecimientodiarioPK(OfrecimientodiarioPK ofrecimientodiarioPK) {
        this.ofrecimientodiarioPK = ofrecimientodiarioPK;
    }

    public Date getFechaofrecimiento() {
        return fechaofrecimiento;
    }

    public void setFechaofrecimiento(Date fechaofrecimiento) {
        this.fechaofrecimiento = fechaofrecimiento;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ofrecimientodiarioPK != null ? ofrecimientodiarioPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ofrecimientodiario)) {
            return false;
        }
        Ofrecimientodiario other = (Ofrecimientodiario) object;
        if ((this.ofrecimientodiarioPK == null && other.ofrecimientodiarioPK != null) || (this.ofrecimientodiarioPK != null && !this.ofrecimientodiarioPK.equals(other.ofrecimientodiarioPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rosesoft.model.Ofrecimientodiario[ ofrecimientodiarioPK=" + ofrecimientodiarioPK + " ]";
    }
    
}
