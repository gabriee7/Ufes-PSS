/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.pss.resolucaoexercicio;

/**
 *
 * @author nitro
 */
public class Produto {
    private String nome;
    private String categoria;
    private double valorUnitario;
    private int quantidade;

    public Produto(String nome, String categoria, double valorUnitario, int quantidade) {
        this.nome = nome;
        this.categoria = categoria;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoriaProduto() {
        return categoria;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", categoria=" + categoria + ", valorUnitario=" + valorUnitario + ", quantidade=" + quantidade + '}';
    }
    
    
}
