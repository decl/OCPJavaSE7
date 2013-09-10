/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.decl.dessign_patterns_factory;

/**
 *
 * @author DSA-David
 */
public class ConcreteCreator extends Creator{
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}
