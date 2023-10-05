/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.pss.exerciciolod;

import java.util.ArrayList;

/**
 *
 * @author nitro
 */
public class Jornaleiro {
    private double totalCobranca;
    private double totalRecebido;
    private ArrayList<Cliente> clientes;

    public Jornaleiro() {
        this.totalCobranca = 0;
        this.totalRecebido = 0;
        this.clientes = new ArrayList<>();
    }
    
    public void receberPagamento(){
        for(Cliente elem : clientes){
            totalRecebido = elem.pagar(totalCobranca);
        }
    }

    public double getTotalRecebido() {
        return totalRecebido;
    }

    public void setTotalCobranca(double totalCobranca) {
        this.totalCobranca = totalCobranca;
    }
    
    public void addCliente(double valorCarteira){
        clientes.add(new Cliente(valorCarteira));
    }
}
