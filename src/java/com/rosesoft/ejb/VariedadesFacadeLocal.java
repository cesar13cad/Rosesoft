/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rosesoft.ejb;

import com.rosesoft.model.Variedades;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Asus
 */
@Local
public interface VariedadesFacadeLocal {

    void create(Variedades variedades);

    void edit(Variedades variedades);

    void remove(Variedades variedades);

    Variedades find(Object id);

    List<Variedades> findAll();

    List<Variedades> findRange(int[] range);

    int count();
    
}
