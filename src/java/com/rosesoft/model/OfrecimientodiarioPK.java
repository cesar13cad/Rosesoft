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
public class OfrecimientodiarioPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idofrecimiento")
    private int idofrecimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idproducto")
    private int idproducto;

    public OfrecimientodiarioPK() {
    }

    public OfrecimientodiarioPK(int idofrecimiento, int idproducto) {
        this.idofrecimiento = idofrecimiento;
        this.idproducto = idproducto;
    }

    public int getIdofrecimiento() {
        return idofrecimiento;
    }

    public void setIdofrecimiento(int idofrecimiento) {
        this.idofrecimiento = idofrecimiento;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idofrecimiento;
        hash += (int) idproducto;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OfrecimientodiarioPK)) {
            return false;
        }
        OfrecimientodiarioPK other = (OfrecimientodiarioPK) object;
        if (this.idofrecimiento != other.idofrecimiento) {
            return false;
        }
        if (this.idproducto != other.idproducto) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rosesoft.model.OfrecimientodiarioPK[ idofrecimiento=" + idofrecimiento + ", idproducto=" + idproducto + " ]";
    }
    
}
