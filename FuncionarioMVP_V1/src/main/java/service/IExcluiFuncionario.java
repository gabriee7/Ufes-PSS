/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import collection.FuncionarioCollection;
import model.Funcionario;

/**
 *
 * @author nitro
 */
public interface IExcluiFuncionario {
    public boolean processar(FuncionarioCollection colecao, String nome);
}
