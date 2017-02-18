/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rosesoft.ejb;

import com.rosesoft.model.Semanas;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Asus
 */
@Stateless
public class SemanasFacade extends AbstractFacade<Semanas> implements SemanasFacadeLocal {

    @PersistenceContext(unitName = "Rosesoft1.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SemanasFacade() {
        super(Semanas.class);
    }
    
}
