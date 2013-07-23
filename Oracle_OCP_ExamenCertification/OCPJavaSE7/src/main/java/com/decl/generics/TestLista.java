/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.decl.generics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DSA-David
 */
public class TestLista {
    public static void main(String[] args) {
       new  TestLista().listaCheckTres();
    }
    public void listaCheckTres(){
        GenericoDos.listaCheckTres(new Manzana());
         GenericoDos.listaCheckTres(new Naranja());
    }
    public void listaCheckDos(){
        List<? extends Number> l = new ArrayList<Integer>();
        List<? super Integer> l2 = new ArrayList<Integer>();
//        l2 = new ArrayList<Float>(); no cmpila
        l2 = new ArrayList<Object>();
        l2 = new ArrayList<Number>();
        l2 = new ArrayList<Integer>();
    }
    public void listaCheck(){
         List<?> l =  new ArrayList<String>();
        //No compila
        //l.add("lala");
    }
}
