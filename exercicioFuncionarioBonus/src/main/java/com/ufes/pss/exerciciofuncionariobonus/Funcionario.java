/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.pss.exerciciofuncionariobonus;

import java.util.ArrayList;

/**
 *
 * @author nitro
 */
public class Funcionario {
    private String nome;
    private String cargo;
    private double salarioBase;
    private double salarioFinal;
    private double horaExtra;
    private ArrayList<Bonus> bonusRecebido;

    public Funcionario(String nome, String cargo, double salarioBase, double horaExtra) {
        this.nome = nome;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.horaExtra = horaExtra;
        this.salarioFinal = salarioBase;
        this.bonusRecebido = new ArrayList<>();
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getHoraExtra() {
        return horaExtra;
    }

    private void setValorBonus(double valor) {
        this.salarioFinal +=  valor;
    }
    
    public void addBonus(Bonus bonus){
        bonusRecebido.add(bonus);
        setValorBonus(bonus.getValor());
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", cargo=" + cargo + ", salarioBase=" + salarioBase + ", salarioFinal=" + salarioFinal + ", horaExtra=" + horaExtra + ", bonusRecebido=" + bonusRecebido + '}';
    }

}
