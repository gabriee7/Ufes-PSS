/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import com.ufes.pss.taxaent.Pedido;

/**
 *
 * @author nitro
 */
public class Principal {
    public static void main(String[] args) {
        Pedido p1 = new Pedido("Gabriel", "GOLD", "GUARAREMA", 15.0);
        p1.getTaxaEntrega().processarTaxa(p1);

        System.out.println(p1.toString());
        
    }
}
