/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ufes.pss.exercicio16;

/**
 *
 * @author nitro
 */
public class Principal {

    public static void main(String[] args) {
        PagamentoService pag = new PagamentoService();
        Pedido ped = new Pedido(20);
        
        pag.processar(ped);
        
        System.out.print(ped.toString());
    }
}
