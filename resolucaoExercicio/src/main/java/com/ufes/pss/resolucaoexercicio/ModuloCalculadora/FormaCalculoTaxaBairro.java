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
public class FormaCalculoTaxaBairro implements IFormaCalculoTaxaDescontoEntrega{
    @Override
    public void processar(Pedido pedido){
        try {
            if(!seAplica(pedido))
                throw new Exception("Não se aplica");

            double taxa = 0;
                switch(pedido.getBairro()){
                    case "CENTRO" -> {
                        taxa = pedido.getValorTaxaEntrega() * 0.1;
                        pedido.addCupomEntrega("Desconto Bairro Centro",taxa);
                    }
                    case "ALTO UNIVERSITÁRIO" -> {
                        taxa = pedido.getValorTaxaEntrega() * 0.5;
                        pedido.addCupomEntrega("Desconto Bairro Alto Universitário", taxa);
                    }
                    case "GUARAREMA" -> {
                        taxa = pedido.getValorTaxaEntrega() * 1;
                        pedido.addCupomEntrega("Desconto Bairro Guararema", taxa);
                    }
                    default -> {
                    }
                }
            } catch (Exception ex) {
                Logger.getLogger(FormaCalculoTaxaBairro.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
    }
    private boolean seAplica(Pedido pedido){
        return !"".equals(pedido.getBairro()) && pedido.getValorTaxaEntrega() > 0;
    }
}
