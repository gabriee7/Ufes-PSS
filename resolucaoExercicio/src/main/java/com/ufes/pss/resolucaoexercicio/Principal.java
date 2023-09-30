/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ufes.pss.resolucaoexercicio;

import com.ufes.pss.resolucaoexercicio.ModuloCalculadora.CalculadoraTaxaDescontoService;

/**
 *
 * @author nitro
 */
public class Principal {
    public static void main(String[] args) {
        CalculadoraTaxaDescontoService calculadora = new CalculadoraTaxaDescontoService();
        Cliente client1;
        Pedido pedido1;
        Produto produto1;

        client1 = new Cliente("Gabriel", "GOLD", "Rua Viviane de Siqueira", "Guararema", "Alegre");
        produto1 = new Produto("Cheese Burger", "Burger", 35, 2);
        pedido1 = new Pedido(15,001,client1);
        
        pedido1.addItem(produto1, 2);

        
        calculadora.processar(pedido1);
        
        System.out.print("\n" + pedido1.toString() + "\n\n");
    }
}
