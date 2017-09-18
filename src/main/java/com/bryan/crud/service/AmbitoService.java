/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bryan.crud.service;

import com.bryan.crud.model.Ambito;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bvaldez
 */
public interface AmbitoService {
    
    ArrayList allAmbitos();
    
    List<Ambito> findAllAmbitos();
}
