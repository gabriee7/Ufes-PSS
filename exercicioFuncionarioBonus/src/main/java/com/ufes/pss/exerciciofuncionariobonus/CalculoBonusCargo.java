/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.pss.exerciciofuncionariobonus;

/**
 *
 * @author nitro
 */
public class CalculoBonusCargo implements IMetodoCalculoBonus{
    @Override
    public void calcular(Funcionario funcionario){
        if(seAplica(funcionario)){
            double valorBonus = 0;
            double salarioBase = funcionario.getSalarioBase();
            String cargo = funcionario.getCargo();
            
            switch (cargo) {
                case "Junior":
                    valorBonus = salarioBase * 0.20;
                    break;
                case "Pleno":
                    valorBonus = salarioBase * 0.40;
                    break;
                case "Senior":
                    valorBonus = salarioBase * 0.60;
                    break;
                default:
            }
            
            if(valorBonus > 0)
                funcionario.addBonus(new Bonus("Bonus cargo", valorBonus));
        }
    }
    private boolean seAplica(Funcionario funcionario){
        return !"".equals(funcionario.getCargo());
    }
}
