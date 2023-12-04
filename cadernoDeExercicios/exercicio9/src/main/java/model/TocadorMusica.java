package model;


import model.Musica;
import state.TocadorMusicaState;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nitro5WIN10
 */
public class TocadorMusica {
    
    private TocadorMusicaState estado;

    public TocadorMusica(TocadorMusicaState estado) {
        this.estado = estado;
    }
    
    public void tocar(Musica musica){
        estado.tocar(this);
    }
    
    public void pausar(Musica musica){
        estado.pausar(this);
    }
    
    public void parar(Musica musica){
        estado.parar(this);
    }

    public void setEstado(TocadorMusicaState estado) {
        this.estado = estado;
    }
    
    
}
