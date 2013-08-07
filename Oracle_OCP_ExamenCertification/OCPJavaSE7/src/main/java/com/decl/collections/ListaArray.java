/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.decl.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author DSA-David
 */
public class ListaArray {

    public static void main(String[] args) {
        long tiempoInicio = 0;
        long totalTiempo = 0;
//        tiempoInicio = System.currentTimeMillis();
//        List<Integer> i = llenaArray(100000);
//        vaciaArray(i, 100000);
//        totalTiempo = System.currentTimeMillis() - tiempoInicio;
//        System.out.println("El tiempo de demora es con array :" + totalTiempo + " miliseg");

        tiempoInicio = System.currentTimeMillis();
        List<Integer> f = llenaLinkedList(100000);
        vaciaArray(f, 100000);
        totalTiempo = System.currentTimeMillis() - tiempoInicio;
        System.out.println("El tiempo de demora es con linked list :" + totalTiempo + " miliseg");

    }

    public static List llenaArray(int limit) {
        List<Integer> listaStrings = new ArrayList<Integer>();
        for (int i = 0; i < limit; i++) {
            listaStrings.add(i);
        }
        System.out.println("Tamaño array: "+listaStrings.size());
        return listaStrings;
    }

    public static List llenaLinkedList(int limit) {
        List<Integer> listaStrings = new LinkedList<Integer>();
        for (int i = 0; i < limit; i++) {
            listaStrings.add(i);
        }
        System.out.println("Tamaño linkedlist: "+listaStrings.size());
        return listaStrings;
    }

    public static void vaciaArray(List<Integer> l, int limit) {
        for (int i = 0; i < limit; i++) {
            l.remove(i);
        }
    }
}
