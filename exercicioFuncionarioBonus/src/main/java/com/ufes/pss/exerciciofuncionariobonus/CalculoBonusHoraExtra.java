/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.pss.exerciciofuncionariobonus;

/**
 *
 * @author nitro
 */
public class CalculoBonusHoraExtra implements IMetodoCalculoBonus{
    @Override
    public void calcular(Funcionario funcionario){
        if(seAplica(funcionario)){
            double valorBonus = 0;
            double salarioBase = funcionario.getSalarioBase();
            double horaExtra = funcionario.getHoraExtra();
            
            if(horaExtra < 10){
                valorBonus = salarioBase * 0.30;
            }else if(horaExtra < 20){
                valorBonus = salarioBase * 0.40;
            }else if(horaExtra < 40){
                valorBonus = salarioBase * 0.60;
            }
            
            if(valorBonus > 0)
                funcionario.addBonus(new Bonus("Bonus calculo hora extra", valorBonus));
        }
    }
    
    private boolean seAplica(Funcionario funcionario){
        return funcionario.getHoraExtra() > 0;
    }
}
