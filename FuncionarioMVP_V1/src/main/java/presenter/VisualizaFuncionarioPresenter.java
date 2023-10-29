/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Funcionario;
import model.Visualiza;
import model.collections.FuncionarioCollection;
import view.VisualizaFuncionarioView;

/**
 *
 * @author nitro
 */
public class VisualizaFuncionarioPresenter {
    private VisualizaFuncionarioView view;
    private Visualiza model;
    Funcionario funcionario;

    public VisualizaFuncionarioPresenter(Funcionario funcionario) {
        this.view = new VisualizaFuncionarioView();
        this.model = new Visualiza();
        this.funcionario = funcionario;
        configurar();
        visualiza(funcionario);
        this.view.setVisible(true);
    }
    
    private void configurar(){
        view.getTxtNome().setEditable(false);
        view.getTxtCargo().setEditable(false);
        view.getTxtSalarioBase().setEditable(false);
        view.getTxtNome().setText("");
        view.getTxtCargo().setText("");
        view.getTxtSalarioBase().setText("");
        view.getBtnFechar().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                try{
                    fechar();
                }catch(Exception e){
                    System.out.print(e);
                }
            }
        });
        
        view.getBtnExcluir().addActionListener(new ActionListener(){
            @Override 
            public void actionPerformed(ActionEvent evt){
                excluir();
            }
        });
        
    }
    
    private void visualiza(Funcionario funcionario){
        view.getTxtNome().setText(funcionario.getNome());
        view.getTxtCargo().setText(funcionario.getCargo());
        view.getTxtSalarioBase().setText(Double.toString(funcionario.getSalarioBase()));
    }
        
    private void fechar(){
        this.view.getTxtNome().setText("");
        this.view.getTxtCargo().setText("");
        this.view.getTxtSalarioBase().setText("");
        this.view.setVisible(false);
    }
    
    private void excluir(){
        int escolha = JOptionPane.showConfirmDialog(null, "Deseja excluir?", "Confirmação", JOptionPane.YES_NO_OPTION);
         
        if(escolha == JOptionPane.YES_OPTION){ 
            FuncionarioCollection.getInstancia().removeFuncionario(this.funcionario);
            JOptionPane.showMessageDialog(view, "Excluído com sucesso!");
            view.setVisible(false);
        }
    }
}
