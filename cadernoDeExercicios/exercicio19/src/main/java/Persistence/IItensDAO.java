/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Persistence;

import java.util.List;
import model.Item;

/**
 *
 * @author nitro5WIN10
 */
public interface IItensDAO {
    public void create(Item item);
    public List<Item> read();
    public void update(Item item);
    public void delete(Item item);
}
