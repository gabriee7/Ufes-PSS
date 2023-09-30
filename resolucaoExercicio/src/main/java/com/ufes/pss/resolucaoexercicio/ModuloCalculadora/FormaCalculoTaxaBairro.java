/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.pss.resolucaoexercicio.ModuloCalculadora;

import com.ufes.pss.resolucaoexercicio.Pedido;

/**
 *
 * @author nitro
 */
public class FormaCalculoTaxaBairro implements IFormaCalculoTaxaDescontoEntrega{
    @Override
    public void processar(Pedido pedido){
        if(!seAplica(pedido)){
            
        }
        
        
    }
    private boolean seAplica(Pedido pedido){
        return !"".equals(pedido.getBairro()) && pedido.getValorTaxaEntrega() > 0;
    }
}
