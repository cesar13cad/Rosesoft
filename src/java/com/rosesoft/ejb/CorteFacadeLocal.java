/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rosesoft.ejb;

import com.rosesoft.model.Corte;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Asus
 */
@Local
public interface CorteFacadeLocal {

    void create(Corte corte);

    void edit(Corte corte);

    void remove(Corte corte);

    Corte find(Object id);

    List<Corte> findAll();

    List<Corte> findRange(int[] range);

    int count();
    
}
