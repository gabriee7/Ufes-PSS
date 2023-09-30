/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.pss.resolucaoexercicio;

/**
 *
 * @author nitro
 */
public class Item {
    private Produto produto;
    private double precoUnitario;
    private int quantidade;
    private double valorTotal;

    public Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.precoUnitario = produto.getValorUnitario();
        this.quantidade = quantidade;
        this.valorTotal = precoUnitario * quantidade;
    }    

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
        setValorTotal(precoUnitario * this.quantidade);
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        setValorTotal(this.precoUnitario * quantidade);

    }

    private void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
   
    
    @Override
    public String toString() {
        return "Item{" + "produto=" + produto + ", precoUnitario=" + precoUnitario + ", quantidade=" + quantidade + ", valorTotal=" + valorTotal + '}';
    }
    
}
