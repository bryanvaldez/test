/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bryan.crud.service;

import java.util.List;

/**
 *
 * @author bvaldez
 */
public interface GenericService<T> {
    public T find(T t);
    public List<T> all();
    public void save(T t);
    public void update(T t);
    public void delete(T t);
}
