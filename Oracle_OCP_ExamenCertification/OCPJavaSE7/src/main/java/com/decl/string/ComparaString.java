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
        System.out.println("Comparacion hola1 hola2: "+(hola1==hola2));
        System.out.println("Comparacion hola1 hola2: "+(hola1==_test));
    }
    
    public static void main(String[] args) {
        new ComparaString();
    }
}
