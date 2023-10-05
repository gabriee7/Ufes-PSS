/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.pss.exerciciolod;

/**
 *
 * @author nitro
 */
public class ModuloPagar implements IModuloPagamento{
    @Override
    public double processar(Carteira carteira, double valor){
        if(valor > carteira.getValor()){
            throw new RuntimeException("Saldo Insuficiente!!");
        }else{
            double valorPago = 0;
            carteira.setValor(carteira.getValor() - valor);
            valorPago = valor;
            return valorPago;
        }
    }
}
