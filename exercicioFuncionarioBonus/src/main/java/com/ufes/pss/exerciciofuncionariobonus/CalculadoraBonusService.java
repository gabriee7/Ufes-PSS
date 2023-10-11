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
public class CalculadoraBonusService {
    private ArrayList<IMetodoCalculoBonus> metodos;

    public CalculadoraBonusService() {
        this.metodos = new ArrayList<>();
        this.metodos.add(new CalculoBonusCargo());
        this.metodos.add(new CalculoBonusHoraExtra());
        this.metodos.add(new CalculoBonusSalarioBase());       
    }
    
    public void processar(Funcionario funcionario){
        for(IMetodoCalculoBonus elem: metodos){
            elem.calcular(funcionario);
        }
    }
  
}
