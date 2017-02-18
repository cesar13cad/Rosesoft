/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rosesoft.ejb;

import com.rosesoft.model.Fincas;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Asus
 */
@Local
public interface FincasFacadeLocal {

    void create(Fincas fincas);

    void edit(Fincas fincas);

    void remove(Fincas fincas);

    Fincas find(Object id);

    List<Fincas> findAll();

    List<Fincas> findRange(int[] range);

    int count();
    
}
