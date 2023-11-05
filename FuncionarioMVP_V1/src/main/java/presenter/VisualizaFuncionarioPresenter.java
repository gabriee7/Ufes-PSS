/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Funcionario;
import service.ExcluiCompleto;
import service.OperacaoFuncionarioService;
import service.VisualizaPorNome;
import view.VisualizaFuncionarioView;

/**
 *
 * @author nitro
 */
public class VisualizaFuncionarioPresenter {
    private VisualizaFuncionarioView view;
    private OperacaoFuncionarioService service;
    Funcionario funcionario;

    public VisualizaFuncionarioPresenter(Funcionario funcionario) {
        this.service = OperacaoFuncionarioService.getInstancia();
        this.view = new VisualizaFuncionarioView();
        this.view.setVisible(false);
        this.funcionario = funcionario;
        configurar();
        preencheCampos();
        this.view.setVisible(true);
    }
    
    private void configurar(){
        view.getTxtNome().setEditable(false);
        view.getTxtCargo().setEditable(false);
        view.getTxtSalarioBase().setEditable(false);
        limpaCampos();
        view.getBtnFechar().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                try{
                    fechar();
                }catch(Exception e){
                    exibirMensagem("Erro:" + e.getMessage(), "Erro", 0);
                }
            }
        });
        
        view.getBtnExcluir().addActionListener(new ActionListener(){
            @Override 
            public void actionPerformed(ActionEvent evt){
                try{
                    excluir();
                }catch(Exception e){
                    exibirMensagem("Erro:" + e.getMessage(), "Erro", 0);
                }
            }
        });
        
    }
  
    private void preencheCampos(){
        view.getTxtNome().setText(funcionario.getNome());
        view.getTxtCargo().setText(funcionario.getCargo());
        view.getTxtSalarioBase().setText(Double.toString(funcionario.getSalarioBase()));
    }

        
    private void fechar(){
        limpaCampos();
        this.view.setVisible(false);
    }
    
    private void excluir(){
        int escolha = JOptionPane.showConfirmDialog(null, "Deseja excluir "+ this.funcionario.getNome() + "?", "Confirmação", JOptionPane.YES_NO_OPTION);
         
        if(escolha == JOptionPane.YES_OPTION){ 
            service.excluiFuncionario(new ExcluiCompleto(), this.funcionario.getNome());
            exibirMensagem("Excluido com Sucesso!", "Exclusao", 2);
            view.setVisible(false);
        }
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
