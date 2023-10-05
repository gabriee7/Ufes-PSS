/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.pss.exerciciolod;

/**
 *
 * @author nitro
 */
public class Cliente {
    private final Carteira carteira;
    private final ModuloPagar modulo;

    public Cliente(double valorCarteira) {
        this.carteira = new Carteira(valorCarteira);
        this.modulo = new ModuloPagar();
    }
    
    public double pagar(double valor){
        return modulo.processar(carteira, valor);
    }
}
