/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.decl.generics;

/**
 *
 * @author DSA-David
 */
public class Recauderia<T,T1> {
     
    private T fruta;
    private T1 frutaDos;
    
    public Recauderia() {
    }

    public T getFruta(){
        return fruta;
    }

    public void setFruta(T fruta) {
        this.fruta = fruta;
    }
    
    public T1 getFrutaDos(){
        return frutaDos;
    }

    public void setFrutaDos(T1 fruta) {
        this.frutaDos= fruta;
    }
    public <T extends Number & Iterable> void muestraFruta(){
    }
}
