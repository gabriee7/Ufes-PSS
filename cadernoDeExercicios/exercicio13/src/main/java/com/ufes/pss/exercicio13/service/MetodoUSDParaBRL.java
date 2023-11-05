/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.pss.exercicio13.service;

import com.ufes.pss.exercicio13.MercadoriaUSD;

/**
 *
 * @author nitro
 */
public class MetodoUSDParaBRL implements IFormasConversaoAdapter{
    private double cotacao;
    private MercadoriaUSD instanciaMercadoriaUSD;

    public MetodoUSDParaBRL(MercadoriaUSD instanciaMercadoriaUSD, double cotacao) {
        this.instanciaMercadoriaUSD = instanciaMercadoriaUSD;
        this.cotacao = cotacao;
        
    }

    @Override
    public double converter(){
        return instanciaMercadoriaUSD.getValor() * cotacao;
    }

    public double getCotacao() {
        return cotacao;
    }

    public void setCotacao(double cotacao) {
        this.cotacao = cotacao;
    }
    
    
}
