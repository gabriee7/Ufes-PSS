/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ufes.pss.exercicio7;

/**
 *
 * @author nitro
 */
public class Principal {

    public static void main(String[] args) {
        Configuracao instancia1 = Configuracao.getInstancia();
        Configuracao instancia2 = Configuracao.getInstancia();
        
        instancia1.setDado("Instancia 1");
        System.err.println("\nInstancia 1: "+instancia1.toString());
        System.err.println("\nInstancia 2: "+instancia2.toString());
        
        instancia2.setDado("Instancia 2");
        System.err.println("\nInstancia 1: "+instancia1.toString());
        System.err.println("\nInstancia 2: "+instancia2.toString());
    }
}
