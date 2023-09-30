/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.pss.resolucaoexercicio;

/**
 *
 * @author nitro
 */
public class CupomDescontoEntrega {
    private String metodo;
    private double valorCupom;

    public CupomDescontoEntrega(String metodo, double valorCupom) {
        this.metodo = metodo;
        this.valorCupom = valorCupom;
    }

    public String getMetodo() {
        return metodo;
    }

    public double getValorCupom() {
        return valorCupom;
    }

    @Override
    public String toString() {
        return "CupomDescontoEntrega{" + "metodo=" + metodo + ", valorCupom=" + valorCupom + '}';
    }
   
    
}
