/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.pss.exercicio16;

/**
 *
 * @author nitro
 */
public class Pedido {
    private double valor;
    private String metodo;
    
    public Pedido(double valor) {
        this.valor = valor;
    }  

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    } 

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Pedido{" + "valor=" + valor + ", metodo=" + metodo + '}';
    }
    
}
