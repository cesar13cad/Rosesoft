/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rosesoft.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Asus
 */
@Embeddable
public class ProduccionPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idproduccion")
    private int idproduccion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idbloque")
    private int idbloque;

    public ProduccionPK() {
    }

    public ProduccionPK(int idproduccion, int idbloque) {
        this.idproduccion = idproduccion;
        this.idbloque = idbloque;
    }

    public int getIdproduccion() {
        return idproduccion;
    }

    public void setIdproduccion(int idproduccion) {
        this.idproduccion = idproduccion;
    }

    public int getIdbloque() {
        return idbloque;
    }

    public void setIdbloque(int idbloque) {
        this.idbloque = idbloque;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idproduccion;
        hash += (int) idbloque;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProduccionPK)) {
            return false;
        }
        ProduccionPK other = (ProduccionPK) object;
        if (this.idproduccion != other.idproduccion) {
            return false;
        }
        if (this.idbloque != other.idbloque) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rosesoft.model.ProduccionPK[ idproduccion=" + idproduccion + ", idbloque=" + idbloque + " ]";
    }
    
}
