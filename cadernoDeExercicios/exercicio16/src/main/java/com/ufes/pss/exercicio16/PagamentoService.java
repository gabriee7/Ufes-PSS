/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.pss.exercicio16;

import java.util.ArrayList;

/**
 *
 * @author nitro
 */
public class PagamentoService {
    private ArrayList<IMetodoPagamento> metodos;

    public PagamentoService() {
        this.metodos = new ArrayList<>();
        this.metodos.add(new MetodoPayPal());
        this.metodos.add(new MetodoCartaoCredito());
        this.metodos.add(new MetodoTransferenciaBancaria());
    }
    
    public void processar(Pedido pedido){
        for(IMetodoPagamento elem: metodos){
            if(elem.processar(pedido))
                break;
        }
    }
    
}
