/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presenter;

import view.MenuView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author nitro
 */
public class MenuPresenter {
    MenuView view;

    public MenuPresenter() {
        view = new MenuView();
        configurar();
        view.setVisible(true);
    }
        
    private void configurar(){
        view.getBtnIncluir().addActionListener(new ActionListener() {
            InclusaoFuncionarioPresenter presenter;

            @Override
            public void actionPerformed(ActionEvent evt) {
                try{
                    presenter = new InclusaoFuncionarioPresenter();
                }catch(Exception e){
                    exibirMensagem("Erro" + e.getMessage(), "Erro", 0);
                }
            }
        });
        
        view.getBtnConsultar().addActionListener(new ActionListener() {
            ConsultaPresenter presenter;
            @Override
            public void actionPerformed(ActionEvent evt){
                try{
                    presenter = new ConsultaPresenter();
                }catch(Exception e){
                    exibirMensagem("Erro" + e.getMessage(), "Erro", 0);
                }
            }
        });
    }
    
    private void exibirMensagem(String mensagem, String titulo, int type){
        JOptionPane.showMessageDialog(view, mensagem, titulo,type);
    }
}
