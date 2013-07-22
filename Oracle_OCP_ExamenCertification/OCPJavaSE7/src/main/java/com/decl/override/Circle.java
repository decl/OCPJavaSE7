/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.decl.override;

/**
 *
 * @author David
 */
public class Circle extends Shape{

    private int x;
    private int y;
    private int radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle() {
    }

    @Override
    public Circle  copy() {
        return this;
    }

    @Override
    public String toString() {
        return ""; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
