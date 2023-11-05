/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import collection.FuncionarioCollection;
import java.util.ArrayList;
import model.Funcionario;

/**
 *
 * @author nitro
 */
public class MetodoConsultaTodos implements IConsultaFuncionario {
    @Override
    public ArrayList<Funcionario> processar(FuncionarioCollection colecao){
        return colecao.getFuncionarios();
    }
        
}
