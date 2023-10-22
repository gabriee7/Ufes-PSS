/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ufes.pss.exercicio6;

/**
 *
 * @author nitro
 */
public class Principal {

    public static void main(String[] args) {
        IMetodoTransporteStrategy metodo;
        double temp = 0;
        
        metodo = new MetodoAndandoStrategy();
        CalculaTempoViagemService calculadora = new CalculaTempoViagemService(metodo);
        
        temp = calculadora.calcular(10);
        System.out.print("\nMetodo Andando: " + temp);
        
        calculadora.setMetodo(new MetodoBicicletaStrategy());
        temp = calculadora.calcular(10);
        System.out.print("\nMetodo Bicicleta: " + temp);
        
        calculadora.setMetodo(new MetodoCarroStrategy());
        temp = calculadora.calcular(10);
        System.out.print("\nMetodo Carro: " + temp);
        
        calculadora.setMetodo(new MetodoOnibusStrategy());
        temp = calculadora.calcular(10);
        System.out.print("\nMetodo Onibus: " + temp);
        
    }
}
