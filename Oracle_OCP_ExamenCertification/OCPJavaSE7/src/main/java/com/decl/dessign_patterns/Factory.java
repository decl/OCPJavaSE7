/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.decl.dessign_patterns;

/**
 *
 * @author DSA-David
 */
public class Factory {
    public static void main(String args[]) {
              String country = "India";
              Currency rupee = CurrencyFactory.createCurrency(country);
              System.out.println(rupee.getSymbol());
       }
}
