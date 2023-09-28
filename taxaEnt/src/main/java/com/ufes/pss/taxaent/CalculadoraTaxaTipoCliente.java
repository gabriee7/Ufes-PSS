/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.pss.taxaent;

/**
 *
 * @author nitro
 */
public class CalculadoraTaxaTipoCliente implements IModuloCalculadoraTaxa{
    
    @Override
    public void processar(Pedido pedido){
        double taxa;
        switch(pedido.getCliente().getTipo()){
            case "GOLD" -> {
                taxa = pedido.getTaxaEntrega().getValorTaxa() * 0.9;
                pedido.getTaxaEntrega().setValorDescontos(pedido.getTaxaEntrega().getValorTaxa() - taxa);
                pedido.getTaxaEntrega().setValorTaxa(taxa);
                pedido.getTaxaEntrega().setMetodo("Desconto Cliente Tipo Gold");
            }
            case "SILVER" -> {
                taxa = pedido.getTaxaEntrega().getValorTaxa() * 0.5;
                pedido.getTaxaEntrega().setValorDescontos(pedido.getTaxaEntrega().getValorTaxa() - taxa);
                pedido.getTaxaEntrega().setValorTaxa(taxa);
                pedido.getTaxaEntrega().setMetodo("Desconto Cliente Tipo Silver");
            }
            case "DIAMOND" -> {
                taxa = pedido.getTaxaEntrega().getValorTaxa() * 0;
                pedido.getTaxaEntrega().setValorDescontos(pedido.getTaxaEntrega().getValorTaxa() - taxa);
                pedido.getTaxaEntrega().setValorTaxa(taxa);
                pedido.getTaxaEntrega().setMetodo("Desconto Cliente Tipo Diamond");
            }
            default -> {
            }
        }
    }
}
