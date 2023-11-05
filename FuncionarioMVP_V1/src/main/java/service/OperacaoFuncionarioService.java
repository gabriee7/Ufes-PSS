/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import collection.FuncionarioCollection;
import java.util.ArrayList;
import model.Funcionario;
import presenter.ConsultaPresenter;
import presenter.VisualizaFuncionarioPresenter;

/**
 *
 * @author nitro
 */
public class OperacaoFuncionarioService {
    private FuncionarioCollection instanciaColecao;
    public static OperacaoFuncionarioService instancia;
    private IIncluirFuncionario metodoInclusao;
    private IConsultaFuncionario metodoConsulta;
    private IVisualizaFuncionario metodoVisualiza;
    private IExcluiFuncionario metodoExclusao;

    private OperacaoFuncionarioService() {
        this.instanciaColecao = FuncionarioCollection.getInstancia();        
    }
    
    public static OperacaoFuncionarioService getInstancia(){
        if(instancia == null){
            instancia = new OperacaoFuncionarioService();
        }
        return instancia;
    }
    
    public boolean incluirFuncionario(IIncluirFuncionario metodo, Funcionario funcionario){
        boolean retorno;
        if(metodo == null)
            throw new RuntimeException("parametro metodo igual a null");
        else if(this.instanciaColecao == null)
            throw new RuntimeException("instancia colecao igual a null");
        else if(funcionario == null)
            throw new RuntimeException("parametro funcionario igual a null");
        else{
            setMetodoIncluir(metodo);
            retorno = this.metodoInclusao.processar(instanciaColecao, funcionario);
            if(retorno)
               new ConsultaPresenter();
            return retorno;
        }
    }
    
    public ArrayList<Funcionario> consultar(IConsultaFuncionario metodo){
        if(metodo == null)
            throw new RuntimeException("parametro metodo igual a null");
        else if(this.instanciaColecao == null)
            throw new RuntimeException("instancia colecao igual a null");
        else{
            setMetodoConsultar(metodo);
            return this.metodoConsulta.processar(instanciaColecao);
        }
    }
        
    public Funcionario visualizar(IVisualizaFuncionario metodo, String nome){
        Funcionario retorno;
        setMetodoVisualizar(metodo);
        retorno = this.metodoVisualiza.processar(instanciaColecao, nome);
        if(retorno != null)
            new VisualizaFuncionarioPresenter(retorno);
        else{
            throw new RuntimeException("nome nao encontrado na coleção");
        }
        
        return retorno;
    }
    
    public boolean excluiFuncionario(IExcluiFuncionario metodo, String nome){
        setMetodoExclui(metodo);
        return this.metodoExclusao.processar(instanciaColecao, nome);
    }
    
    public Funcionario consultaPorIndice(int indice){        
        return instanciaColecao.getFuncionarios().get(indice);
    }
    
    private void setMetodoExclui(IExcluiFuncionario metodo){
        this.metodoExclusao = metodo;
    }
    
    private void setMetodoVisualizar(IVisualizaFuncionario metodo){
       this.metodoVisualiza = metodo;
    }
   
    private void setMetodoConsultar(IConsultaFuncionario metodo){
        this.metodoConsulta = metodo;
    }
    
    private void setMetodoIncluir(IIncluirFuncionario metodo){
        this.metodoInclusao = metodo;
    }
}
