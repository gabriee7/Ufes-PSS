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
public class FormaCalculoTipoCliente implements IFormaCalculoTaxaDescontoEntrega{
    @Override
    public void processar(Pedido pedido){
        try {
            if(!seAplica(pedido))
                throw new Exception("Não se aplica");

            double taxa = 0;
                switch(pedido.getTipoCliente()){
                    case "GOLD" -> {
                        taxa = pedido.getValorTaxaEntrega() * 0.1;
                        pedido.addCupomEntrega("Desconto Cliente Tipo Gold",taxa);
                    }
                    case "SILVER" -> {
                        taxa = pedido.getValorTaxaEntrega() * 0.5;
                        pedido.addCupomEntrega("Desconto Cliente Tipo Silver", taxa);
                    }
                    case "DIAMOND" -> {
                        taxa = pedido.getValorTaxaEntrega() * 1;
                        pedido.addCupomEntrega("Desconto Cliente Tipo Diamond", taxa);
                    }
                    default -> {
                    }
                }
            } catch (Exception ex) {
                Logger.getLogger(FormaCalculoTipoCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
                
    }
    private boolean seAplica(Pedido pedido){
        return !"".equals(pedido.getTipoCliente()) && pedido.getValorTaxaEntrega() > 0;
    }

}