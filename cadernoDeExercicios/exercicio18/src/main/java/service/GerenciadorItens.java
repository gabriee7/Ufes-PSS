/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import Persistence.IItensDAO;
import Persistence.IItensDAO;
import java.util.List;
import model.Item;

/**
 *
 * @author nitro5WIN10
 */
public class GerenciadorItens{
    private IItensDAO itensDAO;

    public GerenciadorItens(IItensDAO itensDAO) {
        this.itensDAO = itensDAO;
    }

    public void inserir(Item item){
        itensDAO.create(item);
    }
    
    public List<Item> listaTodos(){
        return itensDAO.read();
    }
    
    public void atualizar(Item item){
        itensDAO.update(item);
    }

    public void excluir(Item item){
        itensDAO.delete(item);
    }    
}
