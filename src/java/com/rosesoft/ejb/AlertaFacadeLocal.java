/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rosesoft.ejb;

import com.rosesoft.model.Alerta;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Asus
 */
@Local
public interface AlertaFacadeLocal {

    void create(Alerta alerta);

    void edit(Alerta alerta);

    void remove(Alerta alerta);

    Alerta find(Object id);

    List<Alerta> findAll();

    List<Alerta> findRange(int[] range);

    int count();
    
}
