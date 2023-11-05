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
public class ExcluiCompleto implements IExcluiFuncionario{
    public boolean processar(FuncionarioCollection colecao, String nome){
        for(Funcionario ele: colecao.getFuncionarios()){
            if(ele.getNome().equalsIgnoreCase(nome)){
                colecao.removeFuncionario(ele);
                return true;
            }
        }
        return false;
    }
}
