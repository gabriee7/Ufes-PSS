/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.pss.exercicio6;

/**
 *
 * @author nitro
 */
public class CalculaTempoViagemService {
    private IMetodoTransporteStrategy metodo;

    public CalculaTempoViagemService(IMetodoTransporteStrategy metodo) {
        this.metodo = metodo;
    }

    public void setMetodo(IMetodoTransporteStrategy metodo) {
        this.metodo = metodo;
    }

    public double calcular(double distancia){
        return metodo.calcular(distancia);
    }
}
