/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.ufes.pss.solidexemplo1;

/**
 *
 * @author nitro
 */
public class Principal {
    public static void main(String[] args) {
        Pedido p1 = new Pedido("Gabriel", "DIAMOND", "GUARAREMA", 15.0);
        CalculadoraTaxaEntrega calcTx = new CalculadoraTaxaEntrega();
        AtualizadorRastreio atuaRs = new AtualizadorRastreio();
        
        calcTx.processar(p1);
        atuaRs.atualizar(p1);
        
        System.out.println(p1.toString());
        
    }
}
