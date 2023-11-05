/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import com.ufes.pss.exercicio14.Produto;
import com.ufes.pss.exercicio14.Usuario;

/**
 *
 * @author nitro
 */
public class ObservadorService {
    private IObservador observador;

    public ObservadorService(IObservador observador) {
        this.observador = observador;
    }

    public void setMetodo(IObservador observador) {
        this.observador = observador;
    }
    
    public void addUsuarioObservador(IObservador metodo, Usuario usuario){
        setMetodo(metodo);
        metodo.addUsuario(usuario);
    }

    public void notifica(IObservador metodo, Produto produto){
        setMetodo(metodo);
        metodo.notifica(produto);
    }
}
