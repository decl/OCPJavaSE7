/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.decl.abstrac_class;

/**
 *
 * @author David
 */
public  class Leon  extends Animal{

    Leon(){
        System.out.println("Creando un leon");
    }
    
    protected Leon(String l){}
    
//    public static abstract void hola();
 
    public static void main(String[] args) {
        new Leon();
    }
}
