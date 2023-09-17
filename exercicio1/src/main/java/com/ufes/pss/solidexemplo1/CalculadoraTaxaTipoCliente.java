/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.pss.solidexemplo1;

/**
 *
 * @author nitro
 */
public class CalculadoraTaxaTipoCliente implements IModuloCalculadoraTaxa{
    
    @Override
    public void processar(Pedido pedido){
        double taxa;
        switch(pedido.getCliente().getTipo()){
            case "GOLD":
                taxa = pedido.getValorTaxa() * 0.9;
                pedido.setValorTaxa(taxa);
                break;
            case "SILVER":
                taxa = pedido.getValorTaxa() * 0.5;
                pedido.setValorTaxa(taxa);
                break;
            case "DIAMOND":
                taxa = pedido.getValorTaxa() * 0;
                pedido.setValorTaxa(taxa);
                break;
            default:
                break;
        }
    }
}
