/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import com.ufes.pss.exercicio14.Produto;
import com.ufes.pss.exercicio14.Usuario;
import java.util.ArrayList;

/**
 *
 * @author nitro
 */
public class MetodoNotificaEstoque implements IObservador {
    private static MetodoNotificaEstoque instancia;
    private ArrayList<Usuario> inscritos;

    private MetodoNotificaEstoque() {
        this.inscritos = new ArrayList<>();
    }
    
    public static MetodoNotificaEstoque getInstancia(){
        if(instancia == null)
            instancia = new MetodoNotificaEstoque();
        
        return instancia;
    }
    
    @Override
    public void addUsuario(Usuario usuario){
        inscritos.add(usuario);
    }
    
    @Override
    public void notifica(Produto produto){
        if(instancia != null)
        for(Usuario ele: inscritos)
            System.out.println(ele.getNome() + " notificado pelo produto " + produto.getNome() + " no valor de R$ " + produto.getValor());
    }
}
