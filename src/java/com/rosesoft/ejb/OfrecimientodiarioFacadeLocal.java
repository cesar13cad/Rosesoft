/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rosesoft.ejb;

import com.rosesoft.model.Ofrecimientodiario;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Asus
 */
@Local
public interface OfrecimientodiarioFacadeLocal {

    void create(Ofrecimientodiario ofrecimientodiario);

    void edit(Ofrecimientodiario ofrecimientodiario);

    void remove(Ofrecimientodiario ofrecimientodiario);

    Ofrecimientodiario find(Object id);

    List<Ofrecimientodiario> findAll();

    List<Ofrecimientodiario> findRange(int[] range);

    int count();
    
}
