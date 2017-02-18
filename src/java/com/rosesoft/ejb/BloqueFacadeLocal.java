/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rosesoft.ejb;

import com.rosesoft.model.Bloque;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Asus
 */
@Local
public interface BloqueFacadeLocal {

    void create(Bloque bloque);

    void edit(Bloque bloque);

    void remove(Bloque bloque);

    Bloque find(Object id);

    List<Bloque> findAll();

    List<Bloque> findRange(int[] range);

    int count();
    
}
