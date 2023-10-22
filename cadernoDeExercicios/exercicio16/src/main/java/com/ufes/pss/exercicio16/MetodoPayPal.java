/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.pss.exercicio16;

/**
 *
 * @author nitro
 */
public class MetodoPayPal implements IMetodoPagamento {
    @Override
    public boolean processar(Pedido pedido){
        if(seAplica(pedido)){
            pedido.setMetodo("Metodo PayPal");
            return true;
        }
        return false;
    }
    
    private boolean seAplica(Pedido pedido){
        return pedido != null && pedido.getValor() < 10;
    }
}
