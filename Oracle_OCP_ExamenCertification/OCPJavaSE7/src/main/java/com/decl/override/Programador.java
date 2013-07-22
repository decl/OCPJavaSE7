/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.decl.override;

import com.decl.modificadores_acceso.*;
import java.io.FileNotFoundException;

/**
 *
 * @author David
 */
public abstract class Programador {

    private String actividad;

    protected abstract Programador regresaProgramador() throws Error;
    protected void revisaActividad() {
        System.out.println("Revisando Actividad: " + actividad);
    }

    void problemaResolver() throws Exception {
    }
    public abstract String actividad();
    
}
