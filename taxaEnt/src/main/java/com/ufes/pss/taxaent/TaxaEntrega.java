/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.pss.taxaent;

import java.util.ArrayList;

/**
 *
 * @author nitro
 */
public class TaxaEntrega {
    private CalculadoraTaxaEntrega calculadora;
    private ArrayList<String> metodos;
    private double valorTaxa;
    private double valorDescontos;


    public TaxaEntrega(){
        this.calculadora = new CalculadoraTaxaEntrega();
        this.metodos = new ArrayList<>();
        this.valorTaxa = 0;
        this.valorDescontos = 0;
    }
    
    public String getMetodos() {
        String result = "";
        
        for(String ele : metodos){
            result += ele + "; ";
        }
        return result;
    }

    public void setMetodo(String metodo) {
        this.metodos.add(metodo);
        System.out.println(metodos.toString());
    }

    public double getValorDescontos() {
        return valorDescontos;
    }

    public void setValorDescontos(double valorDescontos) {
        this.valorDescontos -= valorDescontos;
    }

    public double getValorTaxa() {
        return valorTaxa;
    }

    public void setValorTaxa(double valorTaxa) {
        this.valorTaxa = valorTaxa;
    }
    
    public void processarTaxa(Pedido pedido){
        this.calculadora.processar(pedido);
    }
}
