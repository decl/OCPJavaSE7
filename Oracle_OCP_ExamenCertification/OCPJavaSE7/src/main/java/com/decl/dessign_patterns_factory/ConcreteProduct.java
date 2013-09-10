/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.decl.dessign_patterns_factory;

/**
 *
 * @author DSA-David
 */
public class ConcreteProduct implements Product{

    public ConcreteProduct() {
    }
    
    public void operacion(){
        System.out.println("Una operación de este producto");
    }
}