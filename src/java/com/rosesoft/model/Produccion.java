/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rosesoft.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Asus
 */
@Entity
@Table(name = "produccion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Produccion.findAll", query = "SELECT p FROM Produccion p")
    , @NamedQuery(name = "Produccion.findByIdproduccion", query = "SELECT p FROM Produccion p WHERE p.produccionPK.idproduccion = :idproduccion")
    , @NamedQuery(name = "Produccion.findByFechatarea", query = "SELECT p FROM Produccion p WHERE p.fechatarea = :fechatarea")
    , @NamedQuery(name = "Produccion.findByIdbloque", query = "SELECT p FROM Produccion p WHERE p.produccionPK.idbloque = :idbloque")
    , @NamedQuery(name = "Produccion.findByEstado", query = "SELECT p FROM Produccion p WHERE p.estado = :estado")
    , @NamedQuery(name = "Produccion.findByNota", query = "SELECT p FROM Produccion p WHERE p.nota = :nota")})
public class Produccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProduccionPK produccionPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechatarea")
    @Temporal(TemporalType.DATE)
    private Date fechatarea;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 9)
    @Column(name = "estado")
    private String estado;
    @Size(max = 64)
    @Column(name = "Nota")
    private String nota;
    @JoinColumn(name = "idbloque", referencedColumnName = "idbloque", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Bloque bloque;
    @JoinColumn(name = "idempleado", referencedColumnName = "idempleado")
    @ManyToOne(optional = false)
    private Empleado idempleado;
    @JoinColumn(name = "idTarea", referencedColumnName = "idTarea")
    @ManyToOne(optional = false)
    private Tarea idTarea;

    public Produccion() {
    }

    public Produccion(ProduccionPK produccionPK) {
        this.produccionPK = produccionPK;
    }

    public Produccion(ProduccionPK produccionPK, Date fechatarea, String estado) {
        this.produccionPK = produccionPK;
        this.fechatarea = fechatarea;
        this.estado = estado;
    }

    public Produccion(int idproduccion, int idbloque) {
        this.produccionPK = new ProduccionPK(idproduccion, idbloque);
    }

    public ProduccionPK getProduccionPK() {
        return produccionPK;
    }

    public void setProduccionPK(ProduccionPK produccionPK) {
        this.produccionPK = produccionPK;
    }

    public Date getFechatarea() {
        return fechatarea;
    }

    public void setFechatarea(Date fechatarea) {
        this.fechatarea = fechatarea;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public Bloque getBloque() {
        return bloque;
    }

    public void setBloque(Bloque bloque) {
        this.bloque = bloque;
    }

    public Empleado getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(Empleado idempleado) {
        this.idempleado = idempleado;
    }

    public Tarea getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(Tarea idTarea) {
        this.idTarea = idTarea;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (produccionPK != null ? produccionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produccion)) {
            return false;
        }
        Produccion other = (Produccion) object;
        if ((this.produccionPK == null && other.produccionPK != null) || (this.produccionPK != null && !this.produccionPK.equals(other.produccionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rosesoft.model.Produccion[ produccionPK=" + produccionPK + " ]";
    }
    
}
