/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.pss.resolucaoexercicio.ModuloCalculadora;

import com.ufes.pss.resolucaoexercicio.Pedido;
import java.util.ArrayList;

/**
 *
 * @author nitro
 */
public class CalculadoraTaxaDescontoService {
    private final ArrayList<IFormaCalculoTaxaDescontoEntrega> modulos;
    
    public CalculadoraTaxaDescontoService(){
        modulos = new ArrayList<>();
        modulos.add(new FormaCalculoCategoriaProduto());
        modulos.add(new FormaCalculoTipoCliente());
        modulos.add(new FormaCalculoTaxaBairro());
        modulos.add(new FormaCalculoValorPedido());
    }
    
    public void processar(Pedido pedido){
        for(IFormaCalculoTaxaDescontoEntrega mod: modulos){
            mod.processar(pedido);
        }
    }
}
