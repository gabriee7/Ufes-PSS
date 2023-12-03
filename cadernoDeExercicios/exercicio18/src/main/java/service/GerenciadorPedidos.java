/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import Persistence.IPedidosDAO;
import java.util.List;
import model.Pedido;

/**
 *
 * @author nitro5WIN10
 */
public class GerenciadorPedidos {
    private IPedidosDAO pedidosDAO;

    public GerenciadorPedidos(IPedidosDAO pedidosDAO) {
        this.pedidosDAO = pedidosDAO;
    }

    public void inserir(Pedido pedido){
        pedidosDAO.create(pedido);
    }
    
    public List<Pedido> listaTodos(){
        return pedidosDAO.read();
    }
    
    public void atualizar(Pedido pedido){
        pedidosDAO.update(pedido);
    }

    public void excluir(Pedido pedido){
        pedidosDAO.delete(pedido);
    }    
}
