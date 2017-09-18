/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bryan.crud.controller;

import com.bryan.crud.model.Ambito;
import com.bryan.crud.model.User;
import com.bryan.crud.service.AmbitoService;
import com.bryan.crud.service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author bvaldez
 */
@RestController
public class UserController { 
    
    @Autowired
    UserService userService;
    
    @Autowired
    AmbitoService ambitoService;
    
    //-Retrive all users //
    
    @RequestMapping(value = "/user/", method = RequestMethod.GET)
    public ResponseEntity<List<Ambito>> listAllUsers(){
        //List<User> users = userService.listAllUsers(); 
        //ArrayList list = userService.allUsers();
        ArrayList list = ambitoService.allAmbitos(); 
        //List<Ambito> list  = ambitoService.findAllAmbitos();
        if(list.isEmpty()){
            return new ResponseEntity<List<Ambito>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Ambito>>(list, HttpStatus.OK);
        
    }

}
