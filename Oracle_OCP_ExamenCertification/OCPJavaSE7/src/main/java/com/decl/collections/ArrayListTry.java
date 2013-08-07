/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.decl.collections;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DSA-David
 */
public class ArrayListTry {
     private List<String> l = new ArrayList<String>();

    public void operaLinkedList() {
        l.add("hola");
        l.add("hola1");
        l.add("hola2");
        l.add("hola3");
        l.add("hola4");
        l.add("hola5");
        l.add("hola6");
        l.add("hola7");
        l.add("hola8");
        l.add("hola9");
        l.add("hola10");
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
        ArrayListTry llt = new ArrayListTry();
        llt.operaLinkedList();
        llt.revisaCollection();
        llt.quitaElemento(0);
        System.out.println("");
        llt.revisaCollection();

    }
}
