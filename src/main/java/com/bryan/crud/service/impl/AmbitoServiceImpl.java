/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bryan.crud.service.impl;

import com.bryan.crud.dao.AmbitoDAO;
import com.bryan.crud.model.Ambito;
import com.bryan.crud.service.AmbitoService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author bvaldez
 */
@Service("ambitoService")
@Transactional
public class AmbitoServiceImpl implements AmbitoService{
    
    @Autowired
    private AmbitoDAO ambitoDAO;

    @Override
    public ArrayList allAmbitos() {
        return ambitoDAO.allAmbitos();
    }

    @Override
    public List<Ambito> findAllAmbitos() {
        return ambitoDAO.findAllAmbitos();
    }
    
}
