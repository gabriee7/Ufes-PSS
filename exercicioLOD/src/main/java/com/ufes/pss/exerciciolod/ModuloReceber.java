/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.pss.exerciciolod;

/**
 *
 * @author nitro
 */
public class ModuloReceber implements IModuloRecebimento{
    @Override
    public double processar(Cliente cliente, double valor){
        return cliente.pagar(valor);
    }
}
