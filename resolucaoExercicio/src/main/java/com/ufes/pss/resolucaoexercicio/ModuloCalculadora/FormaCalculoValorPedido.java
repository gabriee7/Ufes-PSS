/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.pss.resolucaoexercicio.ModuloCalculadora;

import com.ufes.pss.resolucaoexercicio.Pedido;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nitro
 */
public class FormaCalculoValorPedido implements IFormaCalculoTaxaDescontoEntrega{
    @Override
    public void processar(Pedido pedido){
        try {
            if(!seAplica(pedido))
                throw new Exception("Não se aplica Forma Calculo Valor Pedido");

            double taxa = 0;
            
                if(pedido.getValorTotal() > 100){
                    taxa = pedido.getValorTaxaEntrega() * 1;
                    pedido.addCupomEntrega("Valor total > R$100 ",taxa);
                }else if(pedido.getValorTotal() > 50){
                    taxa = pedido.getValorTaxaEntrega() * 0.5;
                    pedido.addCupomEntrega("Valor total > R$50", taxa);
                }else if(pedido.getValorTotal() > 10){
                    taxa = pedido.getValorTaxaEntrega() * 0.1;
                    pedido.addCupomEntrega("Valor total > R$10", taxa);
                }else{
                    throw new Exception("Não se aplica Forma Calculo Valor Pedido");
                }
            } catch (Exception ex) {
                Logger.getLogger(FormaCalculoCategoriaProduto.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
    }
    private boolean seAplica(Pedido pedido){
        return !"".equals(pedido.getValorTotal()) && pedido.getValorTaxaEntrega() > 0;
    }
}
