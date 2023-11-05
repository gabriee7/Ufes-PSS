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
public class VisualizaPorNome implements IVisualizaFuncionario {
    @Override
    public Funcionario processar(FuncionarioCollection colecao, String nome){
        for(Funcionario ele : colecao.getFuncionarios()){
            if(ele.getNome().equalsIgnoreCase(nome)){
                return ele;
            }
        }
        return null;
    }
}
