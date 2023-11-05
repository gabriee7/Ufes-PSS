/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ufes.pss.exercicio14;

import service.MetodoNotificaEstoque;
import service.ObservadorService;

/**
 *
 * @author nitro
 */
public class Principal {

    public static void main(String[] args) {
        Usuario user = new Usuario("Gabriel");
        Produto produto = new Produto("Notebook", 0, 3000);
        ObservadorService service= new ObservadorService(MetodoNotificaEstoque.getInstancia());
        
        service.addUsuarioObservador(MetodoNotificaEstoque.getInstancia(), user);
        service.notifica(MetodoNotificaEstoque.getInstancia(), produto);
        
        produto.setQuantidade(70);
        service.notifica(MetodoNotificaEstoque.getInstancia(), produto);
    
    }
}
