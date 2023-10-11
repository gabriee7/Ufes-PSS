/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ufes.pss.exerciciofuncionariobonus;

/**
 *
 * @author nitro
 */
public class Principal {

    public static void main(String[] args) {
        try{
            Funcionario f1 = new Funcionario("Gabriel", "Junior", 600, 25);
            CalculadoraBonusService calculadora = new CalculadoraBonusService();

            calculadora.processar(f1);

            System.out.print("Resultado: "+f1.toString());
        }
        catch(Exception e){
            System.err.println(e);
        }
    }

}
