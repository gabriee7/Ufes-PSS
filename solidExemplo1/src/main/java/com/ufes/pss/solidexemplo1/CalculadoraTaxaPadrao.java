/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.pss.solidexemplo1;

/**
 *
 * @author nitro
 */
public class CalculadoraTaxaPadrao implements IModuloCalculadoraTaxa {
    private double taxa = 10.0;
    
    public void processar(Pedido pedido){
        pedido.setValorTaxa(taxa);
    }
}
