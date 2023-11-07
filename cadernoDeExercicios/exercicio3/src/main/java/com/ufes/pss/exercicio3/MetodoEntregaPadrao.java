/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.pss.exercicio3;

/**
 *
 * @author nitro
 */
public class MetodoEntregaPadrao implements IFormasEntrega {
    @Override
    public void calcular(Entrega entrega){
        if(seAplica(entrega))
            entrega.setPreco(50);
            
        //implementar
    }
    
    private boolean seAplica(Entrega entrega){
        return "PADRÃO".equals(entrega.getTipo());
    }
}
