/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.pss.resolucaoexercicio;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author nitro
 */
public class Pedido {
    private final LocalDate data;
    private double valorTaxaEntrega = 10; //set padrão R$10
    private double valorTotal = 0;
    private final long numero;
    private final Cliente cliente;
    private ArrayList<CupomDescontoEntrega> cupons = new ArrayList<>();
    private ArrayList<Item> itens = new ArrayList<>();

    public Pedido(double valorTotal, long numero, Cliente cliente) {
        this.data = LocalDate.now();
        this.numero = numero;
        this.cliente = cliente;
    }
    
    public void addCupomEntrega(String metodo, double valor){
        cupons.add(new CupomDescontoEntrega(metodo, valor));
        setValorCupomDesconto(valor);
    }
    
    public void addItem(Produto produto, int quantidade){
        itens.add(new Item(produto, quantidade));
        setValorTotal(valorTotal + (produto.getValorUnitario() * quantidade));
    }

    public double getValorTaxaEntrega() {
        return valorTaxaEntrega;
    }

    private void setValorCupomDesconto(double valor) {
        valorTaxaEntrega -= valor;
        setValorTotal(valorTotal - valorTaxaEntrega);
    }

    public String getBairro(){
        return cliente.getBairro();
    }
    
    public String getTipoCliente(){
        return cliente.getTipo();
    }

    public double getValorTotal() {
        return valorTotal;
    }
    
    private void setValorTotal(double valor){
        valorTotal = valor;
    }

    @Override
    public String toString() {
        return "Pedido{" + "data=" + data + ", valorTaxaEntrega=" + valorTaxaEntrega + ", valorTotal=" + valorTotal + ", numero=" + numero + ", cliente=" + cliente + ", cupons=" + cupons + ", itens=" + itens + '}';
    }
    
}
