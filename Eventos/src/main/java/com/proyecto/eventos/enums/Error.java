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
public class Error extends Exception{
        
    private final ErrorCode code;
    private final String message;
    
    public Error(ErrorCode code) {
        this.code = code;
        this.message = "";
    }
    
    public Error(ErrorCode code, String message) {
        this.code = code;
        this.message = message;
    }

    public ErrorCode getCode() {
        return code;
    }
    
    public String getExceptionCode() {
        return code.getValue();
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
