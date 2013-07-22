/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.decl.override;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author David
 */
public class ProgramadoNet extends Programador{
    
    public void revisaActividad(){
        System.out.println("Revisando Actividad: ");
    }
    /**No compila porque manda una exception mas general que la que se encuentra
     en programador*/
//    @Override
//    public void problemaResolver() throws Exception{
//        System.out.println("");
//    }

    @Override
    /**Funciona aun cuando no tiene una excepción*/
    public void problemaResolver() throws FileNotFoundException{
    }
    public void problemaResolver(String l){
     return;
    }

    @Override
    public ProgramadoNet regresaProgramador() {
       return new ProgramadoNet();
    }

    /**Pero si puede mandar una exception que no extienda de runtimeException*/
    @Override
    public String actividad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**Sino manda una exception la clase padre, la hija no puede sobreescribir el método con un lanzamiento
     de cualquier exception o error*/
//    @Override
//    public String actividad() throws Exception{
//        return "";
//    }
    
    
    
}
