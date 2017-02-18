/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rosesoft.ejb;

import com.rosesoft.model.Ofrecimientosemanal;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Asus
 */
@Local
public interface OfrecimientosemanalFacadeLocal {

    void create(Ofrecimientosemanal ofrecimientosemanal);

    void edit(Ofrecimientosemanal ofrecimientosemanal);

    void remove(Ofrecimientosemanal ofrecimientosemanal);

    Ofrecimientosemanal find(Object id);

    List<Ofrecimientosemanal> findAll();

    List<Ofrecimientosemanal> findRange(int[] range);

    int count();
    
}
