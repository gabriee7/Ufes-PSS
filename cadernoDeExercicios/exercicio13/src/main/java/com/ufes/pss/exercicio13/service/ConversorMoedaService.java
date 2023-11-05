/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.pss.exercicio13.service;

/**
 *
 * @author nitro
 */
public class ConversorMoedaService {
    private IFormasConversaoAdapter metodo;

    public ConversorMoedaService(IFormasConversaoAdapter metodo) {
        this.metodo = metodo;
    }

    public void setMetodo(IFormasConversaoAdapter metodo) {
        this.metodo = metodo;
    }
    
    public double converter(){
        return metodo.converter();
    }
}
