/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.pss.taxaent;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nitro
 */
public class CalculadoraTaxaEntrega {
    private final List<IModuloCalculadoraTaxa> modulosCalculadoraTaxa;
    
    public CalculadoraTaxaEntrega(){
        modulosCalculadoraTaxa = new ArrayList<>();
        modulosCalculadoraTaxa.add(new CalculadoraTaxaPadrao());
        modulosCalculadoraTaxa.add(new CalculadoraTaxaTipoCliente());
    }
    
    public void processar(Pedido pedido){
        for(IModuloCalculadoraTaxa moduloCalculadoraTaxa : modulosCalculadoraTaxa){
            moduloCalculadoraTaxa.processar(pedido);
        }
    }
}
