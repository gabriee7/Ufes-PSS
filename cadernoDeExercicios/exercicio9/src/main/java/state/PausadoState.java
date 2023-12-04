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
public class PausadoState extends TocadorMusicaState{
    @Override
    public void tocar(TocadorMusica tocador){
        tocador.setEstado(new TocandoState());
        System.out.println("tocando...\n");
    }
    
    @Override
    public void parar(TocadorMusica tocador){
        tocador.setEstado(new ParadoState());
        System.out.println("parando...\n");
    }
}
