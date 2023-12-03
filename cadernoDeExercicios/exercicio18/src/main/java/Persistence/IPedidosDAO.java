/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Persistence;

import java.util.List;
import model.Pedido;

/**
 *
 * @author nitro5WIN10
 */
public interface IPedidosDAO {
    public void create(Pedido pedido);
    public List<Pedido> read();
    public void update(Pedido pedido);
    public void delete(Pedido pedido);
}
