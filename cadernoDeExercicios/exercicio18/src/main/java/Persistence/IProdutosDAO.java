/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Persistence;

import java.util.List;
import model.Produto;

/**
 *
 * @author nitro5WIN10
 */
public interface IProdutosDAO {
    public void create(Produto produto);
    public List<Produto> read();
    public void update(Produto produto);
    public void delete(Produto produto);
}
