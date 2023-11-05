/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import collection.FuncionarioCollection;
import model.Funcionario;

/**
 *
 * @author nitro
 */
public class MetodoIncluiSimples implements IIncluirFuncionario {
    @Override
    public boolean processar(FuncionarioCollection colecao, Funcionario funcionario){
        if(funcionario == null){
            return false;
        }else{
            colecao.setFuncionario(funcionario);
            return true;
        }
    }
}
