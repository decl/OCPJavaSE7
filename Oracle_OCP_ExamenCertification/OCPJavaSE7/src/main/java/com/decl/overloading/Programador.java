/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.decl.overloading;

/**
 *
 * @author David
 */
public class Programador {
    
    private String actividad;
    /*Sobrecarga**/
    Programador(){
    }
    
    Programador(String actividad){       
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }
    
}
