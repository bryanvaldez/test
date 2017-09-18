/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bryan.crud.helper;

import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author bvaldez
 */
public class TypesUtil {
    public static Long getDefaultLong(Object objValue){
        if(objValue instanceof Long){
            return (Long) objValue;
        }
        try {
            if(objValue != null && StringUtils.isNotBlank(objValue.toString()) && !objValue.toString().equals("null")){
                return Long.valueOf(objValue.toString());
            }
        } catch (Exception e) {
            return null;
        }
        return null;
    }
}
