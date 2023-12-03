/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistence;

import java.util.ArrayList;
import model.Pedido;

/**
 *
 * @author nitro5WIN10
 */
public class PedidosDAOSQLite implements IPedidosDAO {
    @Override
    public void create(Pedido pedido){
        System.out.print("\nCriado\n");
    }
    
    @Override
    public ArrayList<Pedido> read(){
        System.out.print("\nlistado\n");
        return (new ArrayList<Pedido>());
    }
    
    @Override
    public void update(Pedido pedido){
        System.out.print("\natualizado\n");
    }
    
    @Override
    public void delete(Pedido pedido){
        System.out.print("\nexcluido\n");
    }
}
