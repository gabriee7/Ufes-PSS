/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Funcionario;
import service.MetodoIncluiSimples;
import service.OperacaoFuncionarioService;
import view.InclusaoFuncionarioView;

/**
 *
 * @author nitro
 */
public class InclusaoFuncionarioPresenter {
    InclusaoFuncionarioView view;
    OperacaoFuncionarioService service;

    public InclusaoFuncionarioPresenter() {
        this.view = new InclusaoFuncionarioView();
        this.service = OperacaoFuncionarioService.getInstancia();
        configurar();
    }

    private void salvar(){
        boolean retorno;
        String nome = view.getTxtNome().getText();
        String cargo = view.getTxtCargo().getText();
        String salarioBaseString = view.getTxtSalarioBase().getText();
        double salarioBase = 0;     
        
        //verifica campo salario
        if(!salarioBaseString.equals("")){
            salarioBase = Double.parseDouble(view.getTxtSalarioBase().getText());
        }else{
            throw new RuntimeException("Campo salario base vazio!");
        }
        
        //verifica campo salario, nome, cargo
        if(salarioBase < 0){
            throw new RuntimeException("Campo salario base inválido!");
        }else if(nome.trim().isEmpty()){
            throw new RuntimeException("Campo nome vazio!");
        }else if(cargo.isEmpty()){
            throw new RuntimeException("Campo cargo vazio!");
        }else{
            retorno = service.incluirFuncionario(new MetodoIncluiSimples(), new Funcionario(nome, cargo, salarioBase));
            if(retorno){
                exibirMensagem(nome.split(" ")[0] + " salvo com sucesso!", "Cadastrado", 1);
                limpaCampos();
            }else{
                throw new RuntimeException("Erro ao tentar salvar");
            }
        }
    }
    
    private void configurar(){
        limpaCampos();
        this.view.getBtnSalvar().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                try{
                    salvar();
                    fechar();
                }catch (RuntimeException e) {
                    exibirMensagem("Erro: " + e.getMessage(), "Erro", 0);
                }
            }
        });
        
        this.view.getBtnFechar().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                try{    
                    fechar();
                }catch(Exception e){
                    exibirMensagem("Erro: " + e.getMessage(), "Erro", 0);
                }
            }
        });
        
        this.view.setVisible(true);
    }
    
    private void fechar(){
        limpaCampos();
        this.view.setVisible(false);
    }
    
    private void limpaCampos(){
        this.view.getTxtNome().setText("");
        this.view.getTxtCargo().setText("");
        this.view.getTxtSalarioBase().setText("");   
    }
    
    private void exibirMensagem(String mensagem, String titulo, int type){
        JOptionPane.showMessageDialog(view, mensagem, titulo,type);
    }
}
