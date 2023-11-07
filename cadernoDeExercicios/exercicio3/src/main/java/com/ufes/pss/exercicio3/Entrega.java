/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.pss.exercicio3;

/**
 *
 * @author nitro
 */
public class Entrega {
    private String tipo;
    private double peso;
    private double distancia;
    private double preco;

    public Entrega(String tipo, double peso, double distancia) {
        this.tipo = tipo;
        this.peso = peso;
        this.distancia = distancia;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPeso() {
        return peso;
    }

    public double getDistancia() {
        return distancia;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Entrega{" + "tipo=" + tipo + ", peso=" + peso + ", distancia=" + distancia + ", preco=" + preco + '}';
    }
    
    
}
