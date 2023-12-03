/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistence;

import java.util.ArrayList;
import java.util.List;
import model.Item;

/**
 *
 * @author nitro5WIN10
 */
public class ItensDAOSQLite implements IItensDAO {
    @Override
    public void create(Item item){
        System.out.print("\nCriado\n");
    }
    
    @Override
    public ArrayList<Item> read(){
        System.out.print("\nlistado\n");
        return (new ArrayList<Item>());
    }
    
    @Override
    public void update(Item item){
        System.out.print("\natualizado\n");
    }
    
    @Override
    public void delete(Item item){
        System.out.print("\nexcluido\n");
    }
}
