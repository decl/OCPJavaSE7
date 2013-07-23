/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.decl.generics;

/**
 *
 * @author DSA-David
 */
public class GenericoDos {
     public static <T> T listaCheckTres(T l){
         System.out.println("Clase: "+l.getClass().getName());
        return l;
    }
}
