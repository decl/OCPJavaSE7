/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.decl.dessign_patterns;

/**
 *
 * @author DSA-David
 */
public class CurrencyFactory {

    public static Currency createCurrency(String country) {
        if (country.equalsIgnoreCase("India")) {
            return new Rupee();
        } else if (country.equalsIgnoreCase("Singapore")) {
            return new SGDDollar();
        } else if (country.equalsIgnoreCase("US")) {
            return new USDollar();
        }
        throw new IllegalArgumentException("No such currency");
    }
}
