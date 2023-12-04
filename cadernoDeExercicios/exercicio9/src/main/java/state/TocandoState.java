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
public class TocandoState extends TocadorMusicaState {
    @Override
    public void pausar(TocadorMusica tocador){
        tocador.setEstado(new PausadoState());
        System.out.println("pausando...\n");
    }
    
    @Override
    public void parar(TocadorMusica tocador){
        tocador.setEstado(new ParadoState());
        System.out.println("parando...\n");
    }
}
