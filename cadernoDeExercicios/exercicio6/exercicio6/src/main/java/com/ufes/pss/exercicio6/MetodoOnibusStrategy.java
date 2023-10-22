/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.pss.exercicio6;

/**
 *
 * @author nitro
 */
public class MetodoOnibusStrategy implements IMetodoTransporteStrategy {
    @Override
    public double calcular(double distancia){
        return distancia * 0.3;
    }
}
