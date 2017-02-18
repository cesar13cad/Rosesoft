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
@Table(name = "tipocorte")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipocorte.findAll", query = "SELECT t FROM Tipocorte t")
    , @NamedQuery(name = "Tipocorte.findByIdtipocorte", query = "SELECT t FROM Tipocorte t WHERE t.idtipocorte = :idtipocorte")
    , @NamedQuery(name = "Tipocorte.findByNombre", query = "SELECT t FROM Tipocorte t WHERE t.nombre = :nombre")})
public class Tipocorte implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtipocorte")
    private Integer idtipocorte;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtipocorte")
    private Collection<Corte> corteCollection;

    public Tipocorte() {
    }

    public Tipocorte(Integer idtipocorte) {
        this.idtipocorte = idtipocorte;
    }

    public Tipocorte(Integer idtipocorte, String nombre) {
        this.idtipocorte = idtipocorte;
        this.nombre = nombre;
    }

    public Integer getIdtipocorte() {
        return idtipocorte;
    }

    public void setIdtipocorte(Integer idtipocorte) {
        this.idtipocorte = idtipocorte;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipocorte != null ? idtipocorte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipocorte)) {
            return false;
        }
        Tipocorte other = (Tipocorte) object;
        if ((this.idtipocorte == null && other.idtipocorte != null) || (this.idtipocorte != null && !this.idtipocorte.equals(other.idtipocorte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rosesoft.model.Tipocorte[ idtipocorte=" + idtipocorte + " ]";
    }
    
}
