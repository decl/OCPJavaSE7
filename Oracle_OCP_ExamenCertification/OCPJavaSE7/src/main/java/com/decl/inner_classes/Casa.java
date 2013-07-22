/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.decl.inner_classes;

/**
 *
 * @author David
 */
public class Casa {
    
    private int l;
    
    public void habitable(){
    }
    protected static class Condominio implements InnerInterface{       
        public void habitable(String h){
                class Lala{}
        }
    }
    public class Departamento{
        
        private int numero;
        private String nombreEdificio;

        public Departamento() {
        }

        public Departamento(int numero, String nombreEdificio) {
            System.out.println("Esto es el: "+l);
            this.numero = numero;
            this.nombreEdificio = nombreEdificio;
        }
        
        
    }
    public static interface InnerInterface{
              void habitable(String habit);
    }
    
    public static void main(String[] args) {
        Casa.InnerInterface cc = new Casa.Condominio();
        cc.habitable("Esto aparte");
    }
}
