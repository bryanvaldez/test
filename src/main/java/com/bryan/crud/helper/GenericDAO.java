/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bryan.crud.helper;

import java.util.List;

/**
 *
 * @author bvaldez
 */
public interface GenericDAO<T> {
    public T find(T t);
    public List<T> all();
    public void saveDAO(T t);
    public void updateDAO(T t);
    public void deleteDAO(T t);
}
