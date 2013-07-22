/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.decl.inner_classes;

/**
 *
 * @author David
 */
public interface Edificio {
    
    public class CondominioDuplex implements Edificio{

        public CondominioDuplex() {
            System.out.println("Condominio Duplex");
        }
        
    }
    public static class Condominio implements Edificio{
    }
    static class HolaMundo{
    }
     interface Hola{
    
    }
}
