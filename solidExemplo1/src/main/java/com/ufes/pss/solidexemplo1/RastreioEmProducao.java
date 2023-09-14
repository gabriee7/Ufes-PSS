/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.pss.solidexemplo1;

/**
 *
 * @author nitro
 */
public class RastreioEmProducao implements IModuloRatreioPedido{
    @Override
    public void atualizar(Pedido pedido){
        pedido.setStatus("Em produção.");
        System.out.print("\nEm produção.");
    }
}
