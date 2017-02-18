/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rosesoft.ejb;

import com.rosesoft.model.Semanas;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Asus
 */
@Local
public interface SemanasFacadeLocal {

    void create(Semanas semanas);

    void edit(Semanas semanas);

    void remove(Semanas semanas);

    Semanas find(Object id);

    List<Semanas> findAll();

    List<Semanas> findRange(int[] range);

    int count();
    
}
