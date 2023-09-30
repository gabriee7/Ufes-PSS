/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.pss.resolucaoexercicio.ModuloCalculadora;

import com.ufes.pss.resolucaoexercicio.Item;
import com.ufes.pss.resolucaoexercicio.Pedido;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nitro
 */
public class FormaCalculoCategoriaProduto implements IFormaCalculoTaxaDescontoEntrega{
    @Override
    public void processar(Pedido pedido){
        try {
            if(!seAplica(pedido))
                throw new Exception("Não se aplica");

            double taxa = 0;
            ArrayList<Item> itens = pedido.getItens();
                for(Item elem : itens){
                    switch(elem.getCategoria()){
                        case "BURGUER" -> {
                            taxa = pedido.getValorTaxaEntrega() * 0.1;
                            pedido.addCupomEntrega("Desconto Categoria Burguer",taxa);
                        }
                        default -> {
                        }
                    }
                }

            } catch (Exception ex) {
                Logger.getLogger(FormaCalculoCategoriaProduto.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    private boolean seAplica(Pedido pedido){
        return !"".equals(pedido.getItens()) && pedido.getValorTaxaEntrega() > 0;
    }
}
