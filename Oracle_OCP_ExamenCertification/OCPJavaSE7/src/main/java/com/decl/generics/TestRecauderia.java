/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.decl.generics;

/**
 *
 * @author DSA-David
 */
public class TestRecauderia {
    public static void main(String[] args) {
        Manzana m1 = new Manzana("Manzana de la india");
        Naranja n = new Naranja("Naranja");
        Recauderia<Manzana,Naranja> r = new Recauderia<Manzana, Naranja>();
        r.setFruta(m1);
        r.setFrutaDos(n);
        System.out.println(r.getFruta().getNombre());
        System.out.println(r.getFrutaDos().getNombre());
    }
}
