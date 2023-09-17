/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.pss.solidexemplo1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nitro
 */
public class AtualizadorRastreio {
    private List<IModuloRatreioPedido> modulosRastreio;
    
    public AtualizadorRastreio(){
        modulosRastreio = new ArrayList<>();
        modulosRastreio.add(new RastreioEmProducao());
        modulosRastreio.add(new RastreioEmTransito());
        modulosRastreio.add(new RatreioEntregue());
    }
    
    public void atualizar(Pedido pedido){
        for(IModuloRatreioPedido moduloRastreio: modulosRastreio){
            moduloRastreio.atualizar(pedido);
        }
    }
}
