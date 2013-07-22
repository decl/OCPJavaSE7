/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.decl.overloading;

/**
 *
 * @author David
 */
public class ClassOverload {
    public static void aMethdo(int i){System.out.println("int");}
    public static void aMethdo(short i){System.out.println("short");}
    public static void aMethdo(Object i){System.out.println("object");}
//    public static void aMethdo(String i){System.out.println("String");}

    public static void main(String[] args) {
        byte b =127;
        aMethdo(b);
        aMethdo(9);
        Integer i =9;
        aMethdo(i);
        aMethdo("9");
    }
}
