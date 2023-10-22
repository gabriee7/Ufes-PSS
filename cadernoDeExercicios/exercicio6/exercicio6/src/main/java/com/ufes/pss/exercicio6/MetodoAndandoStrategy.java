package com.ufes.pss.exercicio6;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nitro
 */
public class MetodoAndandoStrategy implements IMetodoTransporteStrategy {
    @Override
    public double calcular(double distancia){
        return distancia * 0.9;
    }
}
