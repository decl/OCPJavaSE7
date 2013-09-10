/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.decl.overloading;

/**
 *
 * @author DSA-David
 */
public class ExampleOverloadedDos {
    public static void primerArreglo(String [] lala){}
    public static void primerArreglo(String[] ... lala ){}
    public static void main(String[] args) {
        primerArreglo(new String[2]);
    }
}
