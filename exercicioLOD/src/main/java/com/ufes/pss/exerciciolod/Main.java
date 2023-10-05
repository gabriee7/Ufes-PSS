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
        jorn.setTotalCobranca(10);
        jorn.addCliente(100);
        
        jorn.receberPagamento();
        
        System.out.print("O valor recebido foi: R$ " + jorn.getTotalRecebido());
  
    }
}
