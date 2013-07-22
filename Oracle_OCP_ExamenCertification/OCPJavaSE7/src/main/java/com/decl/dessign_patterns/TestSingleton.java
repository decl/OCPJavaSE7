/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.decl.dessign_patterns;

/**
 *
 * @author DSA-David
 */
public class TestSingleton {
    public static void main(String[] args) {
        Singleton s=Singleton.getSingleton();
        s.ver();
        Singleton s1=Singleton.getSingleton();
        s1.ver();
    }
}
