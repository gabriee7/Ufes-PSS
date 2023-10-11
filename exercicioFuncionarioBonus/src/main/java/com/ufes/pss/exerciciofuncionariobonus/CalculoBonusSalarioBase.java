/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.pss.exerciciofuncionariobonus;

/**
 *
 * @author nitro
 */
public class CalculoBonusSalarioBase implements IMetodoCalculoBonus{
    @Override
    public void calcular(Funcionario funcionario){
        if(seAplica(funcionario)){
            double valorBonus = 0;
            double salarioBase = funcionario.getSalarioBase();
            
            if(salarioBase < 1500){
                valorBonus = salarioBase * 0.30;
            }else if(salarioBase < 2500){
                valorBonus = salarioBase * 0.40;
            }else if(salarioBase < 4000){
                valorBonus = salarioBase * 0.60;
            }
            
            if(valorBonus > 0)
                funcionario.addBonus(new Bonus("Bonus calculo salario base", valorBonus));
        }
    }
    
    private boolean seAplica(Funcionario funcionario){
        return funcionario.getSalarioBase() > 0;
    }
}
