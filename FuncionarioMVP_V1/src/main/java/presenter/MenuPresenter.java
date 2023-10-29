/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presenter;

import model.collections.FuncionarioCollection;
import view.MenuView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author nitro
 */
public class MenuPresenter {
    MenuView view;

    public MenuPresenter() {
        view = new MenuView();
        configura();
        view.setVisible(true);
    }
        
    private void configura(){
        view.getBtnIncluir().addActionListener(new ActionListener() {
            InclusaoFuncionarioPresenter presenter;

            @Override
            public void actionPerformed(ActionEvent evt) {
                try{
                    presenter = new InclusaoFuncionarioPresenter();
                }catch(Exception e){
                    System.out.print(e);
                }
            }
        });
        
        view.getBtnConsultar().addActionListener(new ActionListener() {
            ConsultaPresenter presenter;
            @Override
            public void actionPerformed(ActionEvent evt){
                try{
                    presenter = new  ConsultaPresenter();
                    presenter.atualizaTbl(FuncionarioCollection.getInstancia().getFuncionarios());
                }catch(Exception e){
                    System.out.print(e);
                }
            }
        });
    }
}
