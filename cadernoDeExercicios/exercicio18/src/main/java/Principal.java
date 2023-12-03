
import Persistence.ItensDAOSQLite;
import Persistence.PedidosDAOSQLite;
import Persistence.ProdutosDAOSQLite;
import model.Item;
import model.Pedido;
import model.Produto;
import service.GerenciadorItens;
import service.GerenciadorPedidos;
import service.GerenciadorProdutos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author nitro5WIN10
 */
public class Principal {

    public static void main(String[] args) {
        Item item = new Item("item");
        Pedido pedido = new Pedido("pedido");
        Produto produto =  new Produto("produto");
        
        GerenciadorItens gerenciadorItens = new GerenciadorItens(new ItensDAOSQLite());
       GerenciadorPedidos gerenciadorPedido = new GerenciadorPedidos(new PedidosDAOSQLite());
    GerenciadorProdutos gerenciadorProdutos = new GerenciadorProdutos(new ProdutosDAOSQLite());
    
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
