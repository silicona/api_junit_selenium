/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.view;

import com.app.model.Calculadora;

/**
 *
 * @author nadies
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Calculadora calc = new Calculadora();
        
        System.out.println("Calculando 1 + 2: " + calc.sumar(1, 2));
    }
    
}
