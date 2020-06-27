/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.eventos.enums;

/**
 *
 * @author crist
 */
public enum ErrorCode {
    
    BAD_REQUEST("501"),
    GENERAL_ERROR("9999");
    
    private final String value;

    ErrorCode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    } 
}
