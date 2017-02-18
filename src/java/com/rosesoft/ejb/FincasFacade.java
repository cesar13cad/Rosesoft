/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rosesoft.ejb;

import com.rosesoft.model.Fincas;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Asus
 */
@Stateless
public class FincasFacade extends AbstractFacade<Fincas> implements FincasFacadeLocal {

    @PersistenceContext(unitName = "Rosesoft1.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FincasFacade() {
        super(Fincas.class);
    }
    
}
