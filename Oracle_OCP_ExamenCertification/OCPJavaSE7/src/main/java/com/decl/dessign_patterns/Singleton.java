/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.decl.dessign_patterns;

/**
 *
 * @author DSA-David
 */
public class Singleton {

    private static Singleton singleton = null;

    private Singleton() {
    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            System.out.println("Instancia de singleton");
            singleton = new Singleton();
        }
        return singleton;
    }

    public void ver() {
        System.out.println("Estoy desde la clase: " + this.getClass().getName());
    }
}
