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
public class Acao {
    private long codigo;
    private String nome;
    private LocalDate dataCotacao;
    private double preco;
    
    public Acao(long codigo, String nome, double preco){
        this.codigo = codigo;
        this.nome = nome;
        this.dataCotacao = LocalDate.now();
        this.preco = preco;
    }

    public LocalDate getDataCotacao() {
        return dataCotacao;
    }

    public double getPreco() {
        return preco;
    }
}
