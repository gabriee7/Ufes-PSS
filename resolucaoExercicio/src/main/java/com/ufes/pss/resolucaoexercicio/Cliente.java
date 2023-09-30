/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.pss.resolucaoexercicio;

/**
 *
 * @author nitro
 */
public class Cliente {
    private String nome;
    private String tipo;
    private String logradouro;
    private String bairro;
    private String cidade;
    
    public Cliente(String nome, String tipo, String logradouro, String bairro, String cidade){
        this.nome = nome;
        this.tipo = tipo;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", tipo=" + tipo + ", logradouro=" + logradouro + ", bairro=" + bairro + ", cidade=" + cidade + '}';
    }
    
}
