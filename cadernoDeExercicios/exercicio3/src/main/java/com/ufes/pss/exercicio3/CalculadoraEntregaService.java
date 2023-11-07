/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.pss.exercicio3;

/**
 *
 * @author nitro
 */
public class CalculadoraEntregaService {
    private IFormasEntrega metodo;

    public CalculadoraEntregaService(IFormasEntrega metodo) {
        this.metodo = metodo;
    }

    private void setMetodo(IFormasEntrega metodo) {
        this.metodo = metodo;
    }
    
    public void calcular(IFormasEntrega metodo, Entrega entrega){
        setMetodo(metodo);
        metodo.calcular(entrega);
    }
}
