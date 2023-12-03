/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistence;

import java.util.ArrayList;
import model.Produto;

/**
 *
 * @author nitro5WIN10
 */
public class ProdutosDAOSQLite implements IProdutosDAO {
        @Override
    public void create(Produto produto){
        System.out.print("\nCriado\n");
    }
    
    @Override
    public ArrayList<Produto> read(){
        System.out.print("\nlistado\n");
        return (new ArrayList<Produto>());
    }
    
    @Override
    public void update(Produto produto){
        System.out.print("\natualizado\n");
    }
    
    @Override
    public void delete(Produto produto){
        System.out.print("\nexcluido\n");
    }
}
