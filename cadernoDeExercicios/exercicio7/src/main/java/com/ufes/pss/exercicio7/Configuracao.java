/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.pss.exercicio7;

/**
 *
 * @author nitro
 */
public class Configuracao {
    private static Configuracao instancia = null;
    private String dado;

    private Configuracao() {
    }

    public static Configuracao getInstancia() {
        if(instancia == null)
            instancia = new Configuracao();
        return instancia;
    }

    public void setDado(String dado) {
        this.dado = dado;
    }

    @Override
    public String toString() {
        return "Configuracao{" + "dado=" + dado + '}';
    }
    
}
