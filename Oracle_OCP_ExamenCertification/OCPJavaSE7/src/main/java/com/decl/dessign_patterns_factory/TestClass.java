/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.decl.dessign_patterns_factory;

/**
 *
 * @author DSA-David
 */
public class TestClass {
    public static void main(String args[]){
    Creator aCreator;
    aCreator = new ConcreteCreator();
    Product producto = aCreator.factoryMethod();
    producto.operacion();
}
}
