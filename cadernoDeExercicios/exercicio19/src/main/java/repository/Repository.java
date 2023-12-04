/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import Persistence.ItensDAOSQLite;
import Persistence.PedidosDAOSQLite;
import Persistence.ProdutosDAOSQLite;
import model.Item;
import model.Pedido;
import model.Produto;
import service.GerenciadorItens;
import service.GerenciadorPedidos;
import service.GerenciadorProdutos;

/**
 *
 * @author nitro5WIN10
 */
public class Repository {
        Item item;
        Pedido pedido;
        Produto produto;
        GerenciadorItens gerenciadorItens;
        GerenciadorPedidos gerenciadorPedido ;
        GerenciadorProdutos gerenciadorProdutos;
                
    public Repository(Item item, Pedido pedido, Produto produto) {
        this.item = item;
        this.pedido = pedido;
        this.produto = produto;
        
        this.gerenciadorItens = new GerenciadorItens(new ItensDAOSQLite());
        this.gerenciadorPedido = new GerenciadorPedidos(new PedidosDAOSQLite());
        this.gerenciadorProdutos = new GerenciadorProdutos(new ProdutosDAOSQLite());
        teste();
    }
      

    private void teste(){
        gerenciadorItens.inserir(item);
        gerenciadorItens.atualizar(item);
        gerenciadorItens.excluir(item);


        gerenciadorPedido.inserir(pedido);
        gerenciadorPedido.atualizar(pedido);
        gerenciadorPedido.excluir(pedido);


        gerenciadorProdutos.inserir(produto);
        gerenciadorProdutos.atualizar(produto);
        gerenciadorProdutos.excluir(produto);
    }
}
