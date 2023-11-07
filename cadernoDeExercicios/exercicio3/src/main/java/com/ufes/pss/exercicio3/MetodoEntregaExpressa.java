/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.pss.exercicio3;

/**
 *
 * @author nitro
 */
public class MetodoEntregaExpressa implements IFormasEntrega {
    @Override
    public void calcular(Entrega entrega){
        if(seAplica(entrega))
            entrega.setPreco(70);
            
        //implementar
    }
    
    private boolean seAplica(Entrega entrega){
        return "EXPRESSA".equals(entrega.getTipo());
    }
}
