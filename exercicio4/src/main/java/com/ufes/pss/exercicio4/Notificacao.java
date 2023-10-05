/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.pss.exercicio4;

import java.time.LocalDate;

/**
 *
 * @author nitro
 */
public class Notificacao {
    private final Acao acao;
    private LocalDate dataLocacao;
    private double preco;

    public Notificacao(Acao acao, LocalDate dataLocacao, double preco) {
        this.acao = acao;
        this.dataLocacao = dataLocacao;
        this.preco = preco;
    }

    public Acao getAcao() {
        return acao;
    }

    public LocalDate getDataLocacao() {
        return dataLocacao;
    }

    public double getPreco() {
        return preco;
    }
    
    
}
