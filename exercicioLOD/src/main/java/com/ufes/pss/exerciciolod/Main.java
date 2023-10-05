/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ufes.pss.exerciciolod;

/**
 *
 * @author nitro
 */
public class Main {

    public static void main(String[] args) {
        Jornaleiro jorn = new Jornaleiro();
        Cliente n1 = new Cliente(10);
        jorn.setTotalCobranca(10);
        jorn.addCliente(n1);
        
        jorn.receberPagamento();
        
        System.out.print("O valor recebido foi: R$ " + jorn.getTotalRecebido());
  
    }
}
