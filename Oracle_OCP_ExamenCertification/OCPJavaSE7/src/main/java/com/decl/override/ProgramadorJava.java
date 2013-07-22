/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.decl.override;

/**
 *
 * @author David
 */
public class ProgramadorJava extends Programador{

    @Override
    public Programador regresaProgramador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 /**Pero si puede mandar una exception que no extienda de runtimeException*/
    @Override
    public String actividad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }           
}
