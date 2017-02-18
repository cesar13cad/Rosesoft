/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rosesoft.ejb;

import com.rosesoft.model.Tipocorte;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Asus
 */
@Local
public interface TipocorteFacadeLocal {

    void create(Tipocorte tipocorte);

    void edit(Tipocorte tipocorte);

    void remove(Tipocorte tipocorte);

    Tipocorte find(Object id);

    List<Tipocorte> findAll();

    List<Tipocorte> findRange(int[] range);

    int count();
    
}
