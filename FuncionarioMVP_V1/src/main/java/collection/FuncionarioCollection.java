/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection;

import java.util.ArrayList;
import model.Funcionario;

/**
 *
 * @author nitro
 */
public class FuncionarioCollection {
    private static FuncionarioCollection instancia;
    private ArrayList<Funcionario> funcionarios;

    private FuncionarioCollection() {
        funcionarios = new ArrayList<>();
    }

    public static FuncionarioCollection getInstancia() {
        if (instancia == null) {
            instancia = new FuncionarioCollection();
        }
        return instancia;
    }

    public void setFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }
    
    public void removeFuncionario(Funcionario removerFuncionario){
        funcionarios.remove(removerFuncionario);
    }
}