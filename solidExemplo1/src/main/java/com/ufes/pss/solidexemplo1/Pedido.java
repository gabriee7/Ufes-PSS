/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.pss.solidexemplo1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nitro
 */
public class Pedido {
    private Cliente cliente;
    private String bairroEndereco;
    private ArrayList<String> status;
    private double valorTaxa;
    private double valorTotal;
    
    public Pedido(String cliente, String tipo, String endereco, double valorTotal){
        this.cliente = new Cliente(cliente, tipo);
        this.bairroEndereco = endereco;
        this.valorTaxa = 0;
        this.valorTotal = valorTotal;
        this.status = new ArrayList<>();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getBairroEndereco() {
        return bairroEndereco;
    }

    public ArrayList<String> getStatus() {
        return status;
    }

    public double getValorTaxa() {
        return valorTaxa;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setBairroEndereco(String bairroEndereco) {
        this.bairroEndereco = bairroEndereco;
    }

    public void setStatus(String status) {
        this.status.add(status);
    }

    public void setValorTaxa(double valorTaxa) {
        this.valorTaxa = valorTaxa;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    public String toString(){
        return "\n\nNome: " + cliente.getNome() +
                "\nTipo: " + cliente.getTipo() + 
                "\nBairro: " + bairroEndereco + 
                "\nStatus: " + status.get(status.size() - 1) +
                "\nValor Taxa: R$ " + valorTaxa +
                "\nValor Total: R$ " + valorTotal;
    }
}
