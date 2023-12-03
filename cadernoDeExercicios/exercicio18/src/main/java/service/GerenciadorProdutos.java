/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import Persistence.IProdutosDAO;
import java.util.List;
import model.Produto;

/**
 *
 * @author nitro5WIN10
 */
public class GerenciadorProdutos {
    private IProdutosDAO produtosDAO;

    public GerenciadorProdutos(IProdutosDAO produtosDAO) {
        this.produtosDAO = produtosDAO;
    }

    public void inserir(Produto produto){
        produtosDAO.create(produto);
    }
    
    public List<Produto> listaTodos(){
        return produtosDAO.read();
    }
    
    public void atualizar(Produto produto){
        produtosDAO.update(produto);
    }

    public void excluir(Produto produto){
        produtosDAO.delete(produto);
    }    
}
