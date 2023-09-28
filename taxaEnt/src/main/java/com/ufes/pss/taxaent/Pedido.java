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
public class Pedido {
    private Cliente cliente;
    private String bairroEndereco;
    private double valorTotal;
    private TaxaEntrega taxaEntrega;
    
    public Pedido(String cliente, String tipo, String endereco, double valorTotal){
        this.cliente = new Cliente(cliente, tipo);
        this.bairroEndereco = endereco;
        this.valorTotal = valorTotal;
        this.taxaEntrega = new TaxaEntrega();
        this.taxaEntrega.processarTaxa(this);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getBairroEndereco() {
        return bairroEndereco;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setBairroEndereco(String bairroEndereco) {
        this.bairroEndereco = bairroEndereco;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    public TaxaEntrega getTaxaEntrega(){
        return taxaEntrega;
    } 
    
    @Override
    public String toString(){
        return "\n\nNome: " + cliente.getNome() +
                "\nTipo: " + cliente.getTipo() + 
                "\nBairro: " + bairroEndereco + 
                "\nMétodos:"+ taxaEntrega.getMetodos() +
                "\nValor Desconto Entrega: " + taxaEntrega.getValorDescontos() * -1 +
                "\nValor Taxa Entrega: " + taxaEntrega.getValorTaxa() +
                "\nValor Total: R$ " + valorTotal;
    }
}
