/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state;

import model.TocadorMusica;

/**
 *
 * @author nitro5WIN10
 */
public abstract class TocadorMusicaState {
    
    public void tocar(TocadorMusica tocador){
        throw new RuntimeException("Não é possível realizar esta operação.");
    }
    
    public void pausar(TocadorMusica tocador){
        throw new RuntimeException("Não é possível realizar esta operação.");
    }
    
    public void parar(TocadorMusica tocador){
        throw new RuntimeException("Não é possível realizar esta operação.");
    }
    
}
