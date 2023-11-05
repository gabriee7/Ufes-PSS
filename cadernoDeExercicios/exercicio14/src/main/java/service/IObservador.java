/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import com.ufes.pss.exercicio14.Produto;
import com.ufes.pss.exercicio14.Usuario;

/**
 *
 * @author nitro
 */
public interface IObservador {
    public void notifica(Produto produto);
    public void addUsuario(Usuario usuario);
}
