/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.decl.string;

/**
 *
 * @author DSA-David
 */
public class ComparaString {
    private String hola1="hola";
    private String hola2="hola";
    
    {
        String _test  = new String("hola");
        String _test2  = new String("hola");
        System.out.println("Comparacion hola1 hola2: "+(hola1==hola2));
        System.out.println("Comparacion hola1 con test: "+(hola1==(_test.toString())));
        System.out.println("Comparacion test con test2: "+(_test==_test2));
    }
    
    public static void main(String[] args) {
        new ComparaString();
    }
}
