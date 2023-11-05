package presenter;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Funcionario;
import service.ExcluiCompleto;
import service.MetodoConsultaTodos;
import service.OperacaoFuncionarioService;
import service.VisualizaPorNome;
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
    private ConsultaFuncionarioView view;
    private VisualizaFuncionarioPresenter visualizaPresenter;
    private DefaultTableModel tblModelo;
    private OperacaoFuncionarioService service;

    public ConsultaPresenter() {
        this.service = OperacaoFuncionarioService.getInstancia();
        this.view = new ConsultaFuncionarioView();
        this.tblModelo = (DefaultTableModel)view.getTblConsulta().getModel(); //nao é a melhor abordagem para boas praticas
        view.setVisible(false);
        configurar();
        view.setVisible(true);
    }

    private void configurar(){
        this.view.addWindowFocusListener(new WindowFocusListener(){
            
            @Override
            public void windowGainedFocus(WindowEvent e) {
                atualizaTabela();
            }

            @Override
            public void windowLostFocus(WindowEvent e) {
                atualizaTabela();            
            }
        });
        
        this.view.getBtnVisualizar().addActionListener(new ActionListener(){
            @Override 
            public void actionPerformed(ActionEvent evt){
                try{
                    visualizarFuncionario();
                }catch(Exception e){
                    exibirMensagem("Erro:" + e.getMessage(), "Erro", 0);
                }
            }
        });
        this.view.getBtnVisualizar().setVisible(true);
        
        this.view.getBtnFechar().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                try{
                    fechar();
                }catch(Exception e){
                    exibirMensagem("Erro:" + e.getMessage(), "Erro", 0);
                }
            }
        });
        this.view.getBtnExcluir().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                try{ 
                    excluirFuncionario();
                }catch(Exception e){
                    exibirMensagem("Erro:" + e.getMessage(), "Erro", 0);
                }
            }
        });
        
        atualizaTabela();
    }
    
    private void atualizaTabela(){
        ArrayList<Funcionario> atualizado = service.consultar(new MetodoConsultaTodos());
        tblModelo.setRowCount(0);
        
        if(atualizado != null && tblModelo != null){
            for(Funcionario elem : atualizado){
                tblModelo.addRow(new Object[]{elem.getNome() , elem.getCargo(), elem.getSalarioBase()});
            }
        }else{
            throw new RuntimeException("erro ao tentar atualizar.");
        }
        
    }

    private void visualizarFuncionario(){
        int linhaSelecionada = view.getTblConsulta().getSelectedRow();
        
        if(linhaSelecionada == -1){
            throw new RuntimeException("Nenhuma linha selecionada!!");
        }else{
            String nome = tblModelo.getValueAt(linhaSelecionada, 0).toString();
            service.visualizar(new VisualizaPorNome(), nome);
        }
    }
    
    private void excluirFuncionario(){
        int linhaSelecionada = view.getTblConsulta().getSelectedRow();
        
        if(linhaSelecionada == -1){
            throw new RuntimeException("Nenhuma linha selecionada!!");
        }else{
            String nome = tblModelo.getValueAt(linhaSelecionada, 0).toString();
            int escolha = JOptionPane.showConfirmDialog(null, "Deseja excluir "+ nome + "?", "Confirmação", JOptionPane.YES_NO_OPTION);
         
            if(escolha == JOptionPane.YES_OPTION){ 
                service.excluiFuncionario(new ExcluiCompleto(), nome);
                atualizaTabela();
                JOptionPane.showMessageDialog(view, "Excluído com sucesso!");
            }
        }
    }
    
    private void fechar(){
        this.view.setVisible(false);
    }

    private void exibirMensagem(String mensagem, String titulo, int type){
        JOptionPane.showMessageDialog(view, mensagem, titulo,type);
    }
}