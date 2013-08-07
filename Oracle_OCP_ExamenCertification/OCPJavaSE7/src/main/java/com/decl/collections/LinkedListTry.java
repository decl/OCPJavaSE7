/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.decl.collections;

import java.util.List;
import java.util.LinkedList;

/**
 *
 * @author DSA-David
 */
public class LinkedListTry {

    private List<String> l = new LinkedList<String>();

    public void operaLinkedList() {
        l.add("hola");
        l.add("hola1");
        l.add("hola2");
    }

    public void revisaCollection() {
        for (int j = 0; j < l.size(); j++) {
            System.out.println("Objeto posicion: " + j + " , objeto: " + l.get(j));
        }
    }

    public void quitaElemento(int i) {
        l.remove(i);
    }

    public static void main(String[] args) {
        LinkedListTry llt = new LinkedListTry();
        llt.operaLinkedList();
        llt.revisaCollection();
        llt.quitaElemento(0);
        System.out.println("");
        llt.revisaCollection();

    }
}
