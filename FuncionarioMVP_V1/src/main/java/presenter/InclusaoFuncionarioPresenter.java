/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Funcionario;
import model.collections.FuncionarioCollection;
import model.InclusaoFuncionario;
import view.InclusaoFuncionarioView;

/**
 *
 * @author nitro
 */
public class InclusaoFuncionarioPresenter {
    InclusaoFuncionarioView view;
    InclusaoFuncionario model; 

    public InclusaoFuncionarioPresenter() {
        this.view = new InclusaoFuncionarioView();
        this.model = new InclusaoFuncionario();
        configurar();
    }

    private void salvar(){
        String nome = view.getTxtNome().getText();
        String cargo = view.getTxtCargo().getText();
        double salarioBase = Double.parseDouble(view.getTxtSalarioBase().getText());
        
        if(nome.isEmpty()){
            JOptionPane.showMessageDialog(view, "Campo nome vazio!");
        }else if(cargo.isEmpty()){
            JOptionPane.showMessageDialog(view, "Campo cargo vazio!");
        }else if(salarioBase < 0){
            JOptionPane.showMessageDialog(view, "Campo salario base inválido!");
        }else{
            FuncionarioCollection.getInstancia().setFuncionario(new Funcionario(nome, cargo, salarioBase));
            JOptionPane.showMessageDialog(view, nome.split(" ")[0] + " salvo com sucesso!");
            limpaCampos();
        }
    }
        
    private void fechar(){
        limpaCampos();
        this.view.setVisible(false);
    }
    
    private void limpaCampos(){
        this.view.getTxtNome().setText("");
        this.view.getTxtCargo().setText("");
        this.view.getTxtSalarioBase().setText("");   
        this.view.setVisible(false);
    }
        private void configurar(){
        limpaCampos();
        this.view.getBtnSalvar().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                try{
                    salvar();
                }catch(Exception e){
                    System.out.print(e);
                }
            }
        });
        
        this.view.getBtnFechar().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                try{    
                    fechar();
                }catch(Exception e){
                    System.out.print(e);
                }
            }
        });
        
        this.view.setVisible(true);
    }

}
