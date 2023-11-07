/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ufes.pss.exercicio3;

/**
 *
 * @author nitro
 */
public class Principal {

    public static void main(String[] args) {
        Entrega expressa = new Entrega("EXPRESSA", 10, 5);
        Entrega padrao = new Entrega("PADRÃO", 10, 5);
        Entrega economica = new Entrega("ECONÔMICA", 10, 5);
    
        CalculadoraEntregaService calculadora = new CalculadoraEntregaService(new MetodoEntregaExpressa());
   
        calculadora.calcular(new MetodoEntregaExpressa(), expressa);
        calculadora.calcular(new MetodoEntregaPadrao(), padrao);
        calculadora.calcular(new MetodoEntregaEconomica(), economica);
        
        System.out.println("\nExpressa: " + expressa.toString());
        System.out.println("\nPadrao: " + padrao.toString());
        System.out.println("\nEconomica: " + economica.toString());
        
    }
    
}
