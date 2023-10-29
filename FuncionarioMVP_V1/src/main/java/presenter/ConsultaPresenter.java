package presenter;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.collections.FuncionarioCollection;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import model.Consulta;
import model.Funcionario;
import view.ConsultaFuncionarioView;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nitro
 */
public class ConsultaPresenter {
    private Consulta model;
    private ConsultaFuncionarioView view;
    private VisualizaFuncionarioPresenter visualizaPresenter;
    private DefaultTableModel tblModelo;

    public ConsultaPresenter() {
        this.model = new Consulta();
        this.view = new ConsultaFuncionarioView();
        this.tblModelo = (DefaultTableModel)view.getTblConsulta().getModel();
        configurar();
        view.setVisible(false);
    }

    private void configurar(){
        this.view.getBtnVisualizar().addActionListener(new ActionListener(){
            @Override 
            public void actionPerformed(ActionEvent evt){
                visualizar();
            }
        });
        this.view.getBtnVisualizar().setVisible(true);
        this.view.getBtnFechar().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                fechar();
            }
        });
        this.view.getBtnExcluir().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                excluir();
            }
        });
    }
    
    public void atualizaTbl(ArrayList<Funcionario> funcionarios){
        tblModelo.setRowCount(0);
        
        for(Funcionario elem : funcionarios){
            tblModelo.addRow(new Object[]{elem.getNome() , elem.getCargo(), elem.getSalarioBase()});
        }
        view.setVisible(true);
    }

    private void visualizar(){
        int linhaSelecionada = view.getTblConsulta().getSelectedRow();
        
        if(linhaSelecionada == -1){
            JOptionPane.showMessageDialog(view, "Nenhuma linha selecionada!!");
        }else{
            visualizaPresenter = new VisualizaFuncionarioPresenter(FuncionarioCollection.getInstancia().getFuncionarios().get(linhaSelecionada));
        }
    }
    
    private void excluir(){
        int linhaSelecionada = view.getTblConsulta().getSelectedRow();
        if(linhaSelecionada == -1){
            JOptionPane.showMessageDialog(view, "Nenhuma linha selecionada!!");
        }else{
            int escolha = JOptionPane.showConfirmDialog(null, "Deseja excluir?", "Confirmação", JOptionPane.YES_NO_OPTION);
         
            if(escolha == JOptionPane.YES_OPTION){ 
                FuncionarioCollection.getInstancia().removeFuncionario(FuncionarioCollection.getInstancia().getFuncionarios().get(linhaSelecionada));
                JOptionPane.showMessageDialog(view, "Excluído com sucesso!");
            }
        }
    }
    
    private void fechar(){
        this.view.setVisible(false);
    }

}